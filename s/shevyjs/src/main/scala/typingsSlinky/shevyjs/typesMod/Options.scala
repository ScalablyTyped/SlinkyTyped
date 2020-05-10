package typingsSlinky.shevyjs.typesMod

import typingsSlinky.shevyjs.shevyjsStrings.augmentedFourth
import typingsSlinky.shevyjs.shevyjsStrings.majorSecond
import typingsSlinky.shevyjs.shevyjsStrings.majorThird
import typingsSlinky.shevyjs.shevyjsStrings.minorThird
import typingsSlinky.shevyjs.shevyjsStrings.perfectFourth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var addMarginBottom: Boolean = js.native
  var baseFontScale: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth = js.native
  var baseFontSize: String = js.native
  var baseLineHeight: Double = js.native
  var proximity: Boolean = js.native
  var proximityFactor: Factor = js.native
}

object Options {
  @scala.inline
  def apply(
    addMarginBottom: Boolean,
    baseFontScale: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth,
    baseFontSize: String,
    baseLineHeight: Double,
    proximity: Boolean,
    proximityFactor: Factor
  ): Options = {
    val __obj = js.Dynamic.literal(addMarginBottom = addMarginBottom.asInstanceOf[js.Any], baseFontScale = baseFontScale.asInstanceOf[js.Any], baseFontSize = baseFontSize.asInstanceOf[js.Any], baseLineHeight = baseLineHeight.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], proximityFactor = proximityFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMarginBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMarginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseFontScale(value: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProximity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProximityFactor(value: Factor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximityFactor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

