package typingsSlinky.shevyjs.anon

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
trait PartialOptions extends js.Object {
  var addMarginBottom: js.UndefOr[Boolean] = js.undefined
  var baseFontScale: js.UndefOr[Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth] = js.undefined
  var baseFontSize: js.UndefOr[String] = js.undefined
  var baseLineHeight: js.UndefOr[Double] = js.undefined
  var proximity: js.UndefOr[Boolean] = js.undefined
  var proximityFactor: js.UndefOr[Factor] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    addMarginBottom: js.UndefOr[Boolean] = js.undefined,
    baseFontScale: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth = null,
    baseFontSize: String = null,
    baseLineHeight: js.UndefOr[Double] = js.undefined,
    proximity: js.UndefOr[Boolean] = js.undefined,
    proximityFactor: js.UndefOr[Factor] = js.undefined
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addMarginBottom)) __obj.updateDynamic("addMarginBottom")(addMarginBottom.get.asInstanceOf[js.Any])
    if (baseFontScale != null) __obj.updateDynamic("baseFontScale")(baseFontScale.asInstanceOf[js.Any])
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(baseLineHeight)) __obj.updateDynamic("baseLineHeight")(baseLineHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(proximity)) __obj.updateDynamic("proximity")(proximity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(proximityFactor)) __obj.updateDynamic("proximityFactor")(proximityFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

