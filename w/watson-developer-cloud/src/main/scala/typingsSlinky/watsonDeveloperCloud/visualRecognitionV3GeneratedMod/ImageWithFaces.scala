package typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about faces in the image. */
@js.native
trait ImageWithFaces extends js.Object {
  /** Information about what might have caused a failure, such as an image that is too large. Not returned when there is no error. */
  var error: js.UndefOr[ErrorInfo] = js.native
  /** Faces detected in the images. */
  var faces: js.Array[Face] = js.native
  /** Relative path of the image file if uploaded directly. Not returned when the image is passed by URL. */
  var image: js.UndefOr[String] = js.native
  /** Fully resolved URL of the image after redirects are followed. Not returned when the image is uploaded. */
  var resolved_url: js.UndefOr[String] = js.native
  /** Source of the image before any redirects. Not returned when the image is uploaded. */
  var source_url: js.UndefOr[String] = js.native
}

object ImageWithFaces {
  @scala.inline
  def apply(faces: js.Array[Face]): ImageWithFaces = {
    val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageWithFaces]
  }
  @scala.inline
  implicit class ImageWithFacesOps[Self <: ImageWithFaces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaces(value: js.Array[Face]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ErrorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withResolved_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolved_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved_url")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_url")(js.undefined)
        ret
    }
  }
  
}

