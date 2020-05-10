package typingsSlinky.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaEntity extends js.Object {
  var display_url: String = js.native
  var expanded_url: String = js.native
  var id: Double = js.native
  var id_str: String = js.native
  var indices: js.Tuple2[Double, Double] = js.native
  var media_url: String = js.native
  var media_url_https: String = js.native
  var sizes: Sizes = js.native
  var source_status_id: Double = js.native
  var source_status_id_str: String = js.native
  var `type`: String = js.native
  var url: String = js.native
}

object MediaEntity {
  @scala.inline
  def apply(
    display_url: String,
    expanded_url: String,
    id: Double,
    id_str: String,
    indices: js.Tuple2[Double, Double],
    media_url: String,
    media_url_https: String,
    sizes: Sizes,
    source_status_id: Double,
    source_status_id_str: String,
    `type`: String,
    url: String
  ): MediaEntity = {
    val __obj = js.Dynamic.literal(display_url = display_url.asInstanceOf[js.Any], expanded_url = expanded_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], media_url = media_url.asInstanceOf[js.Any], media_url_https = media_url_https.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], source_status_id = source_status_id.asInstanceOf[js.Any], source_status_id_str = source_status_id_str.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEntity]
  }
  @scala.inline
  implicit class MediaEntityOps[Self <: MediaEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId_str(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_str")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndices(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_url_https(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_url_https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizes(value: Sizes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_status_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_status_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_status_id_str(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_status_id_str")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

