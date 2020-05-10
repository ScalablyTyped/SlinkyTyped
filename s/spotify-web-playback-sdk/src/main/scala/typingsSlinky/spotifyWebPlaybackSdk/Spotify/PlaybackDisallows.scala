package typingsSlinky.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaybackDisallows extends js.Object {
  var pausing: Boolean = js.native
  var peeking_next: Boolean = js.native
  var peeking_prev: Boolean = js.native
  var resuming: Boolean = js.native
  var seeking: Boolean = js.native
  var skipping_next: Boolean = js.native
  var skipping_prev: Boolean = js.native
}

object PlaybackDisallows {
  @scala.inline
  def apply(
    pausing: Boolean,
    peeking_next: Boolean,
    peeking_prev: Boolean,
    resuming: Boolean,
    seeking: Boolean,
    skipping_next: Boolean,
    skipping_prev: Boolean
  ): PlaybackDisallows = {
    val __obj = js.Dynamic.literal(pausing = pausing.asInstanceOf[js.Any], peeking_next = peeking_next.asInstanceOf[js.Any], peeking_prev = peeking_prev.asInstanceOf[js.Any], resuming = resuming.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], skipping_next = skipping_next.asInstanceOf[js.Any], skipping_prev = skipping_prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackDisallows]
  }
  @scala.inline
  implicit class PlaybackDisallowsOps[Self <: PlaybackDisallows] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPausing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pausing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeeking_next(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peeking_next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeeking_prev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peeking_prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResuming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resuming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeeking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seeking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipping_next(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipping_next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipping_prev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipping_prev")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

