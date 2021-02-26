package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channeldefMod.Position2Def
import typingsSlinky.vegaLite.channeldefMod.TypedFieldDef
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.vegaLiteStrings.binned
import typingsSlinky.vegaLite.vegaLiteStrings.radius
import typingsSlinky.vegaLite.vegaLiteStrings.theta
import typingsSlinky.vegaLite.vegaLiteStrings.x
import typingsSlinky.vegaLite.vegaLiteStrings.y
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisTranslate extends StObject {
  
  var axisTranslate: Double | SignalRef = js.native
  
  var band: Double = js.native
  
  var channel: x | y | theta | radius = js.native
  
  var config: typingsSlinky.vegaLite.srcConfigMod.Config[SignalRef] = js.native
  
  var fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null] = js.native
  
  var fieldDef2: js.UndefOr[Position2Def[String]] = js.native
  
  var markDef: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef] = js.native
  
  var reverse: Boolean | SignalRef = js.native
  
  var scaleName: String = js.native
  
  var spacing: js.UndefOr[Double] = js.native
}
object AxisTranslate {
  
  @scala.inline
  def apply(
    axisTranslate: Double | SignalRef,
    band: Double,
    channel: x | y | theta | radius,
    config: typingsSlinky.vegaLite.srcConfigMod.Config[SignalRef],
    fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null],
    markDef: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef],
    reverse: Boolean | SignalRef,
    scaleName: String
  ): AxisTranslate = {
    val __obj = js.Dynamic.literal(axisTranslate = axisTranslate.asInstanceOf[js.Any], band = band.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisTranslate]
  }
  
  @scala.inline
  implicit class AxisTranslateMutableBuilder[Self <: AxisTranslate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisTranslate(value: Double | SignalRef): Self = StObject.set(x, "axisTranslate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: typingsSlinky.vegaLite.vegaLiteStrings.x | y | theta | radius): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: typingsSlinky.vegaLite.srcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDef(value: TypedFieldDef[String, _, Boolean | BinParams | binned | Null]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDef2(value: Position2Def[String]): Self = StObject.set(x, "fieldDef2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDef2Undefined: Self = StObject.set(x, "fieldDef2", js.undefined)
    
    @scala.inline
    def setMarkDef(value: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverse(value: Boolean | SignalRef): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
