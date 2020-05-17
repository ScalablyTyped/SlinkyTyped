package typingsSlinky.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideSysAttachment extends js.Object {
  def copy(sourceTable: String, sourceSysId: String, destinationTable: String, destinationSysId: String): Unit = js.native
  def deleteAttachment(sysId: String): Unit = js.native
  def getContent(record: ScopedGlideRecord): js.Any = js.native
  def getContentBase64(record: ScopedGlideRecord): String = js.native
  def getContentStream(sysId: String): js.Object = js.native
  def write(record: ScopedGlideRecord, fileName: String, contentType: String, data: js.Any): String = js.native
  def writeBase64(record: ScopedGlideRecord, fileName: String, contentType: String, base64Content: String): String = js.native
  def writeContentStream(record: ScopedGlideRecord, fileName: String, contentType: String, inputStream: js.Object): String = js.native
}

object GlideSysAttachment {
  @scala.inline
  def apply(
    copy: (String, String, String, String) => Unit,
    deleteAttachment: String => Unit,
    getContent: ScopedGlideRecord => js.Any,
    getContentBase64: ScopedGlideRecord => String,
    getContentStream: String => js.Object,
    write: (ScopedGlideRecord, String, String, js.Any) => String,
    writeBase64: (ScopedGlideRecord, String, String, String) => String,
    writeContentStream: (ScopedGlideRecord, String, String, js.Object) => String
  ): GlideSysAttachment = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction4(copy), deleteAttachment = js.Any.fromFunction1(deleteAttachment), getContent = js.Any.fromFunction1(getContent), getContentBase64 = js.Any.fromFunction1(getContentBase64), getContentStream = js.Any.fromFunction1(getContentStream), write = js.Any.fromFunction4(write), writeBase64 = js.Any.fromFunction4(writeBase64), writeContentStream = js.Any.fromFunction4(writeContentStream))
    __obj.asInstanceOf[GlideSysAttachment]
  }
  @scala.inline
  implicit class GlideSysAttachmentOps[Self <: GlideSysAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: (String, String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDeleteAttachment(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAttachment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetContent(value: ScopedGlideRecord => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetContentBase64(value: ScopedGlideRecord => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentBase64")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetContentStream(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentStream")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: (ScopedGlideRecord, String, String, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withWriteBase64(value: (ScopedGlideRecord, String, String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeBase64")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withWriteContentStream(value: (ScopedGlideRecord, String, String, js.Object) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeContentStream")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

