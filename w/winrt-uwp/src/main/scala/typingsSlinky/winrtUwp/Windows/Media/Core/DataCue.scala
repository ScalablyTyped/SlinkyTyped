package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a data cue that can be included in a TimedMetadataTrack . */
@js.native
trait DataCue extends js.Object {
  /** Gets the data associated with the cue. */
  var data: IBuffer = js.native
  /** Gets or sets the duration of the cue. */
  var duration: Double = js.native
  /** Gets the identifier for the timed metadata track. */
  var id: String = js.native
  /** Gets the start time of the cue. */
  var startTime: Double = js.native
}

object DataCue {
  @scala.inline
  def apply(data: IBuffer, duration: Double, id: String, startTime: Double): DataCue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCue]
  }
  @scala.inline
  implicit class DataCueOps[Self <: DataCue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

