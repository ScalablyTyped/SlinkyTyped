package typingsSlinky.vmap.mod

import typingsSlinky.vmap.vmapStrings.breakEnd
import typingsSlinky.vmap.vmapStrings.breakStart
import typingsSlinky.vmap.vmapStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a VMAP tracking event
  */
@js.native
trait VMAPTrackingEvent extends js.Object {
  /**
    * The name of the event to track for the element. Can be one of breakStart, breakEnd or error
    */
  var event: breakStart | breakEnd | error = js.native
  /**
    * The URI of the tracker
    */
  var uri: String = js.native
}

object VMAPTrackingEvent {
  @scala.inline
  def apply(event: breakStart | breakEnd | error, uri: String): VMAPTrackingEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[VMAPTrackingEvent]
  }
  @scala.inline
  implicit class VMAPTrackingEventOps[Self <: VMAPTrackingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: breakStart | breakEnd | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

