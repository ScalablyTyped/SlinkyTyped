package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.channelMod.PolarPositionChannel
import typingsSlinky.vegaLite.channelMod.PositionChannel
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.vegaSchemaMod.VgValueRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkDef extends StObject {
  
  var channel: PositionChannel | PolarPositionChannel = js.native
  
  var config: typingsSlinky.vegaLite.srcConfigMod.Config[SignalRef] = js.native
  
  var fieldDef: typingsSlinky.vegaLite.channeldefMod.FieldDef[String, _] = js.native
  
  var markDef: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef] = js.native
  
  var ref: VgValueRef = js.native
}
object MarkDef {
  
  @scala.inline
  def apply(
    channel: PositionChannel | PolarPositionChannel,
    config: typingsSlinky.vegaLite.srcConfigMod.Config[SignalRef],
    fieldDef: typingsSlinky.vegaLite.channeldefMod.FieldDef[String, _],
    markDef: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef],
    ref: VgValueRef
  ): MarkDef = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkDef]
  }
  
  @scala.inline
  implicit class MarkDefMutableBuilder[Self <: MarkDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: PositionChannel | PolarPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: typingsSlinky.vegaLite.srcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDef(value: typingsSlinky.vegaLite.channeldefMod.FieldDef[String, _]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkDef(value: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: VgValueRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
