package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email attachment. */
@js.native
trait EmailAttachment extends js.Object {
  /** Gets or sets a value that identifies the content of the attachment on a remote system. */
  var contentId: String = js.native
  /** Gets or sets the location of an email attachment as a Uniform Resource Identifier (URI). */
  var contentLocation: String = js.native
  /** Gets or sets the email attachment's data. */
  var data: IRandomAccessStreamReference = js.native
  /** Gets or sets the download state of the email attachment. */
  var downloadState: EmailAttachmentDownloadState = js.native
  /** Gets or sets the estimated download size of the attachment. */
  var estimatedDownloadSizeInBytes: Double = js.native
  /** Gets or sets the displayed file name for the email attachment. */
  var fileName: String = js.native
  /** Gets the locally unique ID for the email attachment. */
  var id: String = js.native
  /** Gets a Boolean value indicating if the attachment came from the base message. */
  var isFromBaseMessage: Boolean = js.native
  /** Gets or sets a Boolean property indicating if the attachment is included inline, in the body of the message. */
  var isInline: Boolean = js.native
  /** Gets or sets the MIME type of the attachment. */
  var mimeType: String = js.native
}

object EmailAttachment {
  @scala.inline
  def apply(
    contentId: String,
    contentLocation: String,
    data: IRandomAccessStreamReference,
    downloadState: EmailAttachmentDownloadState,
    estimatedDownloadSizeInBytes: Double,
    fileName: String,
    id: String,
    isFromBaseMessage: Boolean,
    isInline: Boolean,
    mimeType: String
  ): EmailAttachment = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], contentLocation = contentLocation.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], downloadState = downloadState.asInstanceOf[js.Any], estimatedDownloadSizeInBytes = estimatedDownloadSizeInBytes.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFromBaseMessage = isFromBaseMessage.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAttachment]
  }
  @scala.inline
  implicit class EmailAttachmentOps[Self <: EmailAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadState(value: EmailAttachmentDownloadState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedDownloadSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedDownloadSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFromBaseMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFromBaseMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

