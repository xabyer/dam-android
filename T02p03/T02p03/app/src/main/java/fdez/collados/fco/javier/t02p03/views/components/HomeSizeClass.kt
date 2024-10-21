package fdez.collados.fco.javier.t02p03.views.components

import androidx.compose.material3.windowsizeclass.WindowHeightSizeClass
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import fdez.collados.fco.javier.t02p03.R

// Compact = Smartphone vertical
// Medium = Tablet vertical / Fold
// Expanded = Smartphone horizontal / Tablet horizontal


@Composable
fun HomeSizeClass(
    windowSizeClass: WindowSizeClass,
    artworkImageResource: Int,
    imageContentDescriptionResource: Int,
    artworkTitleResource: Int,
    artworkAuthorResource: Int,
    onBtnPrevClick: () -> Unit,
    onBtnNextClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    when(windowSizeClass.heightSizeClass) {
        WindowHeightSizeClass.Compact -> {
            ArtWorkPage(
                artworkImageResource = artworkImageResource,
                imageContentDescriptionResource = imageContentDescriptionResource,
                artworkTitleResource = artworkTitleResource,
                artworkAuthorResource = artworkAuthorResource,
                onBtnPrevClick = onBtnPrevClick,
                onBtnNextClick = onBtnNextClick,
                imageSize = dimensionResource(R.dimen.compact_img_size),
                modifier = modifier,
            )
        }

        WindowHeightSizeClass.Medium -> {
            ArtWorkPage(
                artworkImageResource = artworkImageResource,
                imageContentDescriptionResource = imageContentDescriptionResource,
                artworkTitleResource = artworkTitleResource,
                artworkAuthorResource = artworkAuthorResource,
                onBtnPrevClick = onBtnPrevClick,
                onBtnNextClick = onBtnNextClick,
                imageSize = dimensionResource(R.dimen.medium_img_size),
                modifier = modifier,
            )
        }

        WindowHeightSizeClass.Expanded -> {
            ArtWorkPage(
                artworkImageResource = artworkImageResource,
                imageContentDescriptionResource = imageContentDescriptionResource,
                artworkTitleResource = artworkTitleResource,
                artworkAuthorResource = artworkAuthorResource,
                onBtnPrevClick = onBtnPrevClick,
                onBtnNextClick = onBtnNextClick,
                imageSize = dimensionResource(R.dimen.expanded_img_size),
                modifier = modifier,
            )
        }
    }
}