package typingsSlinky.vegaTypings.signalMod

import typingsSlinky.vegaTypings.axisMod._TickCount
import typingsSlinky.vegaTypings.encodeMod.BaseValueRef
import typingsSlinky.vegaTypings.encodeMod._Field
import typingsSlinky.vegaTypings.layoutMod.Layout
import typingsSlinky.vegaTypings.layoutMod.LayoutBounds
import typingsSlinky.vegaTypings.layoutMod._LayoutOffset
import typingsSlinky.vegaTypings.onEventsMod._EventListener
import typingsSlinky.vegaTypings.onEventsMod._Update
import typingsSlinky.vegaTypings.scaleMod.ScaleInterpolate
import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.scaleMod._RangeScheme
import typingsSlinky.vegaTypings.scaleMod._ScaleBins
import typingsSlinky.vegaTypings.transformMod.TransformField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalRef
  extends BaseValueRef[js.Any]
     with Layout
     with LayoutBounds
     with ScaleInterpolate
     with SortOrder
     with TransformField
     with _EventListener
     with _Field
     with _LayoutOffset
     with _RangeScheme
     with _ScaleBins
     with _TickCount
     with _Update {
  
  var signal: String = js.native
}
object SignalRef {
  
  @scala.inline
  def apply(signal: String): SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalRef]
  }
  
  @scala.inline
  implicit class SignalRefOps[Self <: SignalRef] (val x: Self) extends AnyVal {
    
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
    def setSignal(value: String): Self = this.set("signal", value.asInstanceOf[js.Any])
  }
}
