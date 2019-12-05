package typingsSlinky.xhr2DashCookies.distXmlDashHttpDashRequestDashEventDashTargetMod

import typingsSlinky.xhr2DashCookies.distProgressDashEventMod.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEventListenerObject extends js.Object {
  def handleEvent(event: ProgressEvent): Unit
}

object ProgressEventListenerObject {
  @scala.inline
  def apply(handleEvent: ProgressEvent => Unit): ProgressEventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[ProgressEventListenerObject]
  }
}

