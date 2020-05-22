package typingsSlinky.servicenow.global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideSysAttachment")
@js.native
class GlideSysAttachment ()
  extends typingsSlinky.servicenow.GlideSysAttachment {
  /* CompleteClass */
  override def copy(sourceTable: String, sourceSysId: String, destinationTable: String, destinationSysId: String): Unit = js.native
  /* CompleteClass */
  override def deleteAttachment(sysId: String): Unit = js.native
  /* CompleteClass */
  override def getContent(record: typingsSlinky.servicenow.servicenow.GlideRecord): js.Any = js.native
  /* CompleteClass */
  override def getContentBase64(record: typingsSlinky.servicenow.servicenow.GlideRecord): String = js.native
  /* CompleteClass */
  override def getContentStream(sysId: String): js.Object = js.native
  /* CompleteClass */
  override def write(
    record: typingsSlinky.servicenow.servicenow.GlideRecord,
    fileName: String,
    contentType: String,
    data: js.Any
  ): String = js.native
  /* CompleteClass */
  override def writeBase64(
    record: typingsSlinky.servicenow.servicenow.GlideRecord,
    fileName: String,
    contentType: String,
    base64Content: String
  ): String = js.native
  /* CompleteClass */
  override def writeContentStream(
    record: typingsSlinky.servicenow.servicenow.GlideRecord,
    fileName: String,
    contentType: String,
    inputStream: js.Object
  ): String = js.native
}

