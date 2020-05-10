package typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import typingsSlinky.ibmCloudSdkCore.helperMod.FileObject
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateClassifier` operation. */
@js.native
trait UpdateClassifierParams extends js.Object {
  /** The ID of the classifier. */
  var classifier_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** A .zip file of images that do not depict the visual subject of any of the classes of the new classifier. Must contain a minimum of 10 images. Encode special characters in the file name in UTF-8. */
  var negative_examples: js.UndefOr[ReadableStream | FileObject | Buffer] = js.native
  /** The filename for negative_examples. */
  var negative_examples_filename: js.UndefOr[String] = js.native
  /** A dictionary that contains the value for each classname. The value is a .zip file of images that depict the visual subject of a class in the classifier. The positive examples create or update classes in the classifier. You can include more than one positive example file in a call. Specify the parameter name by appending `_positive_examples` to the class name. For example, `goldenretriever_positive_examples` creates the class `goldenretriever`. Include at least 10 images in .jpg or .png format. The minimum recommended image resolution is 32X32 pixels. The maximum number of images is 10,000 images or 100 MB per .zip file. Encode special characters in the file name in UTF-8. */
  var positive_examples: js.UndefOr[Map[String, ReadableStream | FileObject | Buffer]] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object UpdateClassifierParams {
  @scala.inline
  def apply(classifier_id: String): UpdateClassifierParams = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClassifierParams]
  }
  @scala.inline
  implicit class UpdateClassifierParamsOps[Self <: UpdateClassifierParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassifier_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifier_id")(value.asInstanceOf[js.Any])
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
    def withNegative_examples(value: ReadableStream | FileObject | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative_examples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegative_examples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative_examples")(js.undefined)
        ret
    }
    @scala.inline
    def withNegative_examples_filename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative_examples_filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegative_examples_filename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative_examples_filename")(js.undefined)
        ret
    }
    @scala.inline
    def withPositive_examples(value: Map[String, ReadableStream | FileObject | Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive_examples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositive_examples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive_examples")(js.undefined)
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

