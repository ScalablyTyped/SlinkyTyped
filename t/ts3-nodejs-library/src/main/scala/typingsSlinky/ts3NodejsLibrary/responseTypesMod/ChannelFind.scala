package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelFind extends js.Object {
  var channel_name: String = js.native
  var cid: Double = js.native
}

object ChannelFind {
  @scala.inline
  def apply(channel_name: String, cid: Double): ChannelFind = {
    val __obj = js.Dynamic.literal(channel_name = channel_name.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelFind]
  }
  @scala.inline
  implicit class ChannelFindOps[Self <: ChannelFind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

