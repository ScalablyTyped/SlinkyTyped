package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventData extends js.Object {
  /***
  		* Returns whether stopImmediatePropagation was called on this event object.\
  		* @method isImmediatePropagationStopped
  		* @return {Boolean}
  		*/
  def isImmediatePropagationStopped(): Boolean = js.native
  /***
  		* Returns whether stopPropagation was called on this event object.
  		* @method isPropagationStopped
  		* @return {Boolean}
  		*/
  def isPropagationStopped(): Boolean = js.native
  /***
  		* Prevents the rest of the handlers from being executed.
  		* @method stopImmediatePropagation
  		*/
  def stopImmediatePropagation(): Unit = js.native
  /***
  		* Stops event from propagating up the DOM tree.
  		* @method stopPropagation
  		*/
  def stopPropagation(): Unit = js.native
}

object EventData {
  @scala.inline
  def apply(
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit
  ): EventData = {
    val __obj = js.Dynamic.literal(isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[EventData]
  }
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsImmediatePropagationStopped(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImmediatePropagationStopped")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPropagationStopped(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPropagationStopped")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopImmediatePropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopImmediatePropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

