package typingsSlinky.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseEvent extends Event {
  val code: Double = js.native
  val reason: String = js.native
  val wasClean: Boolean = js.native
  def initCloseEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    wasCleanArg: Boolean,
    codeArg: Double,
    reasonArg: String
  ): Unit = js.native
}

object CloseEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    bubbles: Boolean,
    cancelable: Boolean,
    code: Double,
    currentTarget: EventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initCloseEvent: (String, Boolean, Boolean, Boolean, Double, String) => Unit,
    initEvent: (String, Boolean, Boolean) => Unit,
    isTrusted: Boolean,
    preventDefault: () => Unit,
    reason: String,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: String,
    wasClean: Boolean
  ): CloseEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initCloseEvent = js.Any.fromFunction6(initCloseEvent), initEvent = js.Any.fromFunction3(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), reason = reason.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseEvent]
  }
  @scala.inline
  implicit class CloseEventOps[Self <: CloseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitCloseEvent(value: (String, Boolean, Boolean, Boolean, Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initCloseEvent")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWasClean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasClean")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

