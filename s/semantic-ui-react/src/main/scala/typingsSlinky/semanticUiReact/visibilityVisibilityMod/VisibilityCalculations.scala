package typingsSlinky.semanticUiReact.visibilityVisibilityMod

import typingsSlinky.semanticUiReact.semanticUiReactStrings.down
import typingsSlinky.semanticUiReact.semanticUiReactStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibilityCalculations extends js.Object {
  var bottomPassed: Boolean
  var bottomVisible: Boolean
  var direction: down | up
  var fits: Boolean
  var height: Double
  var offScreen: Boolean
  var onScreen: Boolean
  var passing: Boolean
  var percentagePassed: Double
  var pixelsPassed: Double
  var topPassed: Boolean
  var topVisible: Boolean
  var width: Double
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBottomPassed(value: Boolean): Self = this.set("bottomPassed", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomVisible(value: Boolean): Self = this.set("bottomVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: down | up): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setFits(value: Boolean): Self = this.set("fits", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffScreen(value: Boolean): Self = this.set("offScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnScreen(value: Boolean): Self = this.set("onScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassing(value: Boolean): Self = this.set("passing", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentagePassed(value: Double): Self = this.set("percentagePassed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelsPassed(value: Double): Self = this.set("pixelsPassed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopPassed(value: Boolean): Self = this.set("topPassed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopVisible(value: Boolean): Self = this.set("topVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

