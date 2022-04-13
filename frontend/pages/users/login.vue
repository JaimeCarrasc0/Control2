<template>
    <v-row justify="center" align="center">
        <v-col cols="12" sm="8" md="6">
            <v-card>
                <v-card-title class="headline">
                    Iniciar Sesión
                </v-card-title>

                
                <v-form>
                    <v-container>
                        <v-row>
                            <v-col
                            cols="12"
                            sm="12">
                            <v-text-field
                                v-model="mail"
                                label="Correo Electrónico"
                                filled
                            ></v-text-field>

                            </v-col>
                        </v-row>
                        <v-row>
                            <v-col
                            cols="12"
                            sm="12"
                            >
                            <v-text-field
                                type="password"
                                v-model="Pass"
                                label="Contraseña"
                                filled
                            ></v-text-field>
                            </v-col>
                        </v-row>
                    </v-container>


                </v-form>

                <v-card-actions>
                    <v-spacer />
                    <v-btn color="primary" nuxt to="../">
                        Iniciar Sesión
                    </v-btn>
                </v-card-actions>
            </v-card>
        </v-col>
    </v-row>
</template>

<script>
    export default {
        name: 'IndexPage'
    }
</script>