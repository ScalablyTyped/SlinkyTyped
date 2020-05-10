package typingsSlinky.semanticUiReactEventStack.eventTargetMod

import typingsSlinky.semanticUiReactEventStack.typesMod.EventListeners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTarget extends js.Object {
  var addTargetHandler: js.Any = js.native
  var createEmitter: js.Any = js.native
  val handlers: js.Any = js.native
  val pools: js.Any = js.native
  var removeTargetHandler: js.Any = js.native
  val target: js.Any = js.native
  def addHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit = js.native
  def hasHandlers(): Boolean = js.native
  def removeHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit = js.native
}

object EventTarget {
  @scala.inline
  def apply(
    addHandlers: (String, String, EventListeners) => Unit,
    addTargetHandler: js.Any,
    createEmitter: js.Any,
    handlers: js.Any,
    hasHandlers: () => Boolean,
    pools: js.Any,
    removeHandlers: (String, String, EventListeners) => Unit,
    removeTargetHandler: js.Any,
    target: js.Any
  ): EventTarget = {
    val __obj = js.Dynamic.literal(addHandlers = js.Any.fromFunction3(addHandlers), addTargetHandler = addTargetHandler.asInstanceOf[js.Any], createEmitter = createEmitter.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any], hasHandlers = js.Any.fromFunction0(hasHandlers), pools = pools.asInstanceOf[js.Any], removeHandlers = js.Any.fromFunction3(removeHandlers), removeTargetHandler = removeTargetHandler.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTarget]
  }
  @scala.inline
  implicit class EventTargetOps[Self <: EventTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddHandlers(value: (String, String, EventListeners) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHandlers")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddTargetHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTargetHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateEmitter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createEmitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandlers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasHandlers(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHandlers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPools(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveHandlers(value: (String, String, EventListeners) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHandlers")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemoveTargetHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTargetHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

