package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.imageData
import typingsSlinky.sketchapp.sketchappStrings.jSONOriginalDataReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSImageDataReference extends js.Object {
  var _class: jSONOriginalDataReference = js.native
  var _ref: String = js.native
  var _ref_class: imageData = js.native
  var data: AnonData = js.native
  var sha1: AnonData = js.native
}

object SketchMSImageDataReference {
  @scala.inline
  def apply(
    _class: jSONOriginalDataReference,
    _ref: String,
    _ref_class: imageData,
    data: AnonData,
    sha1: AnonData
  ): SketchMSImageDataReference = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], _ref = _ref.asInstanceOf[js.Any], _ref_class = _ref_class.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImageDataReference]
  }
  @scala.inline
  implicit class SketchMSImageDataReferenceOps[Self <: SketchMSImageDataReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: jSONOriginalDataReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_ref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_ref_class(value: imageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ref_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: AnonData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha1(value: AnonData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

