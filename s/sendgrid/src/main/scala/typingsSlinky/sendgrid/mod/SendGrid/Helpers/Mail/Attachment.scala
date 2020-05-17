package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachment extends js.Object {
  def getContent(): String = js.native
  def getContentId(): String = js.native
  def getDisposition(): String = js.native
  def getFilename(): String = js.native
  def getType(): String = js.native
  def setContent(content: String): Unit = js.native
  def setContentId(contentId: String): Unit = js.native
  def setDisposition(disposition: String): Unit = js.native
  def setFilename(filename: String): Unit = js.native
  def setType(`type`: String): Unit = js.native
  def toJSON(): typingsSlinky.sendgrid.anon.Content = js.native
}

object Attachment {
  @scala.inline
  def apply(
    getContent: () => String,
    getContentId: () => String,
    getDisposition: () => String,
    getFilename: () => String,
    getType: () => String,
    setContent: String => Unit,
    setContentId: String => Unit,
    setDisposition: String => Unit,
    setFilename: String => Unit,
    setType: String => Unit,
    toJSON: () => typingsSlinky.sendgrid.anon.Content
  ): Attachment = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), getContentId = js.Any.fromFunction0(getContentId), getDisposition = js.Any.fromFunction0(getDisposition), getFilename = js.Any.fromFunction0(getFilename), getType = js.Any.fromFunction0(getType), setContent = js.Any.fromFunction1(setContent), setContentId = js.Any.fromFunction1(setContentId), setDisposition = js.Any.fromFunction1(setDisposition), setFilename = js.Any.fromFunction1(setFilename), setType = js.Any.fromFunction1(setType), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Attachment]
  }
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContent(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContentId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDisposition(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisposition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFilename(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilename")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContent(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetContentId(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDisposition(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisposition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFilename(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilename")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetType(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => typingsSlinky.sendgrid.anon.Content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

