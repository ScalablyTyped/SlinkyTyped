package typingsSlinky.vegaLite.srcMarkMod

import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectConfig[ES /* <: ExprRef | SignalRef */]
  extends RectBinSpacingMixins
     with MarkConfig[ES]
     with _AnyMarkConfig[ES] {
  
  /**
    * The default size of the bars on continuous scales.
    *
    * __Default value:__ `5`
    *
    * @minimum 0
    */
  var continuousBandSize: js.UndefOr[Double] = js.native
  
  /**
    * The default size of the bars with discrete dimensions. If unspecified, the default size is  `step-2`, which provides 2 pixel offset between bars.
    * @minimum 0
    */
  var discreteBandSize: js.UndefOr[Double] = js.native
}
object RectConfig {
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): RectConfig[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectConfig[ES]]
  }
  
  @scala.inline
  implicit class RectConfigMutableBuilder[Self <: RectConfig[_], ES /* <: ExprRef | SignalRef */] (val x: Self with RectConfig[ES]) extends AnyVal {
    
    @scala.inline
    def setContinuousBandSize(value: Double): Self = StObject.set(x, "continuousBandSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousBandSizeUndefined: Self = StObject.set(x, "continuousBandSize", js.undefined)
    
    @scala.inline
    def setDiscreteBandSize(value: Double): Self = StObject.set(x, "discreteBandSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscreteBandSizeUndefined: Self = StObject.set(x, "discreteBandSize", js.undefined)
  }
}
