package typingsSlinky.semanticUiVisibility.SemanticUI.Visibility

import typingsSlinky.jquery.JQueryCoordinates
import typingsSlinky.semanticUiVisibility.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementCalculations extends ElementPosition {
  var bottom: Double = js.native
  var bottomPassed: Boolean = js.native
  var bottomVisible: Boolean = js.native
  var margin: js.UndefOr[Bottom] = js.native
  var offScreen: Boolean = js.native
  var onScreen: Boolean = js.native
  var passing: Boolean = js.native
  var percentagePassed: Double = js.native
  var pixelsPassed: Double = js.native
  var top: Double = js.native
  var topPassed: Boolean = js.native
  var topVisible: Boolean = js.native
}

object ElementCalculations {
  @scala.inline
  def apply(
    bottom: Double,
    bottomPassed: Boolean,
    bottomVisible: Boolean,
    fits: Boolean,
    height: Double,
    offScreen: Boolean,
    offset: JQueryCoordinates,
    onScreen: Boolean,
    passing: Boolean,
    percentagePassed: Double,
    pixelsPassed: Double,
    top: Double,
    topPassed: Boolean,
    topVisible: Boolean,
    width: Double
  ): ElementCalculations = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomPassed = bottomPassed.asInstanceOf[js.Any], bottomVisible = bottomVisible.asInstanceOf[js.Any], fits = fits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offScreen = offScreen.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onScreen = onScreen.asInstanceOf[js.Any], passing = passing.asInstanceOf[js.Any], percentagePassed = percentagePassed.asInstanceOf[js.Any], pixelsPassed = pixelsPassed.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topPassed = topPassed.asInstanceOf[js.Any], topVisible = topVisible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCalculations]
  }
  @scala.inline
  implicit class ElementCalculationsOps[Self <: ElementCalculations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomPassed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomPassed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentagePassed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentagePassed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelsPassed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsPassed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopPassed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topPassed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMargin(value: Bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
  }
  
}

