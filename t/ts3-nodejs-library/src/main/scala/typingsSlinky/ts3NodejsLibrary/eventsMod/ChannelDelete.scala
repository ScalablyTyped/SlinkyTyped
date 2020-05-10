package typingsSlinky.ts3NodejsLibrary.eventsMod

import typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelDelete extends js.Object {
  var cid: Double = js.native
  var invoker: TeamSpeakClient = js.native
}

object ChannelDelete {
  @scala.inline
  def apply(cid: Double, invoker: TeamSpeakClient): ChannelDelete = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDelete]
  }
  @scala.inline
  implicit class ChannelDeleteOps[Self <: ChannelDelete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoker(value: TeamSpeakClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

