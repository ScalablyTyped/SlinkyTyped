package typingsSlinky.smartFoxServer.SFS2X.Requests

import typingsSlinky.smartFoxServer.SFS2X.Entities.Variables.ReservedRoomVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomSettings extends js.Object {
  /** @type {RoomEvents} Sets the flags indicating which events related to the Room are dispatched by the SmartFox client. */
  var events: RoomEvents = js.native
  /** @type {RoomExtension} Sets the Extension that must be attached to the Room on the server-side, and its settings. */
  var extension: RoomExtension = js.native
  /** @type {string} Sets the id of the Group to which the Room should belong. */
  var groupId: String = js.native
  /** @type {boolean} Sets whether the Room is a Game Room or not. */
  var isGame: Boolean = js.native
  /** @type {number} Sets the maximum number of spectators allowed in the Room (only for Game Rooms). */
  var maxSpectators: Double = js.native
  /** @type {number} Sets the maximum number of users allowed in the Room. */
  var maxUsers: Double = js.native
  /** @type {number} Sets the maximum number of Room Variables allowed for the Room. */
  var maxVariables: Double = js.native
  /** @type {string} Defines the name of the Room. */
  var name: String = js.native
  /** @type {string} Sets the password of the Room. */
  var password: String = js.native
  /** @type {RoomPermissions} Sets the flags indicating which operations are permitted on the Room. */
  var permissions: RoomPermissions = js.native
  /** @type {Entities.Variables.ReservedRoomVariables[]} Sets a list of SFSRooomVariable objects to be attached to the Room. */
  var variables: js.Array[ReservedRoomVariables] = js.native
}

object RoomSettings {
  @scala.inline
  def apply(
    events: RoomEvents,
    extension: RoomExtension,
    groupId: String,
    isGame: Boolean,
    maxSpectators: Double,
    maxUsers: Double,
    maxVariables: Double,
    name: String,
    password: String,
    permissions: RoomPermissions,
    variables: js.Array[ReservedRoomVariables]
  ): RoomSettings = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], isGame = isGame.asInstanceOf[js.Any], maxSpectators = maxSpectators.asInstanceOf[js.Any], maxUsers = maxUsers.asInstanceOf[js.Any], maxVariables = maxVariables.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSettings]
  }
  @scala.inline
  implicit class RoomSettingsOps[Self <: RoomSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: RoomEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtension(value: RoomExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSpectators(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpectators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxUsers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxVariables(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: RoomPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Array[ReservedRoomVariables]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

