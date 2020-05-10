package typingsSlinky.uploadcare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var datetime_removed: String | Null = js.native
  var datetime_stored: String = js.native
  var datetime_uploaded: String = js.native
  var image_info: ImageInfo = js.native
  var is_image: Boolean = js.native
  var is_ready: Boolean = js.native
  var mime_type: String = js.native
  var original_file_url: String = js.native
  var original_filename: String = js.native
  var size: Double = js.native
  var url: String = js.native
  var uuid: String = js.native
}

object File {
  @scala.inline
  def apply(
    datetime_stored: String,
    datetime_uploaded: String,
    image_info: ImageInfo,
    is_image: Boolean,
    is_ready: Boolean,
    mime_type: String,
    original_file_url: String,
    original_filename: String,
    size: Double,
    url: String,
    uuid: String
  ): File = {
    val __obj = js.Dynamic.literal(datetime_stored = datetime_stored.asInstanceOf[js.Any], datetime_uploaded = datetime_uploaded.asInstanceOf[js.Any], image_info = image_info.asInstanceOf[js.Any], is_image = is_image.asInstanceOf[js.Any], is_ready = is_ready.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], original_file_url = original_file_url.asInstanceOf[js.Any], original_filename = original_filename.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatetime_stored(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime_stored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatetime_uploaded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime_uploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage_info(value: ImageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_image(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_ready(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_file_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_file_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_filename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatetime_removed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime_removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatetime_removedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime_removed")(null)
        ret
    }
  }
  
}

