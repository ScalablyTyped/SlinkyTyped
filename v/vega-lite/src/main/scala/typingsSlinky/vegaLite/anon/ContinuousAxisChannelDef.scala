package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.channeldefMod.PositionFieldDef
import typingsSlinky.vegaLite.compositemarkCommonMod.GenericCompositeMarkDef
import typingsSlinky.vegaLite.errorbandMod.ErrorBand
import typingsSlinky.vegaLite.errorbandMod.ErrorBandDef
import typingsSlinky.vegaLite.errorbarMod.ErrorBar
import typingsSlinky.vegaLite.errorbarMod.ErrorBarDef
import typingsSlinky.vegaLite.errorbarMod.ErrorEncoding
import typingsSlinky.vegaLite.transformMod.Transform
import typingsSlinky.vegaLite.vegaLiteStrings.x
import typingsSlinky.vegaLite.vegaLiteStrings.y
import typingsSlinky.vegaTypings.encodeMod.Orientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousAxisChannelDef[MD /* <: GenericCompositeMarkDef[M] with (ErrorBarDef | ErrorBandDef) */, M /* <: ErrorBar | ErrorBand */] extends StObject {
  
  var continuousAxis: x | y = js.native
  
  var continuousAxisChannelDef: PositionFieldDef[String] = js.native
  
  var encodingWithoutContinuousAxis: ErrorEncoding[String] = js.native
  
  var groupby: js.Array[String] = js.native
  
  var markDef: MD = js.native
  
  var outerSpec: Height = js.native
  
  var ticksOrient: Orientation = js.native
  
  var tooltipEncoding: ErrorEncoding[String] = js.native
  
  var transform: js.Array[Transform] = js.native
}
object ContinuousAxisChannelDef {
  
  @scala.inline
  def apply[MD /* <: GenericCompositeMarkDef[M] with (ErrorBarDef | ErrorBandDef) */, M /* <: ErrorBar | ErrorBand */](
    continuousAxis: x | y,
    continuousAxisChannelDef: PositionFieldDef[String],
    encodingWithoutContinuousAxis: ErrorEncoding[String],
    groupby: js.Array[String],
    markDef: MD,
    outerSpec: Height,
    ticksOrient: Orientation,
    tooltipEncoding: ErrorEncoding[String],
    transform: js.Array[Transform]
  ): ContinuousAxisChannelDef[MD, M] = {
    val __obj = js.Dynamic.literal(continuousAxis = continuousAxis.asInstanceOf[js.Any], continuousAxisChannelDef = continuousAxisChannelDef.asInstanceOf[js.Any], encodingWithoutContinuousAxis = encodingWithoutContinuousAxis.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], outerSpec = outerSpec.asInstanceOf[js.Any], ticksOrient = ticksOrient.asInstanceOf[js.Any], tooltipEncoding = tooltipEncoding.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousAxisChannelDef[MD, M]]
  }
  
  @scala.inline
  implicit class ContinuousAxisChannelDefMutableBuilder[Self <: ContinuousAxisChannelDef[_, _], MD /* <: GenericCompositeMarkDef[M] with (ErrorBarDef | ErrorBandDef) */, M /* <: ErrorBar | ErrorBand */] (val x: Self with (ContinuousAxisChannelDef[MD, M])) extends AnyVal {
    
    @scala.inline
    def setContinuousAxis(value: typingsSlinky.vegaLite.vegaLiteStrings.x | y): Self = StObject.set(x, "continuousAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousAxisChannelDef(value: PositionFieldDef[String]): Self = StObject.set(x, "continuousAxisChannelDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingWithoutContinuousAxis(value: ErrorEncoding[String]): Self = StObject.set(x, "encodingWithoutContinuousAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupby(value: js.Array[String]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyVarargs(value: String*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setMarkDef(value: MD): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterSpec(value: Height): Self = StObject.set(x, "outerSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksOrient(value: Orientation): Self = StObject.set(x, "ticksOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipEncoding(value: ErrorEncoding[String]): Self = StObject.set(x, "tooltipEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: js.Array[Transform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformVarargs(value: Transform*): Self = StObject.set(x, "transform", js.Array(value :_*))
  }
}
