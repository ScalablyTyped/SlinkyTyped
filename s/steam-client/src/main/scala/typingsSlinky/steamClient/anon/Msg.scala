package typingsSlinky.steamClient.anon

import typingsSlinky.steamClient.mod.CMsgProtoBufHeader
import typingsSlinky.steamClient.mod.EMsg
import typingsSlinky.steamClient.steamClientBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Msg extends js.Object {
  /**
    * A value from EMsg
    */
  var msg: EMsg = js.native
  /**
    * A CMsgProtoBufHeader object if this message is protobuf-backed, otherwise header.proto is falsy.
    */
  var proto: js.UndefOr[CMsgProtoBufHeader | `false`] = js.native
}

object Msg {
  @scala.inline
  def apply(msg: EMsg): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
  @scala.inline
  implicit class MsgOps[Self <: Msg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMsg(value: EMsg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProto(value: CMsgProtoBufHeader | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proto")(js.undefined)
        ret
    }
  }
  
}

