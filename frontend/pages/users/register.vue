<template>
    <v-row justify="center" align="center">
        <v-col cols="12" sm="8" md="6">
            <v-card>
                <v-card-title class="headline">
                    Registrar usuario
                </v-card-title>

                
                <v-form>
                    <v-container>
                    <v-row>
                        <v-col
                        cols="12"
                        sm="6"
                        >
                        <v-text-field
                            v-model="first"
                            label="Nombre"
                            filled
                        ></v-text-field>
                        </v-col>

                        <v-col
                        cols="12"
                        sm="6"
                        >
                        <v-text-field
                            v-model="last"
                            label="Apellido"
                            filled
                        ></v-text-field>
                        </v-col>
                    </v-row>
                    </v-container>
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
                            sm="6"
                            >
                            <v-text-field
                                type="password"
                                v-model="Pass"
                                label="Contraseña"
                                filled
                            ></v-text-field>
                            </v-col>

                            <v-col
                            cols="12"
                            sm="6"
                            >
                            <v-text-field
                                type="password"
                                v-model="Pass"
                                label="Confirmar contraseña"
                                filled
                            ></v-text-field>
                            </v-col>
                        </v-row>
                    </v-container>


                </v-form>

                <v-card-actions>
                    <v-spacer />
                    <v-btn color="primary" nuxt to="/inspire">
                        Registrar
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