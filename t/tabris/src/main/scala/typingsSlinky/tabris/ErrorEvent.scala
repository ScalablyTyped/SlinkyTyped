package typingsSlinky.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorEvent extends Event {
  val colno: Double = js.native
  val error: js.Any = js.native
  val filename: String = js.native
  val lineno: Double = js.native
  val message: String = js.native
  def initErrorEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    messageArg: String,
    filenameArg: String,
    linenoArg: Double
  ): Unit = js.native
}

object ErrorEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    bubbles: Boolean,
    cancelable: Boolean,
    colno: Double,
    currentTarget: EventTarget,
    defaultPrevented: Boolean,
    error: js.Any,
    eventPhase: Double,
    filename: String,
    initErrorEvent: (String, Boolean, Boolean, String, String, Double) => Unit,
    initEvent: (String, Boolean, Boolean) => Unit,
    isTrusted: Boolean,
    lineno: Double,
    message: String,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  ): ErrorEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], colno = colno.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], initErrorEvent = js.Any.fromFunction6(initErrorEvent), initEvent = js.Any.fromFunction3(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  @scala.inline
  implicit class ErrorEventOps[Self <: ErrorEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColno(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colno")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitErrorEvent(value: (String, Boolean, Boolean, String, String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initErrorEvent")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withLineno(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineno")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

