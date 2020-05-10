package typingsSlinky.wordpressApiFetch

import typingsSlinky.wordpressApiFetch.mod.Schema.PostFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormats extends js.Object {
  var formats: js.Array[PostFormat] = js.native
  var `post-thumbnails`: Boolean = js.native
  var `responsive-embeds`: Boolean = js.native
}

object AnonFormats {
  @scala.inline
  def apply(formats: js.Array[PostFormat], `post-thumbnails`: Boolean, `responsive-embeds`: Boolean): AnonFormats = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.updateDynamic("post-thumbnails")(`post-thumbnails`.asInstanceOf[js.Any])
    __obj.updateDynamic("responsive-embeds")(`responsive-embeds`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormats]
  }
  @scala.inline
  implicit class AnonFormatsOps[Self <: AnonFormats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormats(value: js.Array[PostFormat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPost-thumbnails`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post-thumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withResponsive-embeds`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive-embeds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

