package fdez.collados.fco.javier.t02p03.views

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fdez.collados.fco.javier.t02p03.R
import fdez.collados.fco.javier.t02p03.views.components.ArtWorkPage

@Composable
fun HomeView(modifier: Modifier = Modifier) {

    var currentPainting by remember { mutableIntStateOf(0) }

    Surface (
        modifier = modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        when(currentPainting) {

            0 -> {
                ArtWorkPage(
                    artworkImageResource = R.drawable.aun_aprendo,
                    imageContentDescriptionResource = R.string.aun_aprendo_content_description,
                    artworkTitleResource = R.string.aun_aprendo_title,
                    artworkAuthorResource = R.string.aun_aprendo_author,
                    onBtnPrevClick = {
                        currentPainting = 9
                    },
                    onBtnNextClick = {
                        ++currentPainting
                    }
                )
            }
            1 -> {
                ArtWorkPage(
                    artworkImageResource = R.drawable.entierro_conde_orgaz,
                    imageContentDescriptionResource = R.string.conde_orgaz_content_description,
                    artworkTitleResource = R.string.entierro_conde_orgaz_title,
                    artworkAuthorResource = R.string.entierro_conde_orgar_author,
                    onBtnPrevClick = {
                        --currentPainting
                    },
                    onBtnNextClick = {
                        ++currentPainting
                    }
                )
            }
            2 -> {
                ArtWorkPage(
                    artworkImageResource = R.drawable.guernica,
                    imageContentDescriptionResource = R.string.guernica_content_description,
                    artworkTitleResource = R.string.guernica,
                    artworkAuthorResource = R.string.guernica_author,
                    onBtnPrevClick = {
                        --currentPainting
                    },
                    onBtnNextClick = {
                        ++currentPainting
                    }
                )
            }
            3 -> {
                ArtWorkPage(
                    artworkImageResource = R.drawable.la_chiquita_piconera,
                    imageContentDescriptionResource = R.string.chiquita_content_description,
                    artworkTitleResource = R.string.chiquita_piconera_title,
                    artworkAuthorResource = R.string.chiquita_piconera_author,
                    onBtnPrevClick = {
                        --currentPainting
                    },
                    onBtnNextClick = {
                        ++currentPainting
                    }
                )
            }
            4 -> {
                ArtWorkPage(
                    artworkImageResource = R.drawable.las_meninas,
                    imageContentDescriptionResource = R.string.las_meninas_content_description,
                    artworkTitleResource = R.string.las_meninas_title,
                    artworkAuthorResource = R.string.las_meninas_author,
                    onBtnPrevClick = {
                        --currentPainting
                    },
                    onBtnNextClick = {
                        ++currentPainting
                    }
                )
            }
            5 -> {
                ArtWorkPage(
                    artworkImageResource = R.drawable.mujer_pajaro_estrella,
                    imageContentDescriptionResource = R.string.mujer_pajaro_content_description,
                    artworkTitleResource = R.string.mujer_pajaro_title,
                    artworkAuthorResource = R.string.mujer_pajaro_author,
                    onBtnPrevClick = {
                        --currentPainting
                    },
                    onBtnNextClick = {
                        ++currentPainting
                    }
                )
            }
            6 -> {
                ArtWorkPage(
                    artworkImageResource = R.drawable.paseo_a_orillas_del_mar,
                    imageContentDescriptionResource = R.string.seashore_content_description,
                    artworkTitleResource = R.string.seashore_title,
                    artworkAuthorResource = R.string.seashore_author,
                    onBtnPrevClick = {
                        --currentPainting
                    },
                    onBtnNextClick = {
                        ++currentPainting
                    }
                )
            }
            7 -> {
                ArtWorkPage(
                    artworkImageResource = R.drawable.sorpresa_del_trigo,
                    imageContentDescriptionResource = R.string.wheat_surprise_content_description,
                    artworkTitleResource = R.string.wheat_surprise_title,
                    artworkAuthorResource = R.string.wheat_surprise_author,
                    onBtnPrevClick = {
                        --currentPainting
                    },
                    onBtnNextClick = {
                        ++currentPainting
                    }
                )
            }
            8 -> {
                ArtWorkPage(
                    artworkImageResource = R.drawable.tentacion_san_antonio_dali,
                    imageContentDescriptionResource = R.string.san_antinio_content_description,
                    artworkTitleResource = R.string.san_antonio_title,
                    artworkAuthorResource = R.string.san_antinio_author,
                    onBtnPrevClick = {
                        --currentPainting
                    },
                    onBtnNextClick = {
                        ++currentPainting
                    }
                )
            }
            9 -> {
                ArtWorkPage(
                    artworkImageResource = R.drawable.uvas_melon_murillo,
                    imageContentDescriptionResource = R.string.grapes_melon_content_description,
                    artworkTitleResource = R.string.grapes_melon_title,
                    artworkAuthorResource = R.string.grapes_melon_author,
                    onBtnPrevClick = {
                        --currentPainting
                    },
                    onBtnNextClick = {
                        currentPainting = 0
                    }
                )
            }

        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun HomeViewPreview() {
    HomeView()
}