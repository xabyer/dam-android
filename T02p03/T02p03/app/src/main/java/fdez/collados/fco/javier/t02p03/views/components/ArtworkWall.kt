package fdez.collados.fco.javier.t02p03.views.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fdez.collados.fco.javier.t02p03.R


@Composable
fun ArtworkWall(
    artworkImageResource: Int,
    imageContentDescriptionResource: Int,
    modifier: Modifier = Modifier
) {

    Image(
        painter = painterResource(artworkImageResource),
        contentDescription = stringResource(imageContentDescriptionResource),
        contentScale = ContentScale.Inside,
        modifier = modifier
            .padding( dimensionResource(R.dimen.sixteen_dp))
            .height(200.dp)
    )

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ArtworkWallPreview() {
    ArtworkWall(
        artworkImageResource = R.drawable.guernica,
        imageContentDescriptionResource = R.string.guernica_content_description
    )
}