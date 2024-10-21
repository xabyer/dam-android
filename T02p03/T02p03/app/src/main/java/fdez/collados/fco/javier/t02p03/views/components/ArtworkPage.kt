package fdez.collados.fco.javier.t02p03.views.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fdez.collados.fco.javier.t02p03.R

@Composable
fun ArtWorkPage(
    artworkImageResource: Int,
    imageContentDescriptionResource: Int,
    artworkTitleResource: Int,
    artworkAuthorResource: Int,
    onBtnPrevClick: () -> Unit,
    onBtnNextClick: () -> Unit,
    modifier: Modifier = Modifier,
    imageSize: Dp = 200.dp,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(dimensionResource(R.dimen.sixteen_dp))
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Surface (
                tonalElevation = dimensionResource(R.dimen.sixteen_dp),
                shadowElevation = dimensionResource(R.dimen.sixteen_dp),
                border = BorderStroke(
                    width = dimensionResource(R.dimen.four_dp),
                    color = Color.LightGray
                ),
            ) {
                ArtworkWall(
                    artworkImageResource,
                    imageContentDescriptionResource,
                    imageSize = imageSize
                )
            }
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.thirty_two_dp)))

            Surface (
                tonalElevation = dimensionResource(R.dimen.sixteen_dp),
                shadowElevation = dimensionResource(R.dimen.eight_dp),
                border = BorderStroke(
                    width = dimensionResource(R.dimen.four_dp),
                    color = Color.LightGray
                ),
            ) {
                ArtworkDescriptor(
                    artworkTitleResource,
                    artworkAuthorResource
                )
            }
        }
        Surface (
            modifier = Modifier
                .align(Alignment.BottomCenter)
        ) {
            DisplayController(
                onBtnPrevClick,
                onBtnNextClick
            )
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ArtworkPagePreview() {
    ArtWorkPage(
        artworkImageResource = R.drawable.guernica,
        imageContentDescriptionResource = R.string.guernica_content_description,
        artworkTitleResource = R.string.guernica,
        artworkAuthorResource = R.string.guernica_author,
        onBtnPrevClick = {},
        onBtnNextClick = {},
        imageSize = dimensionResource(R.dimen.medium_img_size)
    )
}