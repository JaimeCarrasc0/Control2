<template>
    <v-row justify="center" align="center">
        <v-col cols="12" sm="8" md="6">
            <v-card>
                <v-card-title class="headline">
                    Editar usuario
                </v-card-title>


                <v-form>
                    <v-container>
                        <v-row>
                            <v-col cols="12" sm="6">
                                <v-text-field v-model="newUser.name" label="Nombre" filled></v-text-field>
                            </v-col>

                            
                        </v-row>
                    </v-container>
                    <v-container>
                        <v-row>
                            
                        </v-row>
                        <v-row>
                            <v-col cols="12" sm="6">
                                <v-text-field type="password" v-model="newUser.password" label="Contraseña" filled>
                                </v-text-field>
                            </v-col>

                            <v-col cols="12" sm="6">
                                
                            </v-col>
                        </v-row>
                    </v-container>

                    <v-card-actions>
                        <v-spacer />
                        <v-btn color="primary" @click="send">
                            Editar
                        </v-btn>
                    </v-card-actions>

                </v-form>

            </v-card>
        </v-col>
    </v-row>
</template>

<script>
    export default {
        data() {
            return {
                newUser: {}
            }
        },
        methods: {
            send: async function () {
                try {
                    let result = await this.$axios.post('/user/create', this.newUser);
                    let user = result.data;
                    console.log("Usuario creado con exito")
                } catch (error) {
                    console.log('error', error)
                }
            }
        },
    }
</script>