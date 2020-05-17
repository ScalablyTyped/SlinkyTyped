package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSInputMethodContextEventMap extends js.Object {
  var MSCandidateWindowHide: org.scalajs.dom.raw.Event = js.native
  var MSCandidateWindowShow: org.scalajs.dom.raw.Event = js.native
  var MSCandidateWindowUpdate: org.scalajs.dom.raw.Event = js.native
}

object MSInputMethodContextEventMap {
  @scala.inline
  def apply(
    MSCandidateWindowHide: org.scalajs.dom.raw.Event,
    MSCandidateWindowShow: org.scalajs.dom.raw.Event,
    MSCandidateWindowUpdate: org.scalajs.dom.raw.Event
  ): MSInputMethodContextEventMap = {
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
    def withMSCandidateWindowHide(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSCandidateWindowHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSCandidateWindowShow(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSCandidateWindowShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSCandidateWindowUpdate(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSCandidateWindowUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

