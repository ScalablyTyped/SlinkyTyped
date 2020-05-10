package typingsSlinky.twitchExt

import typingsSlinky.twitchExt.twitchExtStrings.`chat-only`
import typingsSlinky.twitchExt.twitchExtStrings.audio
import typingsSlinky.twitchExt.twitchExtStrings.config
import typingsSlinky.twitchExt.twitchExtStrings.dark
import typingsSlinky.twitchExt.twitchExtStrings.dashboard
import typingsSlinky.twitchExt.twitchExtStrings.light
import typingsSlinky.twitchExt.twitchExtStrings.remote
import typingsSlinky.twitchExt.twitchExtStrings.video
import typingsSlinky.twitchExt.twitchExtStrings.viewer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<twitch-ext.TwitchExtContext> */
@js.native
trait PartialTwitchExtContext extends js.Object {
  var arePlayerControlsVisible: js.UndefOr[Boolean] = js.native
  var bitrate: js.UndefOr[Double] = js.native
  var bufferSize: js.UndefOr[Double] = js.native
  var displayResolution: js.UndefOr[String] = js.native
  var game: js.UndefOr[String] = js.native
  var hlsLatencyBroadcaster: js.UndefOr[Double] = js.native
  var isFullScreen: js.UndefOr[Boolean] = js.native
  var isMuted: js.UndefOr[Boolean] = js.native
  var isPaused: js.UndefOr[Boolean] = js.native
  var isTheatreMode: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var mode: js.UndefOr[viewer | dashboard | config] = js.native
  var playbackMode: js.UndefOr[video | audio | remote | `chat-only`] = js.native
  var theme: js.UndefOr[light | dark] = js.native
  var videoResolution: js.UndefOr[String] = js.native
  var volume: js.UndefOr[Double] = js.native
}

object PartialTwitchExtContext {
  @scala.inline
  def apply(): PartialTwitchExtContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTwitchExtContext]
  }
  @scala.inline
  implicit class PartialTwitchExtContextOps[Self <: PartialTwitchExtContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArePlayerControlsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arePlayerControlsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArePlayerControlsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arePlayerControlsVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayResolution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withGame(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("game")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("game")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsLatencyBroadcaster(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hlsLatencyBroadcaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsLatencyBroadcaster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hlsLatencyBroadcaster")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMuted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMuted")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTheatreMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTheatreMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTheatreMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTheatreMode")(js.undefined)
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
    def withMode(value: viewer | dashboard | config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaybackMode(value: video | audio | remote | `chat-only`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaybackMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: light | dark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoResolution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
  }
  
}

