package typingsSlinky.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Video recording device info
	*/
@js.native
trait VideoSourceInfo extends js.Object {
  /**
  		*	Device id that can be used to choose video recording device
  		*/
  var id: Double | String = js.native
  /**
  		*	Device name , in WebRTC mode populated with real data only when app has been opened using HTTPS protocol
  		*/
  var name: String = js.native
}

object VideoSourceInfo {
  @scala.inline
  def apply(id: Double | String, name: String): VideoSourceInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSourceInfo]
  }
  @scala.inline
  implicit class VideoSourceInfoOps[Self <: VideoSourceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

