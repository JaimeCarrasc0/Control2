<template>
	<div class="container">
		<h1>Todos los usuarios</h1>
		<ul class="item-list">
			<li v-for="item in items" :key="item.user_id">
				{{ item.name }}
				<v-row align="center" justify="space-around">
					<v-btn tile color="success" :to="`/users/${item.user_id}/update`">
						<v-icon left>
							mdi-pencil
						</v-icon>
						Editar
					</v-btn>
					<v-btn tile color="success" @click="send(item.user_id)">
						<v-icon left>
							mdi-pencil
						</v-icon>
						Eliminar
					</v-btn>
				</v-row>
			</li>
		</ul>
		<div v-if="items.length == 0" class="empty-list">
			<em>No se han cargado los datos</em>
		</div>
	</div>
</template>

<script>
	export default {
		data() {
			return {
				//Lista de ítems a mostrar
				items: [],
			};
		},
		
		methods: {
			getData: async function () {
				try {
					let response = await this.$axios.get("/user/all");
					this.items = response.data;
					console.log(response);
				} catch (error) {
					console.log("error", error);
				}
			},
			send: function (id) {
                try {
                    let ruta = "/user/delete/" + id;
                    let result = await this.$axios.delete(ruta);
                    let user = result.data;
                    console.log("Usuario eliminado con exito")
					window.location.reload();
                } catch (error) {
                    console.log('error', error)
                }
            }
			
		},
		created: function () {
			this.getData();
		},
	};
</script>