package typingsSlinky.signalsJs.ieventMod

import typingsSlinky.signalsJs.iprioritysignalMod.IPrioritySignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEvent extends js.Object {
  /** Indicates whether the event is a bubbling event. */
  var bubbles: Boolean = js.native
  /** The object that added the listener for the event. */
  var currentTarget: js.Object = js.native
  /** The signal that dispatched the event. */
  var signal: IPrioritySignal = js.native
  /** The object that originally dispatched the event.
    *  When dispatched from an signal, the target is the object containing the signal. */
  var target: js.Object = js.native
}

object IEvent {
  @scala.inline
  def apply(bubbles: Boolean, currentTarget: js.Object, signal: IPrioritySignal, target: js.Object): IEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
  @scala.inline
  implicit class IEventOps[Self <: IEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTarget(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignal(value: IPrioritySignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

