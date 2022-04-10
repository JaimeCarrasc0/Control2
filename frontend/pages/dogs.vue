<template>
  <div class="container">
    <h1>Todos los perros</h1>
    <ul class="item-list">
      <li v-for="(item, index) in items" :key="index">
        {{ item.name }}
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
        let response = await this.$axios.get("/dogs");
        this.items = response.data;
        console.log(response);
      } catch (error) {
        console.log("error", error);
      }
    },
  },
  created: function () {
    this.getData();
  },
};
</script>