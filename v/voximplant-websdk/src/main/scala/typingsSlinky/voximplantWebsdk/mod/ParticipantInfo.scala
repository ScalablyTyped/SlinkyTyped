package typingsSlinky.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Participant info
	*/
@js.native
trait ParticipantInfo extends js.Object {
  /**
  		* The participant's affiliation with the room
  		*/
  var affiliation: Double = js.native
  /**
  		* Indicate conditions like: user has been kicked or banned from the room
  		*/
  var flags: Double = js.native
  /**
  		* User id
  		*/
  var id: String = js.native
  /**
  		* Reason
  		*/
  var reason: String = js.native
  /**
  		* Resource name
  		*/
  var resource: String = js.native
  /**
  		* The participant's role with the room
  		*/
  var role: Double = js.native
}

object ParticipantInfo {
  @scala.inline
  def apply(affiliation: Double, flags: Double, id: String, reason: String, resource: String, role: Double): ParticipantInfo = {
    val __obj = js.Dynamic.literal(affiliation = affiliation.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantInfo]
  }
  @scala.inline
  implicit class ParticipantInfoOps[Self <: ParticipantInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffiliation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affiliation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

