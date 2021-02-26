package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.vegaSchemaMod.VgEncodeChannel
import typingsSlinky.vegaLite.vegaSchemaMod.VgValueRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultRef extends StObject {
  
  var defaultRef: js.UndefOr[VgValueRef] = js.native
  
  var defaultValue: js.UndefOr[(typingsSlinky.vegaLite.channeldefMod.Value[ExprRef | SignalRef]) | SignalRef] = js.native
  
  var vgChannel: js.UndefOr[VgEncodeChannel] = js.native
}
object DefaultRef {
  
  @scala.inline
  def apply(): DefaultRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRef]
  }
  
  @scala.inline
  implicit class DefaultRefMutableBuilder[Self <: DefaultRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultRef(value: VgValueRef): Self = StObject.set(x, "defaultRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRefUndefined: Self = StObject.set(x, "defaultRef", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: (typingsSlinky.vegaLite.channeldefMod.Value[ExprRef | SignalRef]) | SignalRef): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: (Double | String)*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setVgChannel(value: VgEncodeChannel): Self = StObject.set(x, "vgChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVgChannelUndefined: Self = StObject.set(x, "vgChannel", js.undefined)
  }
}
