package typingsSlinky.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the currently playing movie changes.
		 */
@js.native
trait VideoPlayerPlayingEvent extends VideoPlayerBaseEvent {
  /**
  			 * URL of the media.
  			 */
  var url: String = js.native
}

object VideoPlayerPlayingEvent {
  @scala.inline
  def apply(source: VideoPlayer, url: String): VideoPlayerPlayingEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerPlayingEvent]
  }
  @scala.inline
  implicit class VideoPlayerPlayingEventOps[Self <: VideoPlayerPlayingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

