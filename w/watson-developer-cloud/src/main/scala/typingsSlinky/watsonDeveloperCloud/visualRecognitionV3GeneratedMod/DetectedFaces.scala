package typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Results for all faces. */
@js.native
trait DetectedFaces extends js.Object {
  /** The images. */
  var images: js.Array[ImageWithFaces] = js.native
  /** Number of images processed for the API call. */
  var images_processed: Double = js.native
  /** Information about what might cause less than optimal output. For example, a request sent with a corrupt .zip file and a list of image URLs will still complete, but does not return the expected output. Not returned when there is no warning. */
  var warnings: js.UndefOr[js.Array[WarningInfo]] = js.native
}

object DetectedFaces {
  @scala.inline
  def apply(images: js.Array[ImageWithFaces], images_processed: Double): DetectedFaces = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], images_processed = images_processed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedFaces]
  }
  @scala.inline
  implicit class DetectedFacesOps[Self <: DetectedFaces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImages(value: js.Array[ImageWithFaces]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages_processed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_processed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[WarningInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

