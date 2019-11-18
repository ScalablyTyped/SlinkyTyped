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
}

