package typingsSlinky.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressEvent extends Event {
  val lengthComputable: Boolean = js.native
  val loaded: Double = js.native
  val total: Double = js.native
  def initProgressEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    lengthComputableArg: Boolean,
    loadedArg: Double,
    totalArg: Double
  ): Unit = js.native
}

object ProgressEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initProgressEvent: (String, Boolean, Boolean, Boolean, Double, Double) => Unit,
    isTrusted: Boolean,
    lengthComputable: Boolean,
    loaded: Double,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    total: Double,
    `type`: String
  ): ProgressEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initProgressEvent = js.Any.fromFunction6(initProgressEvent), isTrusted = isTrusted.asInstanceOf[js.Any], lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEvent]
  }
  @scala.inline
  implicit class ProgressEventOps[Self <: ProgressEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitProgressEvent(value: (String, Boolean, Boolean, Boolean, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initProgressEvent")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withLengthComputable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthComputable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

