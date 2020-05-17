package typingsSlinky.sipml.SIPml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var description: String = js.native
  var `type`: String = js.native
  def getContent(): js.Object = js.native
  def getContentString(): String = js.native
  def getContentType(): js.Object = js.native
  def getSipResponseCode(): Double = js.native
}

object Event {
  @scala.inline
  def apply(
    description: String,
    getContent: () => js.Object,
    getContentString: () => String,
    getContentType: () => js.Object,
    getSipResponseCode: () => Double,
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], getContent = js.Any.fromFunction0(getContent), getContentString = js.Any.fromFunction0(getContentString), getContentType = js.Any.fromFunction0(getContentType), getSipResponseCode = js.Any.fromFunction0(getSipResponseCode))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContent(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContentString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContentType(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSipResponseCode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSipResponseCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

