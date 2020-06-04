package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSInputMethodContextEventMap extends js.Object {
  var MSCandidateWindowHide: org.scalajs.dom.raw.Event
  var MSCandidateWindowShow: org.scalajs.dom.raw.Event
  var MSCandidateWindowUpdate: org.scalajs.dom.raw.Event
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMSCandidateWindowHide(value: org.scalajs.dom.raw.Event): Self = this.set("MSCandidateWindowHide", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSCandidateWindowShow(value: org.scalajs.dom.raw.Event): Self = this.set("MSCandidateWindowShow", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSCandidateWindowUpdate(value: org.scalajs.dom.raw.Event): Self = this.set("MSCandidateWindowUpdate", value.asInstanceOf[js.Any])
  }
  
}

