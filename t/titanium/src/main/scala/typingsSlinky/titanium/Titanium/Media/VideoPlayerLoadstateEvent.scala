package typingsSlinky.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the network [loadState](Titanium.Media.VideoPlayer.loadState) changes.
		 */
@js.native
trait VideoPlayerLoadstateEvent extends VideoPlayerBaseEvent {
  /**
  			 * Current value of the [loadState](Titanium.Media.VideoPlayer.loadState) property.
  			 */
  var loadState: Double = js.native
}

object VideoPlayerLoadstateEvent {
  @scala.inline
  def apply(loadState: Double, source: VideoPlayer): VideoPlayerLoadstateEvent = {
    val __obj = js.Dynamic.literal(loadState = loadState.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerLoadstateEvent]
  }
  @scala.inline
  implicit class VideoPlayerLoadstateEventOps[Self <: VideoPlayerLoadstateEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

