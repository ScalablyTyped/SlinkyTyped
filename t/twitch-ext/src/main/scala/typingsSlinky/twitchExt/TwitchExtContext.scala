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

/**
  * The result object as passed to the onContext callback.
  *
  * @see TwitchExt.onContext
  */
@js.native
trait TwitchExtContext extends js.Object {
  /**
  	 * If true, player controls are visible (e.g., due to mouseover).
  	 * Do not use this for mobile extensions; it is not sent for mobile.
  	 */
  var arePlayerControlsVisible: Boolean = js.native
  /**
  	 * Bitrate of the broadcast.
  	 */
  var bitrate: Double = js.native
  /**
  	 * Buffer size of the broadcast.
  	 */
  var bufferSize: Double = js.native
  /**
  	 * Display size of the player.
  	 */
  var displayResolution: String = js.native
  /**
  	 * Game being broadcast.
  	 */
  var game: String = js.native
  /**
  	 * Number of seconds of latency between the broadcaster and viewer.
  	 */
  var hlsLatencyBroadcaster: Double = js.native
  /**
  	 * If true, the viewer is watching in fullscreen mode.
  	 * Do not use this for mobile extensions; it is not sent for mobile.
  	 */
  var isFullScreen: Boolean = js.native
  /**
  	 * If true, the viewer has muted the stream.
  	 */
  var isMuted: Boolean = js.native
  /**
  	 * If true, the viewer has paused the stream.
  	 */
  var isPaused: Boolean = js.native
  /**
  	 * If true, the viewer is watching in theater mode.
  	 * Do not use this for mobile extensions; it is not sent for mobile.
  	 */
  var isTheatreMode: Boolean = js.native
  /**
  	 * Language of the broadcast (e.g., "en").
  	 */
  var language: String = js.native
  /**
  	 * The mode the extension is currently run in.
  	 */
  var mode: viewer | dashboard | config = js.native
  /**
  	 * Indicates how the stream is being played.
  	 */
  var playbackMode: video | audio | remote | `chat-only` = js.native
  /**
  	 * The user’s theme setting on the Twitch website.
  	 */
  var theme: light | dark = js.native
  /**
  	 * Resolution of the broadcast.
  	 */
  var videoResolution: String = js.native
  /**
  	 * Currently selected player volume. Valid values: between 0 and 1.
  	 */
  var volume: Double = js.native
}

object TwitchExtContext {
  @scala.inline
  def apply(
    arePlayerControlsVisible: Boolean,
    bitrate: Double,
    bufferSize: Double,
    displayResolution: String,
    game: String,
    hlsLatencyBroadcaster: Double,
    isFullScreen: Boolean,
    isMuted: Boolean,
    isPaused: Boolean,
    isTheatreMode: Boolean,
    language: String,
    mode: viewer | dashboard | config,
    playbackMode: video | audio | remote | `chat-only`,
    theme: light | dark,
    videoResolution: String,
    volume: Double
  ): TwitchExtContext = {
    val __obj = js.Dynamic.literal(arePlayerControlsVisible = arePlayerControlsVisible.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any], displayResolution = displayResolution.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], hlsLatencyBroadcaster = hlsLatencyBroadcaster.asInstanceOf[js.Any], isFullScreen = isFullScreen.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], isTheatreMode = isTheatreMode.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], playbackMode = playbackMode.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], videoResolution = videoResolution.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtContext]
  }
  @scala.inline
  implicit class TwitchExtContextOps[Self <: TwitchExtContext] (val x: Self) extends AnyVal {
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
    def withBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayResolution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGame(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("game")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHlsLatencyBroadcaster(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hlsLatencyBroadcaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMuted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTheatreMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTheatreMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: viewer | dashboard | config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaybackMode(value: video | audio | remote | `chat-only`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: light | dark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoResolution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

