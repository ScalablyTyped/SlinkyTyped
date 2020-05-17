package typingsSlinky.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoHash extends js.Object {
  /**
    * OpenSubtitles file hash for the video.
    */
  var videoHash: String = js.native
  /**
    * Size of the video file in bytes.
    */
  var videoSize: String = js.native
}

object VideoHash {
  @scala.inline
  def apply(videoHash: String, videoSize: String): VideoHash = {
    val __obj = js.Dynamic.literal(videoHash = videoHash.asInstanceOf[js.Any], videoSize = videoSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoHash]
  }
  @scala.inline
  implicit class VideoHashOps[Self <: VideoHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVideoHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

