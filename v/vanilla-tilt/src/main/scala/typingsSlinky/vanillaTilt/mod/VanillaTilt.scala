package typingsSlinky.vanillaTilt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VanillaTilt extends js.Object {
  /**
    * Start listening to events
    */
  def addEventListeners(): Unit = js.native
  /**
    * Destroys the instance and removes the listeners.
    */
  def destroy(): Unit = js.native
  /**
    * Get values of instance
    */
  def getValues(): TiltValues = js.native
  /**
    * Stop listening to events
    */
  def removeEventListener(): Unit = js.native
  /**
    * Resets the styling
    */
  def reset(): Unit = js.native
}

object VanillaTilt {
  @scala.inline
  def apply(
    addEventListeners: () => Unit,
    destroy: () => Unit,
    getValues: () => TiltValues,
    removeEventListener: () => Unit,
    reset: () => Unit
  ): VanillaTilt = {
    val __obj = js.Dynamic.literal(addEventListeners = js.Any.fromFunction0(addEventListeners), destroy = js.Any.fromFunction0(destroy), getValues = js.Any.fromFunction0(getValues), removeEventListener = js.Any.fromFunction0(removeEventListener), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[VanillaTilt]
  }
  @scala.inline
  implicit class VanillaTiltOps[Self <: VanillaTilt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListeners(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValues(value: () => TiltValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

