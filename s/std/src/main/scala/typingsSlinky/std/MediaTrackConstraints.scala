package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTrackConstraints extends MediaTrackConstraintSet {
  var advanced: js.UndefOr[js.Array[org.scalajs.dom.experimental.mediastream.MediaTrackConstraintSet]] = js.native
}

object MediaTrackConstraints {
  @scala.inline
  def apply(): MediaTrackConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraints]
  }
  @scala.inline
  implicit class MediaTrackConstraintsOps[Self <: org.scalajs.dom.experimental.mediastream.MediaTrackConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvanced(value: js.Array[org.scalajs.dom.experimental.mediastream.MediaTrackConstraintSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvanced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanced")(js.undefined)
        ret
    }
  }
  
}

