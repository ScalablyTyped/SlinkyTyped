package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Media.Core.VideoTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemsVideoTrack extends js.Object {
  /** The video tracks that start at startIndex in the list. */ var items: VideoTrack = js.native
  /** The number of video tracks retrieved. */ var returnValue: Double = js.native
}

object AnonItemsVideoTrack {
  @scala.inline
  def apply(items: VideoTrack, returnValue: Double): AnonItemsVideoTrack = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsVideoTrack]
  }
  @scala.inline
  implicit class AnonItemsVideoTrackOps[Self <: AnonItemsVideoTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: VideoTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

