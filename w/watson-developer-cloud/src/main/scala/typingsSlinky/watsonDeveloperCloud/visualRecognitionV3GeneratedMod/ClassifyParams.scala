package typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import typingsSlinky.ibmCloudSdkCore.helperMod.FileObject
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `classify` operation. */
@js.native
trait ClassifyParams extends js.Object {
  /** The desired language of parts of the response. See the response for details. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.native
  /** Which classifiers to apply. Overrides the **owners** parameter. You can specify both custom and built-in classifier IDs. The built-in `default` classifier is used if both **classifier_ids** and **owners** parameters are empty. The following built-in classifier IDs require no training: - `default`: Returns classes from thousands of general tags. - `food`: Enhances specificity and accuracy for images of food items. - `explicit`: Evaluates whether the image might be pornographic. */
  var classifier_ids: js.UndefOr[js.Array[String]] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** An image file (.gif, .jpg, .png, .tif) or .zip file with images. Maximum image size is 10 MB. Include no more than 20 images and limit the .zip file to 100 MB. Encode the image and .zip file names in UTF-8 if they contain non-ASCII characters. The service assumes UTF-8 encoding if it encounters non-ASCII characters. You can also include an image with the **url** parameter. */
  var images_file: js.UndefOr[ReadableStream | FileObject | Buffer] = js.native
  /** The content type of images_file. */
  var images_file_content_type: js.UndefOr[String] = js.native
  /** The filename for images_file. */
  var images_filename: js.UndefOr[String] = js.native
  /** The categories of classifiers to apply. The **classifier_ids** parameter overrides **owners**, so make sure that **classifier_ids** is empty. - Use `IBM` to classify against the `default` general classifier. You get the same result if both **classifier_ids** and **owners** parameters are empty. - Use `me` to classify against all your custom classifiers. However, for better performance use **classifier_ids** to specify the specific custom classifiers to apply. - Use both `IBM` and `me` to analyze the image against both classifier categories. */
  var owners: js.UndefOr[js.Array[String]] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The minimum score a class must have to be displayed in the response. Set the threshold to `0.0` to return all identified classes. */
  var threshold: js.UndefOr[Double] = js.native
  /** The URL of an image (.gif, .jpg, .png, .tif) to analyze. The minimum recommended pixel density is 32X32 pixels, but the service tends to perform better with images that are at least 224 x 224 pixels. The maximum image size is 10 MB. You can also include images with the **images_file** parameter. */
  var url: js.UndefOr[String] = js.native
}

object ClassifyParams {
  @scala.inline
  def apply(): ClassifyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifyParams]
  }
  @scala.inline
  implicit class ClassifyParamsOps[Self <: ClassifyParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept_language(value: AcceptLanguage | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept_language: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept_language")(js.undefined)
        ret
    }
    @scala.inline
    def withClassifier_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifier_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassifier_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifier_ids")(js.undefined)
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
    def withImages_file(value: ReadableStream | FileObject | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages_file: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_file")(js.undefined)
        ret
    }
    @scala.inline
    def withImages_file_content_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_file_content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages_file_content_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_file_content_type")(js.undefined)
        ret
    }
    @scala.inline
    def withImages_filename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages_filename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_filename")(js.undefined)
        ret
    }
    @scala.inline
    def withOwners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(js.undefined)
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
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

