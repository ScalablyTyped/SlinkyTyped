package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemNextStateOnTransition extends js.Object {
  /**
    * Error code if there is no next state transition possible.
    */
  var errorCode: String = js.native
  /**
    * Work item ID.
    */
  var id: Double = js.native
  /**
    * Error message if there is no next state transition possible.
    */
  var message: String = js.native
  /**
    * Name of the next state on transition.
    */
  var stateOnTransition: String = js.native
}

object WorkItemNextStateOnTransition {
  @scala.inline
  def apply(errorCode: String, id: Double, message: String, stateOnTransition: String): WorkItemNextStateOnTransition = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stateOnTransition = stateOnTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemNextStateOnTransition]
  }
  @scala.inline
  implicit class WorkItemNextStateOnTransitionOps[Self <: WorkItemNextStateOnTransition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateOnTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateOnTransition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

