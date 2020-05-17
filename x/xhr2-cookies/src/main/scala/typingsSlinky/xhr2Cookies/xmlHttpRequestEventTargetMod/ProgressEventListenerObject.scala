package typingsSlinky.xhr2Cookies.xmlHttpRequestEventTargetMod

import typingsSlinky.xhr2Cookies.progressEventMod.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressEventListenerObject extends ProgressEventListenerOrEventListenerObject {
  def handleEvent(event: ProgressEvent): Unit = js.native
}

object ProgressEventListenerObject {
  @scala.inline
  def apply(handleEvent: ProgressEvent => Unit): ProgressEventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[ProgressEventListenerObject]
  }
  @scala.inline
  implicit class ProgressEventListenerObjectOps[Self <: ProgressEventListenerObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleEvent(value: ProgressEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

