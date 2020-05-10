package typingsSlinky.twilioChat.mediaMod

import typingsSlinky.twilioMcsClient.mod.McsClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaServices extends js.Object {
  var mcsClient: McsClient = js.native
}

object MediaServices {
  @scala.inline
  def apply(mcsClient: McsClient): MediaServices = {
    val __obj = js.Dynamic.literal(mcsClient = mcsClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaServices]
  }
  @scala.inline
  implicit class MediaServicesOps[Self <: MediaServices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMcsClient(value: McsClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mcsClient")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

