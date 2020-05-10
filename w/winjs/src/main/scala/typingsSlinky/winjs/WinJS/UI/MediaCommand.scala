package typingsSlinky.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration of Media commands that the transport bar buttons support.
  **/
@js.native
trait MediaCommand extends js.Object {
  var audioTracks: String = js.native
  var cast: String = js.native
  var chapterSkipBack: String = js.native
  var chapterSkipForward: String = js.native
  var closedCaptions: String = js.native
  var fastForward: String = js.native
  var goToLive: String = js.native
  var nextTrack: String = js.native
  var pause: String = js.native
  var play: String = js.native
  var playFromBeginning: String = js.native
  var playbackRate: String = js.native
  var previousTrack: String = js.native
  var rewind: String = js.native
  var seek: String = js.native
  var stop: String = js.native
  var timeSkipBack: String = js.native
  var timeSkipForward: String = js.native
  var volume: String = js.native
  var zoom: String = js.native
}

object MediaCommand {
  @scala.inline
  def apply(
    audioTracks: String,
    cast: String,
    chapterSkipBack: String,
    chapterSkipForward: String,
    closedCaptions: String,
    fastForward: String,
    goToLive: String,
    nextTrack: String,
    pause: String,
    play: String,
    playFromBeginning: String,
    playbackRate: String,
    previousTrack: String,
    rewind: String,
    seek: String,
    stop: String,
    timeSkipBack: String,
    timeSkipForward: String,
    volume: String,
    zoom: String
  ): MediaCommand = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks.asInstanceOf[js.Any], cast = cast.asInstanceOf[js.Any], chapterSkipBack = chapterSkipBack.asInstanceOf[js.Any], chapterSkipForward = chapterSkipForward.asInstanceOf[js.Any], closedCaptions = closedCaptions.asInstanceOf[js.Any], fastForward = fastForward.asInstanceOf[js.Any], goToLive = goToLive.asInstanceOf[js.Any], nextTrack = nextTrack.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playFromBeginning = playFromBeginning.asInstanceOf[js.Any], playbackRate = playbackRate.asInstanceOf[js.Any], previousTrack = previousTrack.asInstanceOf[js.Any], rewind = rewind.asInstanceOf[js.Any], seek = seek.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], timeSkipBack = timeSkipBack.asInstanceOf[js.Any], timeSkipForward = timeSkipForward.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCommand]
  }
  @scala.inline
  implicit class MediaCommandOps[Self <: MediaCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioTracks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChapterSkipBack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chapterSkipBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChapterSkipForward(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chapterSkipForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosedCaptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedCaptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFastForward(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToLive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextTrack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayFromBeginning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playFromBeginning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaybackRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousTrack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRewind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSkipBack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSkipBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSkipForward(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSkipForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

