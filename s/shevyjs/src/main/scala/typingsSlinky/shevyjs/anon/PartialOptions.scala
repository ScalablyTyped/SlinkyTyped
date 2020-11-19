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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddMarginBottom(value: Boolean): Self = this.set("addMarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddMarginBottom: Self = this.set("addMarginBottom", js.undefined)
    
    @scala.inline
    def setBaseFontScaleVarargs(value: Factor*): Self = this.set("baseFontScale", js.Array(value :_*))
    
    @scala.inline
    def setBaseFontScale(value: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth): Self = this.set("baseFontScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseFontScale: Self = this.set("baseFontScale", js.undefined)
    
    @scala.inline
    def setBaseFontSize(value: String): Self = this.set("baseFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseFontSize: Self = this.set("baseFontSize", js.undefined)
    
    @scala.inline
    def setBaseLineHeight(value: Double): Self = this.set("baseLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseLineHeight: Self = this.set("baseLineHeight", js.undefined)
    
    @scala.inline
    def setProximity(value: Boolean): Self = this.set("proximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProximity: Self = this.set("proximity", js.undefined)
    
    @scala.inline
    def setProximityFactor(value: Factor): Self = this.set("proximityFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProximityFactor: Self = this.set("proximityFactor", js.undefined)
  }
}
