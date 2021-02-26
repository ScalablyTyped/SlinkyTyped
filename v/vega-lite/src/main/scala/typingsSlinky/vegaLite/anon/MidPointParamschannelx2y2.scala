package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.channeldefMod.ChannelDef
import typingsSlinky.vegaLite.channeldefMod.FieldDefWithoutScale
import typingsSlinky.vegaLite.channeldefMod.OrderFieldDef
import typingsSlinky.vegaLite.channeldefMod.SecondaryChannelDef
import typingsSlinky.vegaLite.channeldefMod.StringFieldDef
import typingsSlinky.vegaLite.scaleComponentMod.ScaleComponent
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.srcStackMod.StackProperties
import typingsSlinky.vegaLite.srcTypeMod.StandardType
import typingsSlinky.vegaLite.vegaLiteStrings.radius2
import typingsSlinky.vegaLite.vegaLiteStrings.theta2
import typingsSlinky.vegaLite.vegaLiteStrings.x2
import typingsSlinky.vegaLite.vegaLiteStrings.y2
import typingsSlinky.vegaLite.vegaSchemaMod.VgValueRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/compile/mark/encode/valueref.MidPointParams & {  channel :'x2' | 'y2' | 'radius2' | 'theta2'} */
@js.native
trait MidPointParamschannelx2y2 extends StObject {
  
  /**
    * Allow overriding band instead of reading to field def since band is applied to size (width/height) instead of the position for x/y-position with band scales.
    */
  var band: js.UndefOr[Double] = js.native
  
  var channel: typingsSlinky.vegaLite.channelMod.Channel with (x2 | y2 | radius2 | theta2) = js.native
  
  var channel2Def: js.UndefOr[SecondaryChannelDef[String]] = js.native
  
  var channelDef: ChannelDef[String] = js.native
  
  var config: typingsSlinky.vegaLite.srcConfigMod.Config[SignalRef] = js.native
  
  var defaultRef: VgValueRef | js.Function0[VgValueRef] = js.native
  
  var markDef: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef] = js.native
  
  var offset: js.UndefOr[Double | SignalRef] = js.native
  
  var scale: ScaleComponent = js.native
  
  var scaleName: String = js.native
  
  var stack: js.UndefOr[StackProperties] = js.native
}
object MidPointParamschannelx2y2 {
  
  @scala.inline
  def apply(
    channel: typingsSlinky.vegaLite.channelMod.Channel with (x2 | y2 | radius2 | theta2),
    config: typingsSlinky.vegaLite.srcConfigMod.Config[SignalRef],
    defaultRef: VgValueRef | js.Function0[VgValueRef],
    markDef: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef],
    scale: ScaleComponent,
    scaleName: String
  ): MidPointParamschannelx2y2 = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], defaultRef = defaultRef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidPointParamschannelx2y2]
  }
  
  @scala.inline
  implicit class MidPointParamschannelx2y2MutableBuilder[Self <: MidPointParamschannelx2y2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    
    @scala.inline
    def setChannel(value: typingsSlinky.vegaLite.channelMod.Channel with (x2 | y2 | radius2 | theta2)): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel2Def(value: SecondaryChannelDef[String]): Self = StObject.set(x, "channel2Def", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel2DefUndefined: Self = StObject.set(x, "channel2Def", js.undefined)
    
    @scala.inline
    def setChannelDef(value: ChannelDef[String]): Self = StObject.set(x, "channelDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelDefNull: Self = StObject.set(x, "channelDef", null)
    
    @scala.inline
    def setChannelDefUndefined: Self = StObject.set(x, "channelDef", js.undefined)
    
    @scala.inline
    def setChannelDefVarargs(
      value: ((FieldDefWithoutScale[String, StandardType]) | OrderFieldDef[String] | StringFieldDef[String])*
    ): Self = StObject.set(x, "channelDef", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: typingsSlinky.vegaLite.srcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRef(value: VgValueRef | js.Function0[VgValueRef]): Self = StObject.set(x, "defaultRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRefFunction0(value: () => VgValueRef): Self = StObject.set(x, "defaultRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkDef(value: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double | SignalRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setScale(value: ScaleComponent): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: StackProperties): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
