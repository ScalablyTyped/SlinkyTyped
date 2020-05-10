package typingsSlinky.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerVars extends js.Object {
  /**
  		 * Whether to autohide video controls (by default, HideProgressBar).
  		 */
  var autohide: js.UndefOr[AutoHide] = js.native
  /**
  		 * Whether to autoplay the video (by default, NoAutoPlay).
  		 */
  var autoplay: js.UndefOr[AutoPlay] = js.native
  /**
  		 * Whether to use user-preferred or forced caption loading (by default, UserDefault).
  		 */
  var cc_load_policy: js.UndefOr[ClosedCaptionsLoadPolicy] = js.native
  /**
  		 * Player progress bar color
  		 */
  var color: js.UndefOr[ProgressBarColor] = js.native
  /**
  		 * How video controls are shown (by default, ShowLoadPlayer).
  		 */
  var controls: js.UndefOr[Controls] = js.native
  /**
  		 * Whether to allow keyboard controls (by default, Enable).
  		 */
  var disablekb: js.UndefOr[KeyboardControls] = js.native
  /**
  		 * Whether the JavaScript API should be enabled (by default, Disable).
  		 */
  var enablejsapi: js.UndefOr[JsApi] = js.native
  /**
  		 * Time, in seconds from the beginning of the video, when to stop playing.
  		 */
  var end: js.UndefOr[Double] = js.native
  /**
  		 * Whether to display the full-screen button (by default, Show).
  		 */
  var fs: js.UndefOr[FullscreenButton] = js.native
  /**
  		 * Player language as an ISO 639-1 two-letter language code or fully-specified locale.
  		 */
  var hl: js.UndefOr[String] = js.native
  /**
  		 * Whether to show video annotations (by default, Show).
  		 */
  var iv_load_policy: js.UndefOr[IvLoadPolicy] = js.native
  /**
  		 * Identifies content that will load.
  		 * If listType is search, this is the search query.
  		 * If listType is user_uploads, this is the YouTube user.
  		 * If listType is playlist, this is the playlist ID, prepended by 'PL'.
  		 */
  var list: js.UndefOr[String] = js.native
  /**
  		 * Which type of content loads in the player.
  		 */
  var listType: js.UndefOr[ListType] = js.native
  /**
  		 * Whether a single video should be looped (by default, SinglePlay).
  		 */
  var loop: js.UndefOr[Loop] = js.native
  /**
  		 * Whether to hide some YouTube branding (by default, Full).
  		 */
  var modestbranding: js.UndefOr[ModestBranding] = js.native
  /**
  		 * Origin domain for additional security if using the JavaScript API.
  		 */
  var origin: js.UndefOr[String] = js.native
  /**
  		 * Comma separated list of video IDs to play after the URL path's video.
  		 */
  var playlist: js.UndefOr[String] = js.native
  /**
  		 * Whether videos play inline or fullscreen in an HTML5 player on iOS. (currently by default, Fullscreen).
  		 */
  var playsinline: js.UndefOr[PlaysInline] = js.native
  /**
  		 * Whether to show related videos after the video finishes (by default, Show).
  		 */
  var rel: js.UndefOr[RelatedVideos] = js.native
  /**
  		 * Whether to show video information before playing (by default, Show).
  		 */
  var showinfo: js.UndefOr[ShowInfo] = js.native
  /**
  		 * Time, in seconds from the beginning of the video, when to start playing.
  		 */
  var start: js.UndefOr[Double] = js.native
}

object PlayerVars {
  @scala.inline
  def apply(): PlayerVars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerVars]
  }
  @scala.inline
  implicit class PlayerVarsOps[Self <: PlayerVars] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutohide(value: AutoHide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutohide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohide")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: AutoPlay): Self = {
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
    def withCc_load_policy(value: ClosedCaptionsLoadPolicy): Self = {
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
    def withColor(value: ProgressBarColor): Self = {
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
    def withControls(value: Controls): Self = {
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
    def withDisablekb(value: KeyboardControls): Self = {
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
    def withEnablejsapi(value: JsApi): Self = {
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
    def withFs(value: FullscreenButton): Self = {
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
    def withIv_load_policy(value: IvLoadPolicy): Self = {
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
    def withListType(value: ListType): Self = {
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
    def withLoop(value: Loop): Self = {
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
    def withModestbranding(value: ModestBranding): Self = {
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
    def withPlaysinline(value: PlaysInline): Self = {
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
    def withRel(value: RelatedVideos): Self = {
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
    def withShowinfo(value: ShowInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showinfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowinfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showinfo")(js.undefined)
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
  }
  
}

