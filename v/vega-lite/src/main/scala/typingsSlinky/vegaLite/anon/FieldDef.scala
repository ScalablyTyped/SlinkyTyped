package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channelMod.PolarPositionChannel
import typingsSlinky.vegaLite.channelMod.PositionChannel
import typingsSlinky.vegaLite.channeldefMod.TypedFieldDef
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.vegaLiteStrings.binned
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldDef extends StObject {
  
  var band: Double = js.native
  
  var channel: PositionChannel | PolarPositionChannel = js.native
  
  var config: js.UndefOr[typingsSlinky.vegaLite.srcConfigMod.Config[SignalRef]] = js.native
  
  var fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null] = js.native
  
  var markDef: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef] = js.native
  
  var offset: js.UndefOr[Double | SignalRef] = js.native
  
  var scaleName: String = js.native
}
object FieldDef {
  
  @scala.inline
  def apply(
    band: Double,
    channel: PositionChannel | PolarPositionChannel,
    fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null],
    markDef: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef],
    scaleName: String
  ): FieldDef = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDef]
  }
  
  @scala.inline
  implicit class FieldDefMutableBuilder[Self <: FieldDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: PositionChannel | PolarPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: typingsSlinky.vegaLite.srcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setFieldDef(value: TypedFieldDef[String, _, Boolean | BinParams | binned | Null]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkDef(value: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double | SignalRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
  }
}
