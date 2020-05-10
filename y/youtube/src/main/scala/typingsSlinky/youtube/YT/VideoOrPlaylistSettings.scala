package typingsSlinky.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoOrPlaylistSettings extends js.Object {
  /**
  		 * Time, in seconds from the end of the (first) video, when to end playing.
  		 */
  var endSeconds: js.UndefOr[Double] = js.native
  /**
  		 * Time, in seconds from the beginning of the (first) video, when to start playing.
  		 */
  var startSeconds: js.UndefOr[Double] = js.native
  /**
  		 * Suggested video player quality.
  		 */
  var suggestedQuality: js.UndefOr[SuggestedVideoQuality] = js.native
}

object VideoOrPlaylistSettings {
  @scala.inline
  def apply(): VideoOrPlaylistSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOrPlaylistSettings]
  }
  @scala.inline
  implicit class VideoOrPlaylistSettingsOps[Self <: VideoOrPlaylistSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withStartSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedQuality(value: SuggestedVideoQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedQuality")(js.undefined)
        ret
    }
  }
  
}

