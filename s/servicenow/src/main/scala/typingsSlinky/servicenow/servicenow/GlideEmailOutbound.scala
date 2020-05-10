package typingsSlinky.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideEmailOutbound extends js.Object {
  def addAddress(`type`: String, address: String, displayName: String): Unit = js.native
  def getSubject(): String = js.native
  def setBody(bodyText: String): Unit = js.native
  def setFrom(address: String): Unit = js.native
  def setReplyTo(address: String): Unit = js.native
  def setSubject(subject: String): Unit = js.native
}

object GlideEmailOutbound {
  @scala.inline
  def apply(
    addAddress: (String, String, String) => Unit,
    getSubject: () => String,
    setBody: String => Unit,
    setFrom: String => Unit,
    setReplyTo: String => Unit,
    setSubject: String => Unit
  ): GlideEmailOutbound = {
    val __obj = js.Dynamic.literal(addAddress = js.Any.fromFunction3(addAddress), getSubject = js.Any.fromFunction0(getSubject), setBody = js.Any.fromFunction1(setBody), setFrom = js.Any.fromFunction1(setFrom), setReplyTo = js.Any.fromFunction1(setReplyTo), setSubject = js.Any.fromFunction1(setSubject))
    __obj.asInstanceOf[GlideEmailOutbound]
  }
  @scala.inline
  implicit class GlideEmailOutboundOps[Self <: GlideEmailOutbound] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAddress(value: (String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAddress")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetSubject(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBody(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBody")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFrom(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetReplyTo(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReplyTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubject(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubject")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

