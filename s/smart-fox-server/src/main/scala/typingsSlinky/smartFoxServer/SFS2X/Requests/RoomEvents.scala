package typingsSlinky.smartFoxServer.SFS2X.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomEvents extends js.Object {
  /** @type {boolean} Sets whether or not the userCountChange event should be dispatched whenever the users (or players+spectators) count changes in the Room. */
  var allowUserCountChance: Boolean = js.native
  /** @type {boolean} Sets whether the userEnterRoom event should be dispatched whenever a user joins the Room or not. */
  var allowUserEnter: Boolean = js.native
  /** @type {boolean} Sets whether the userExitRoom event should be dispatched whenever a user leaves the Room or not. */
  var allowUserExit: Boolean = js.native
  /** @type {boolean} Sets whether or not the userVariablesUpdate event should be dispatched whenever a user in the Room updates their User Variables */
  var allowUserVariablesUpdate: Boolean = js.native
}

object RoomEvents {
  @scala.inline
  def apply(
    allowUserCountChance: Boolean,
    allowUserEnter: Boolean,
    allowUserExit: Boolean,
    allowUserVariablesUpdate: Boolean
  ): RoomEvents = {
    val __obj = js.Dynamic.literal(allowUserCountChance = allowUserCountChance.asInstanceOf[js.Any], allowUserEnter = allowUserEnter.asInstanceOf[js.Any], allowUserExit = allowUserExit.asInstanceOf[js.Any], allowUserVariablesUpdate = allowUserVariablesUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomEvents]
  }
  @scala.inline
  implicit class RoomEventsOps[Self <: RoomEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUserCountChance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUserCountChance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowUserEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUserEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowUserExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUserExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowUserVariablesUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUserVariablesUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

