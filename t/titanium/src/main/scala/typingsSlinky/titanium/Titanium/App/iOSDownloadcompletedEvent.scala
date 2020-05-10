package typingsSlinky.titanium.Titanium.App

import typingsSlinky.titanium.Titanium.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired to indicate that a [urlSession's](Modules.URLSession) download task has finished downloading.
		 * Available only on iOS 7 and later.
		 */
@js.native
trait iOSDownloadcompletedEvent extends iOSBaseEvent {
  /**
  			 * The downloaded data as a Titanium.Blob object.
  			 */
  var data: Blob = js.native
  /**
  			 * The `urlSession` session identifier. If it does not exist, this property is not provided.
  			 * This property is available since Titanium Mobile 5.4.0.GA.
  			 */
  var sessionIdentifier: String = js.native
  /**
  			 * The `urlSession` download task's identifier.
  			 */
  var taskIdentifier: Double = js.native
}

object iOSDownloadcompletedEvent {
  @scala.inline
  def apply(data: Blob, sessionIdentifier: String, source: iOS, taskIdentifier: Double): iOSDownloadcompletedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sessionIdentifier = sessionIdentifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], taskIdentifier = taskIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSDownloadcompletedEvent]
  }
  @scala.inline
  implicit class iOSDownloadcompletedEventOps[Self <: iOSDownloadcompletedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskIdentifier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

