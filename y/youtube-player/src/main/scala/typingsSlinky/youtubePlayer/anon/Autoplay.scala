package typingsSlinky.youtubePlayer.anon

import typingsSlinky.youtubePlayer.youtubePlayerNumbers.`0`
import typingsSlinky.youtubePlayer.youtubePlayerNumbers.`1`
import typingsSlinky.youtubePlayer.youtubePlayerNumbers.`3`
import typingsSlinky.youtubePlayer.youtubePlayerStrings.playlist
import typingsSlinky.youtubePlayer.youtubePlayerStrings.red
import typingsSlinky.youtubePlayer.youtubePlayerStrings.search
import typingsSlinky.youtubePlayer.youtubePlayerStrings.user_uploads
import typingsSlinky.youtubePlayer.youtubePlayerStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autoplay extends js.Object {
  var autoplay: js.UndefOr[`0` | `1`] = js.native
  var cc_lang_pref: js.UndefOr[String] = js.native
  var cc_load_policy: js.UndefOr[`1`] = js.native
  var color: js.UndefOr[red | white] = js.native
  var controls: js.UndefOr[`0` | `1`] = js.native
  var disablekb: js.UndefOr[`0` | `1`] = js.native
  var enablejsapi: js.UndefOr[`0` | `1`] = js.native
  var end: js.UndefOr[Double] = js.native
  var fs: js.UndefOr[`0` | `1`] = js.native
  var hl: js.UndefOr[String] = js.native
  var iv_load_policy: js.UndefOr[`1` | `3`] = js.native
  var list: js.UndefOr[String] = js.native
  var listType: js.UndefOr[playlist | search | user_uploads] = js.native
  var loop: js.UndefOr[`0` | `1`] = js.native
  var modestbranding: js.UndefOr[`1`] = js.native
  var origin: js.UndefOr[String] = js.native
  var playlist: js.UndefOr[String] = js.native
  var playsinline: js.UndefOr[`0` | `1`] = js.native
  var rel: js.UndefOr[`0` | `1`] = js.native
  var start: js.UndefOr[Double] = js.native
  var widget_referrer: js.UndefOr[String] = js.native
}

object Autoplay {
  @scala.inline
  def apply(): Autoplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autoplay]
  }
  @scala.inline
  implicit class AutoplayOps[Self <: Autoplay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoplay(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withCc_lang_pref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc_lang_pref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCc_lang_pref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc_lang_pref")(js.undefined)
        ret
    }
    @scala.inline
    def withCc_load_policy(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc_load_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCc_load_policy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc_load_policy")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: red | white): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablekb(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablekb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablekb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablekb")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablejsapi(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablejsapi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablejsapi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablejsapi")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withFs(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(js.undefined)
        ret
    }
    @scala.inline
    def withHl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hl")(js.undefined)
        ret
    }
    @scala.inline
    def withIv_load_policy(value: `1` | `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv_load_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIv_load_policy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv_load_policy")(js.undefined)
        ret
    }
    @scala.inline
    def withList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withListType(value: playlist | search | user_uploads): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withModestbranding(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modestbranding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModestbranding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modestbranding")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaylist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlist")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaysinline(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playsinline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaysinline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playsinline")(js.undefined)
        ret
    }
    @scala.inline
    def withRel(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withWidget_referrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget_referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidget_referrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget_referrer")(js.undefined)
        ret
    }
  }
  
}

