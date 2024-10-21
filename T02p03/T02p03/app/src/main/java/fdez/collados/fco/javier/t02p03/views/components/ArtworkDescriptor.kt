package fdez.collados.fco.javier.t02p03.views.components

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import fdez.collados.fco.javier.t02p03.R

@Composable
fun ArtworkDescriptor(
    artworkTitleResource: Int,
    artworkAuthorResource: Int,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .padding(
                start = dimensionResource(R.dimen.sixteen_dp),
                end = dimensionResource(R.dimen.sixteen_dp),
                bottom = dimensionResource(R.dimen.eight_dp)
            ),
    ) {
        Text(
            text = stringResource(artworkTitleResource),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 24.sp,
            textAlign = TextAlign.Start
        )

        Text(
            text = stringResource(artworkAuthorResource),
            textAlign = TextAlign.Start,
            fontFamily = FontFamily(Font(R.font.satisfy))
        )

    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ArtworkDescriptorPreview() {
    ArtworkDescriptor(
        artworkTitleResource = R.string.guernica,
        artworkAuthorResource = R.string.guernica_author
    )
}