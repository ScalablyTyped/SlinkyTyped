package typingsSlinky.thrift.mod

import typingsSlinky.thrift.mod.Thrift.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TMessage extends js.Object {
  var fname: String = js.native
  var mtype: MessageType = js.native
  var rseqid: Double = js.native
}

object TMessage {
  @scala.inline
  def apply(fname: String, mtype: MessageType, rseqid: Double): TMessage = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], mtype = mtype.asInstanceOf[js.Any], rseqid = rseqid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TMessage]
  }
  @scala.inline
  implicit class TMessageOps[Self <: TMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMtype(value: MessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRseqid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rseqid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

