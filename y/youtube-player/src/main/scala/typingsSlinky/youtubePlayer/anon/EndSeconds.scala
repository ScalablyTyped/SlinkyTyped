package typingsSlinky.youtubePlayer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndSeconds extends js.Object {
  var endSeconds: js.UndefOr[Double] = js.native
  var startSeconds: js.UndefOr[Double] = js.native
  var suggestedQuality: js.UndefOr[String] = js.native
  var videoId: String = js.native
}

object EndSeconds {
  @scala.inline
  def apply(videoId: String): EndSeconds = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndSeconds]
  }
  @scala.inline
  implicit class EndSecondsOps[Self <: EndSeconds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withSuggestedQuality(value: String): Self = {
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

