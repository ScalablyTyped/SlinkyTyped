package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned by the HTMLVideoElement.getVideoPlaybackQuality() method and contains metrics that can be used to determine the playback quality of a video. */
@js.native
trait VideoPlaybackQuality extends js.Object {
  val corruptedVideoFrames: Double = js.native
  val creationTime: Double = js.native
  val droppedVideoFrames: Double = js.native
  val totalFrameDelay: Double = js.native
  val totalVideoFrames: Double = js.native
}

object VideoPlaybackQuality {
  @scala.inline
  def apply(
    corruptedVideoFrames: Double,
    creationTime: Double,
    droppedVideoFrames: Double,
    totalFrameDelay: Double,
    totalVideoFrames: Double
  ): VideoPlaybackQuality = {
    val __obj = js.Dynamic.literal(corruptedVideoFrames = corruptedVideoFrames.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], droppedVideoFrames = droppedVideoFrames.asInstanceOf[js.Any], totalFrameDelay = totalFrameDelay.asInstanceOf[js.Any], totalVideoFrames = totalVideoFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlaybackQuality]
  }
  @scala.inline
  implicit class VideoPlaybackQualityOps[Self <: VideoPlaybackQuality] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorruptedVideoFrames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corruptedVideoFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDroppedVideoFrames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppedVideoFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalFrameDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFrameDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalVideoFrames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalVideoFrames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

