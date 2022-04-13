<template>
    <v-row justify="center" align="center">
        <v-col cols="12" sm="8" md="6">
            <v-card class="logo py-4 d-flex justify-center">
                <img src="logotbd.svg">
            </v-card>
            <v-card>
                <v-card-title class="headline">
                    Bienvenid@ a Food USACH
                </v-card-title>
                <v-card-text>
                    <p>
                        Lugar donde puedes saltarte la fila pidiendo tu comida con anticipación
                    </p>
                </v-card-text>

                <v-card-actions>
                    <v-btn color="pink" nuxt to="/users/login">
                        Iniciar Sesión
                    </v-btn>
                </v-card-actions>
                <v-card-actions>
                    <v-btn color="green" nuxt to="/users/register">
                        Crear Usuario
                    </v-btn>
                </v-card-actions>

                <v-card-actions>
                    <v-spacer />
                    <v-btn color="primary" nuxt to="/inspire">
                        Continue
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