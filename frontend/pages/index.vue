<template>
    <v-row justify="center" align="center">
        <v-col cols="12" sm="8" md="6">
            <v-card>
                <v-row justify="center">
                <v-img
                lazy-src="https://picsum.photos/id/11/10/6"
                max-height="300"
                max-width="500"
                src="https://picsum.photos/id/1080/500/300"
                ></v-img>
                </v-row>

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