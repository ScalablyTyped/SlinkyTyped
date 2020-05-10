package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSInputMethodContextEventMap extends js.Object {
  var MSCandidateWindowHide: Event_ = js.native
  var MSCandidateWindowShow: Event_ = js.native
  var MSCandidateWindowUpdate: Event_ = js.native
}

object MSInputMethodContextEventMap {
  @scala.inline
  def apply(MSCandidateWindowHide: Event_, MSCandidateWindowShow: Event_, MSCandidateWindowUpdate: Event_): MSInputMethodContextEventMap = {
    val __obj = js.Dynamic.literal(MSCandidateWindowHide = MSCandidateWindowHide.asInstanceOf[js.Any], MSCandidateWindowShow = MSCandidateWindowShow.asInstanceOf[js.Any], MSCandidateWindowUpdate = MSCandidateWindowUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSInputMethodContextEventMap]
  }
  @scala.inline
  implicit class MSInputMethodContextEventMapOps[Self <: MSInputMethodContextEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSCandidateWindowHide(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSCandidateWindowHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSCandidateWindowShow(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSCandidateWindowShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSCandidateWindowUpdate(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSCandidateWindowUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

