package typingsSlinky.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinderPhoto extends js.Object {
  var extension: String = js.native
  var fileName: String = js.native
  var id: String = js.native
  var main: Boolean = js.native
  var processedFiles: js.Array[TinderPhotoProcessedFile] = js.native
  var url: String = js.native
  var xdistance_percent: Double = js.native
  var xoffset_percent: Double = js.native
  var ydistance_percent: Double = js.native
  var yoffset_percent: Double = js.native
}

object TinderPhoto {
  @scala.inline
  def apply(
    extension: String,
    fileName: String,
    id: String,
    main: Boolean,
    processedFiles: js.Array[TinderPhotoProcessedFile],
    url: String,
    xdistance_percent: Double,
    xoffset_percent: Double,
    ydistance_percent: Double,
    yoffset_percent: Double
  ): TinderPhoto = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], processedFiles = processedFiles.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xdistance_percent = xdistance_percent.asInstanceOf[js.Any], xoffset_percent = xoffset_percent.asInstanceOf[js.Any], ydistance_percent = ydistance_percent.asInstanceOf[js.Any], yoffset_percent = yoffset_percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderPhoto]
  }
  @scala.inline
  implicit class TinderPhotoOps[Self <: TinderPhoto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
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
    def withMain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessedFiles(value: js.Array[TinderPhotoProcessedFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXdistance_percent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xdistance_percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXoffset_percent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xoffset_percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYdistance_percent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ydistance_percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYoffset_percent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoffset_percent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

