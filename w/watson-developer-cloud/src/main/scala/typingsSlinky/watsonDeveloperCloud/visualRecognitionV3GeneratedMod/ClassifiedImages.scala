package typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Results for all images. */
@js.native
trait ClassifiedImages extends js.Object {
  /** Number of custom classes identified in the images. */
  var custom_classes: js.UndefOr[Double] = js.native
  /** Classified images. */
  var images: js.Array[ClassifiedImage] = js.native
  /** Number of images processed for the API call. */
  var images_processed: js.UndefOr[Double] = js.native
  /** Information about what might cause less than optimal output. For example, a request sent with a corrupt .zip file and a list of image URLs will still complete, but does not return the expected output. Not returned when there is no warning. */
  var warnings: js.UndefOr[js.Array[WarningInfo]] = js.native
}

object ClassifiedImages {
  @scala.inline
  def apply(images: js.Array[ClassifiedImage]): ClassifiedImages = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedImages]
  }
  @scala.inline
  implicit class ClassifiedImagesOps[Self <: ClassifiedImages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImages(value: js.Array[ClassifiedImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom_classes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_classes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_classes")(js.undefined)
        ret
    }
    @scala.inline
    def withImages_processed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_processed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages_processed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_processed")(js.undefined)
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

