package typingsSlinky.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaybackRestrictions extends js.Object {
  var disallow_pausing_reasons: js.Array[String] = js.native
  var disallow_peeking_next_reasons: js.Array[String] = js.native
  var disallow_peeking_prev_reasons: js.Array[String] = js.native
  var disallow_resuming_reasons: js.Array[String] = js.native
  var disallow_seeking_reasons: js.Array[String] = js.native
  var disallow_skipping_next_reasons: js.Array[String] = js.native
  var disallow_skipping_prev_reasons: js.Array[String] = js.native
}

object PlaybackRestrictions {
  @scala.inline
  def apply(
    disallow_pausing_reasons: js.Array[String],
    disallow_peeking_next_reasons: js.Array[String],
    disallow_peeking_prev_reasons: js.Array[String],
    disallow_resuming_reasons: js.Array[String],
    disallow_seeking_reasons: js.Array[String],
    disallow_skipping_next_reasons: js.Array[String],
    disallow_skipping_prev_reasons: js.Array[String]
  ): PlaybackRestrictions = {
    val __obj = js.Dynamic.literal(disallow_pausing_reasons = disallow_pausing_reasons.asInstanceOf[js.Any], disallow_peeking_next_reasons = disallow_peeking_next_reasons.asInstanceOf[js.Any], disallow_peeking_prev_reasons = disallow_peeking_prev_reasons.asInstanceOf[js.Any], disallow_resuming_reasons = disallow_resuming_reasons.asInstanceOf[js.Any], disallow_seeking_reasons = disallow_seeking_reasons.asInstanceOf[js.Any], disallow_skipping_next_reasons = disallow_skipping_next_reasons.asInstanceOf[js.Any], disallow_skipping_prev_reasons = disallow_skipping_prev_reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRestrictions]
  }
  @scala.inline
  implicit class PlaybackRestrictionsOps[Self <: PlaybackRestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisallow_pausing_reasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallow_pausing_reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisallow_peeking_next_reasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallow_peeking_next_reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisallow_peeking_prev_reasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallow_peeking_prev_reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisallow_resuming_reasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallow_resuming_reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisallow_seeking_reasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallow_seeking_reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisallow_skipping_next_reasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallow_skipping_next_reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisallow_skipping_prev_reasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallow_skipping_prev_reasons")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

