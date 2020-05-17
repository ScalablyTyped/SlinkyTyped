package typingsSlinky.vegaTypings.signalMod

import typingsSlinky.vegaTypings.axisMod.TickCount
import typingsSlinky.vegaTypings.encodeMod.BaseValueRef
import typingsSlinky.vegaTypings.encodeMod.Field
import typingsSlinky.vegaTypings.layoutMod.Layout
import typingsSlinky.vegaTypings.layoutMod.LayoutBounds
import typingsSlinky.vegaTypings.layoutMod.LayoutOffset
import typingsSlinky.vegaTypings.onEventsMod.EventListener
import typingsSlinky.vegaTypings.onEventsMod.Update
import typingsSlinky.vegaTypings.scaleMod.RangeScheme
import typingsSlinky.vegaTypings.scaleMod.ScaleBins
import typingsSlinky.vegaTypings.scaleMod.ScaleField
import typingsSlinky.vegaTypings.scaleMod.ScaleInterpolate
import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.transformMod.TransformField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalRef
  extends BaseValueRef[js.Any]
     with EventListener
     with Field
     with Layout
     with LayoutBounds
     with LayoutOffset
     with RangeScheme
     with ScaleBins
     with ScaleField
     with ScaleInterpolate
     with SortOrder
     with TickCount
     with TransformField
     with Update {
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
    def withSignal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

