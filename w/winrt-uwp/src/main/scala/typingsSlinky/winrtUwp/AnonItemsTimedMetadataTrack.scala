package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemsTimedMetadataTrack extends js.Object {
  /** The timed metadata tracks that start at startIndex in the list. */ var items: TimedMetadataTrack = js.native
  /** The number of timed metadata tracks retrieved. */ var returnValue: Double = js.native
}

object AnonItemsTimedMetadataTrack {
  @scala.inline
  def apply(items: TimedMetadataTrack, returnValue: Double): AnonItemsTimedMetadataTrack = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsTimedMetadataTrack]
  }
  @scala.inline
  implicit class AnonItemsTimedMetadataTrackOps[Self <: AnonItemsTimedMetadataTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: TimedMetadataTrack): Self = {
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

