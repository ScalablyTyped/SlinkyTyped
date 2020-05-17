package typingsSlinky.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageEvent extends Event {
  val data: js.Any = js.native
  val origin: String = js.native
  val ports: js.Any = js.native
  val source: js.Any = js.native
  def initMessageEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    dataArg: js.Any,
    originArg: String,
    lastEventIdArg: String,
    sourceArg: js.Any
  ): Unit = js.native
}

object MessageEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget,
    data: js.Any,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initMessageEvent: (String, Boolean, Boolean, js.Any, String, String, js.Any) => Unit,
    isTrusted: Boolean,
    origin: String,
    ports: js.Any,
    preventDefault: () => Unit,
    source: js.Any,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  ): MessageEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initMessageEvent = js.Any.fromFunction7(initMessageEvent), isTrusted = isTrusted.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), source = source.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  @scala.inline
  implicit class MessageEventOps[Self <: MessageEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitMessageEvent(value: (String, Boolean, Boolean, js.Any, String, String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initMessageEvent")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPorts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

