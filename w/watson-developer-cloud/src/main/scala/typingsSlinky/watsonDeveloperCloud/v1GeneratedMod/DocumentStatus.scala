package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Status information about a submitted document. */
@js.native
trait DocumentStatus extends js.Object {
  /** The unique identifier for the configuration. */
  var configuration_id: js.UndefOr[String] = js.native
  /** The unique identifier of the document. */
  var document_id: String = js.native
  /** The type of the original source file. */
  var file_type: js.UndefOr[String] = js.native
  /** Name of the original source file (if available). */
  var filename: js.UndefOr[String] = js.native
  /** Array of notices produced by the document-ingestion process. */
  var notices: js.Array[Notice] = js.native
  /** The SHA-1 hash of the original source file (formatted as a hexadecimal string). */
  var sha1: js.UndefOr[String] = js.native
  /** Status of the document in the ingestion process. */
  var status: String = js.native
  /** Description of the document status. */
  var status_description: String = js.native
}

object DocumentStatus {
  @scala.inline
  def apply(document_id: String, notices: js.Array[Notice], status: String, status_description: String): DocumentStatus = {
    val __obj = js.Dynamic.literal(document_id = document_id.asInstanceOf[js.Any], notices = notices.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_description = status_description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentStatus]
  }
  @scala.inline
  implicit class DocumentStatusOps[Self <: DocumentStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotices(value: js.Array[Notice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfiguration_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration_id")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_type")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withSha1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1")(js.undefined)
        ret
    }
  }
  
}

