package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when user joins chat room
		*/
@js.native
trait ChatRoomInfo extends VoxImplantIMEvent {
  /**
  			* Room features
  			*/
  var features: Double = js.native
  /**
  			* Room info object
  			*/
  var info: ChatRoomInfo = js.native
  /**
  			* Room id
  			*/
  var room: String = js.native
  /**
  			* Room name
  			*/
  var room_name: String = js.native
}

object ChatRoomInfo {
  @scala.inline
  def apply(features: Double, info: ChatRoomInfo, room: String, room_name: String): ChatRoomInfo = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], room_name = room_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomInfo]
  }
  @scala.inline
  implicit class ChatRoomInfoOps[Self <: ChatRoomInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: ChatRoomInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoom_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

