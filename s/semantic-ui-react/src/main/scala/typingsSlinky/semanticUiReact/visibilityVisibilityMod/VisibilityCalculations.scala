package typingsSlinky.semanticUiReact.visibilityVisibilityMod

import typingsSlinky.semanticUiReact.semanticUiReactStrings.down
import typingsSlinky.semanticUiReact.semanticUiReactStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisibilityCalculations extends js.Object {
  var bottomPassed: Boolean = js.native
  var bottomVisible: Boolean = js.native
  var direction: down | up = js.native
  var fits: Boolean = js.native
  var height: Double = js.native
  var offScreen: Boolean = js.native
  var onScreen: Boolean = js.native
  var passing: Boolean = js.native
  var percentagePassed: Double = js.native
  var pixelsPassed: Double = js.native
  var topPassed: Boolean = js.native
  var topVisible: Boolean = js.native
  var width: Double = js.native
}

object VisibilityCalculations {
  @scala.inline
  def apply(
    bottomPassed: Boolean,
    bottomVisible: Boolean,
    direction: down | up,
    fits: Boolean,
    height: Double,
    offScreen: Boolean,
    onScreen: Boolean,
    passing: Boolean,
    percentagePassed: Double,
    pixelsPassed: Double,
    topPassed: Boolean,
    topVisible: Boolean,
    width: Double
  ): VisibilityCalculations = {
    val __obj = js.Dynamic.literal(bottomPassed = bottomPassed.asInstanceOf[js.Any], bottomVisible = bottomVisible.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fits = fits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offScreen = offScreen.asInstanceOf[js.Any], onScreen = onScreen.asInstanceOf[js.Any], passing = passing.asInstanceOf[js.Any], percentagePassed = percentagePassed.asInstanceOf[js.Any], pixelsPassed = pixelsPassed.asInstanceOf[js.Any], topPassed = topPassed.asInstanceOf[js.Any], topVisible = topVisible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityCalculations]
  }
  @scala.inline
  implicit class VisibilityCalculationsOps[Self <: VisibilityCalculations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDirection(value: down | up): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

