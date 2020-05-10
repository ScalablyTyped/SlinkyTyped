package typingsSlinky.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Chat room info
	*/
@js.native
trait ChatRoomInfo extends js.Object {
  /**
  		* Creation date
  		*/
  var creationdate: String = js.native
  /**
  		* Room description
  		*/
  var description: String = js.native
  /**
  		* Number of chat room participants
  		*/
  var occupants: Double = js.native
  /**
  		* Room's name / subject
  		*/
  var subject: String = js.native
}

object ChatRoomInfo {
  @scala.inline
  def apply(creationdate: String, description: String, occupants: Double, subject: String): ChatRoomInfo = {
    val __obj = js.Dynamic.literal(creationdate = creationdate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], occupants = occupants.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomInfo]
  }
  @scala.inline
  implicit class ChatRoomInfoOps[Self <: ChatRoomInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOccupants(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occupants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

