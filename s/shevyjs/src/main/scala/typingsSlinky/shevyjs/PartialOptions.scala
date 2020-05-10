package typingsSlinky.shevyjs

import typingsSlinky.shevyjs.shevyjsStrings.augmentedFourth
import typingsSlinky.shevyjs.shevyjsStrings.majorSecond
import typingsSlinky.shevyjs.shevyjsStrings.majorThird
import typingsSlinky.shevyjs.shevyjsStrings.minorThird
import typingsSlinky.shevyjs.shevyjsStrings.perfectFourth
import typingsSlinky.shevyjs.typesMod.Factor
import typingsSlinky.shevyjs.typesMod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<shevyjs.shevyjs/types.Options> */
@js.native
trait PartialOptions extends js.Object {
  var addMarginBottom: js.UndefOr[Boolean] = js.native
  var baseFontScale: js.UndefOr[Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth] = js.native
  var baseFontSize: js.UndefOr[String] = js.native
  var baseLineHeight: js.UndefOr[Double] = js.native
  var proximity: js.UndefOr[Boolean] = js.native
  var proximityFactor: js.UndefOr[Factor] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def withoutAddMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMarginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseFontScale(value: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseFontScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontScale")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withProximity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProximity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximity")(js.undefined)
        ret
    }
    @scala.inline
    def withProximityFactor(value: Factor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximityFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProximityFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximityFactor")(js.undefined)
        ret
    }
  }
  
}

