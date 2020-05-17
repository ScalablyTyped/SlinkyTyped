package typingsSlinky.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aperture extends js.Object {
  var aperture: String = js.native
  var camera: String = js.native
  var caption: String = js.native
  var copyright: String = js.native
  var created_timestamp: String = js.native
  var credit: String = js.native
  var focal_length: String = js.native
  var iso: String = js.native
  var keywords: js.Array[String] = js.native
  var orientation: String = js.native
  var shutter_speed: String = js.native
  var title: String = js.native
}

object Aperture {
  @scala.inline
  def apply(
    aperture: String,
    camera: String,
    caption: String,
    copyright: String,
    created_timestamp: String,
    credit: String,
    focal_length: String,
    iso: String,
    keywords: js.Array[String],
    orientation: String,
    shutter_speed: String,
    title: String
  ): Aperture = {
    val __obj = js.Dynamic.literal(aperture = aperture.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], created_timestamp = created_timestamp.asInstanceOf[js.Any], credit = credit.asInstanceOf[js.Any], focal_length = focal_length.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], shutter_speed = shutter_speed.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aperture]
  }
  @scala.inline
  implicit class ApertureOps[Self <: Aperture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAperture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aperture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCamera(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_timestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocal_length(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focal_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeywords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShutter_speed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutter_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

