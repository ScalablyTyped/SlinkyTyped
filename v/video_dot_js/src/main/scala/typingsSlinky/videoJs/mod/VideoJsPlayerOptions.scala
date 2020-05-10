package typingsSlinky.videoJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.videoJs.mod.videojs.ComponentOptions
import typingsSlinky.videoJs.mod.videojs.ControlBarOptions
import typingsSlinky.videoJs.mod.videojs.LanguageTranslations
import typingsSlinky.videoJs.mod.videojs.Tech.SourceObject
import typingsSlinky.videoJs.mod.videojs.TextTrackOptions
import typingsSlinky.videoJs.mod.videojs.TextTrackSettingsOptions
import typingsSlinky.videoJs.videoJsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoJsPlayerOptions extends ComponentOptions {
  var aspectRatio: js.UndefOr[String] = js.native
  var autoplay: js.UndefOr[Boolean | String] = js.native
  var controlBar: js.UndefOr[ControlBarOptions | `false`] = js.native
  var controls: js.UndefOr[Boolean] = js.native
  var defaultVolume: js.UndefOr[Double] = js.native
  var fluid: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var html5: js.UndefOr[js.Any] = js.native
  var inactivityTimeout: js.UndefOr[Double] = js.native
  var language: js.UndefOr[String] = js.native
  var languages: js.UndefOr[StringDictionary[LanguageTranslations]] = js.native
  var liveui: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  var nativeControlsForTouch: js.UndefOr[Boolean] = js.native
  var notSupportedMessage: js.UndefOr[String] = js.native
  var playbackRates: js.UndefOr[js.Array[Double]] = js.native
  var plugins: js.UndefOr[js.Object] = js.native
  var poster: js.UndefOr[String] = js.native
  var preload: js.UndefOr[String] = js.native
  var sourceOrder: js.UndefOr[Boolean] = js.native
  var sources: js.UndefOr[js.Array[SourceObject]] = js.native
  var src: js.UndefOr[String] = js.native
  var techOrder: js.UndefOr[js.Array[String]] = js.native
  var textTrackSettings: js.UndefOr[TextTrackSettingsOptions] = js.native
  var tracks: js.UndefOr[js.Array[TextTrackOptions]] = js.native
  var width: js.UndefOr[Double] = js.native
}

object VideoJsPlayerOptions {
  @scala.inline
  def apply(): VideoJsPlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoJsPlayerOptions]
  }
  @scala.inline
  implicit class VideoJsPlayerOptionsOps[Self <: VideoJsPlayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean | String): Self = {
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
    def withControlBar(value: ControlBarOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlBar")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: Boolean): Self = {
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
    def withDefaultVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withFluid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFluid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluid")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml5(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5")(js.undefined)
        ret
    }
    @scala.inline
    def withInactivityTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactivityTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactivityTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactivityTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguages(value: StringDictionary[LanguageTranslations]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveui(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveui: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveui")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
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
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeControlsForTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeControlsForTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeControlsForTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeControlsForTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withNotSupportedMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSupportedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotSupportedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSupportedMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaybackRates(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaybackRates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRates")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPoster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: js.Array[SourceObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withTechOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("techOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTechOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("techOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withTextTrackSettings(value: TextTrackSettingsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTrackSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTrackSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTrackSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTracks(value: js.Array[TextTrackOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

