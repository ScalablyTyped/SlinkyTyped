package typingsSlinky.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  /**
  		 * Event fired to indicate thath the player has loaded, or unloaded, a module
  		 * with exposed API methods. This currently only occurs for closed captioning.
  		 */
  var onApiChange: js.UndefOr[PlayerEventHandler[PlayerEvent]] = js.native
  /**
  		 * Event fired when an error in the player occurs
  		 */
  var onError: js.UndefOr[PlayerEventHandler[OnErrorEvent]] = js.native
  /**
  		 * Event fired when the playback quality of the player changes.
  		 */
  var onPlaybackQualityChange: js.UndefOr[PlayerEventHandler[OnPlaybackQualityChangeEvent]] = js.native
  /**
  		 * Event fired when the playback rate of the player changes.
  		 */
  var onPlaybackRateChange: js.UndefOr[PlayerEventHandler[OnPlaybackRateChangeEvent]] = js.native
  /**
  		 * Event fired when a player has finished loading and is ready to begin receiving API calls.
  		 */
  var onReady: js.UndefOr[PlayerEventHandler[PlayerEvent]] = js.native
  /**
  		 * Event fired when the player's state changes.
  		 */
  var onStateChange: js.UndefOr[PlayerEventHandler[OnStateChangeEvent]] = js.native
}

object Events {
  @scala.inline
  def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnApiChange(value: PlayerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onApiChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnApiChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onApiChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: OnErrorEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaybackQualityChange(value: OnPlaybackQualityChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaybackQualityChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlaybackQualityChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaybackQualityChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaybackRateChange(value: OnPlaybackRateChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaybackRateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlaybackRateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaybackRateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(value: PlayerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStateChange(value: OnStateChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.undefined)
        ret
    }
  }
  
}

