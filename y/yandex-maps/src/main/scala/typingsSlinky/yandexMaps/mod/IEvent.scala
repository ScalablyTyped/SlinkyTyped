package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEvent extends js.Object {
  def allowMapEvent(): Unit = js.native
  def callMethod(name: String): Unit = js.native
  def get(name: String): js.Object = js.native
  def getSourceEvent(): IEvent | Null = js.native
  def isDefaultPrevented(): Boolean = js.native
  def isImmediatePropagationStopped(): Boolean = js.native
  def isMapEventAllowed(): Boolean = js.native
  def isPropagationStopped(): Boolean = js.native
  def preventDefault(): Boolean = js.native
  def stopImmediatePropagation(): Boolean = js.native
  def stopPropagation(): Boolean = js.native
}

object IEvent {
  @scala.inline
  def apply(
    allowMapEvent: () => Unit,
    callMethod: String => Unit,
    get: String => js.Object,
    getSourceEvent: () => IEvent | Null,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isMapEventAllowed: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Boolean,
    stopImmediatePropagation: () => Boolean,
    stopPropagation: () => Boolean
  ): IEvent = {
    val __obj = js.Dynamic.literal(allowMapEvent = js.Any.fromFunction0(allowMapEvent), callMethod = js.Any.fromFunction1(callMethod), get = js.Any.fromFunction1(get), getSourceEvent = js.Any.fromFunction0(getSourceEvent), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isMapEventAllowed = js.Any.fromFunction0(isMapEventAllowed), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[IEvent]
  }
  @scala.inline
  implicit class IEventOps[Self <: IEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMapEvent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMapEvent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCallMethod(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callMethod")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSourceEvent(value: () => IEvent | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceEvent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDefaultPrevented(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultPrevented")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsImmediatePropagationStopped(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImmediatePropagationStopped")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMapEventAllowed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMapEventAllowed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPropagationStopped(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPropagationStopped")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopImmediatePropagation(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopImmediatePropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

