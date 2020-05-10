package typingsSlinky.sweetalert.stateMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sweetalert.AnonCloseModal
import typingsSlinky.sweetalert.AnonReject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwalState extends js.Object {
  var actions: StringDictionary[AnonCloseModal] = js.native
  var isOpen: Boolean = js.native
  var promise: AnonReject = js.native
  var timer: Double = js.native
}

object SwalState {
  @scala.inline
  def apply(actions: StringDictionary[AnonCloseModal], isOpen: Boolean, promise: AnonReject, timer: Double): SwalState = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwalState]
  }
  @scala.inline
  implicit class SwalStateOps[Self <: SwalState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: StringDictionary[AnonCloseModal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromise(value: AnonReject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

