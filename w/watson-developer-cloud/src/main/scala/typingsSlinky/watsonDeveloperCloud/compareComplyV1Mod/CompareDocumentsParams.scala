package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import typingsSlinky.ibmCloudSdkCore.helperMod.FileObject
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType
import typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType
import typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `compareDocuments` operation. */
@js.native
trait CompareDocumentsParams extends js.Object {
  /** The first document to compare. */
  var file_1: ReadableStream | FileObject | Buffer = js.native
  /** The content type of file_1. */
  var file_1_content_type: js.UndefOr[File1ContentType | String] = js.native
  /** A text label for the first document. */
  var file_1_label: js.UndefOr[String] = js.native
  /** The second document to compare. */
  var file_2: ReadableStream | FileObject | Buffer = js.native
  /** The content type of file_2. */
  var file_2_content_type: js.UndefOr[File2ContentType | String] = js.native
  /** A text label for the second document. */
  var file_2_label: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object CompareDocumentsParams {
  @scala.inline
  def apply(file_1: ReadableStream | FileObject | Buffer, file_2: ReadableStream | FileObject | Buffer): CompareDocumentsParams = {
    val __obj = js.Dynamic.literal(file_1 = file_1.asInstanceOf[js.Any], file_2 = file_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareDocumentsParams]
  }
  @scala.inline
  implicit class CompareDocumentsParamsOps[Self <: CompareDocumentsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile_1(value: ReadableStream | FileObject | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile_2(value: ReadableStream | FileObject | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile_1_content_type(value: File1ContentType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_1_content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_1_content_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_1_content_type")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_1_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_1_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_1_label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_1_label")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_2_content_type(value: File2ContentType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_2_content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_2_content_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_2_content_type")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_2_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_2_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_2_label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_2_label")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: Model | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_response(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(js.undefined)
        ret
    }
  }
  
}

