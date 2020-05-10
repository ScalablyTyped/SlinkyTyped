package typingsSlinky.youtubePlayer

import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ eventType in youtube-player.youtube-player/dist/eventNames.EventType ]:? (event : std.CustomEvent<any>): void} */
@js.native
trait eventTypeinEventTypeevent extends js.Object {
  var apiChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var playbackQualityChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var playbackRateChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var ready: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var stateChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var volumeChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
}

object eventTypeinEventTypeevent {
  @scala.inline
  def apply(): eventTypeinEventTypeevent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[eventTypeinEventTypeevent]
  }
  @scala.inline
  implicit class eventTypeinEventTypeeventOps[Self <: eventTypeinEventTypeevent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiChange(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApiChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiChange")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaybackQualityChange(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackQualityChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPlaybackQualityChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackQualityChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaybackRateChange(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPlaybackRateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChange(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeChange(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutVolumeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeChange")(js.undefined)
        ret
    }
  }
  
}

