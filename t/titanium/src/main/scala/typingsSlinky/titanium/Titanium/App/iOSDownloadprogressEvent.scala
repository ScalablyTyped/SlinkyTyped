package typingsSlinky.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired periodically to inform the app about the download's progress of a [urlSession](Modules.URLSession).
		 * Available only on iOS 7 and later.
		 */
@js.native
trait iOSDownloadprogressEvent extends iOSBaseEvent {
  /**
  			 * The number of bytes transferred since the last time this event was fired.
  			 */
  var bytesWritten: Double = js.native
  /**
  			 * The `urlSession` session identifier. If it does not exist, this property is not provided.
  			 * This property is available since Titanium Mobile 5.4.0.GA.
  			 */
  var sessionIdentifier: String = js.native
  /**
  			 * The `urlSession` download task's identifier.
  			 */
  var taskIdentifier: Double = js.native
  /**
  			 * The expected length of the file, as provided by the Content-Length header. If this
  			 * header was not provided, the value is zero.
  			 */
  var totalBytesExpectedToWrite: Double = js.native
  /**
  			 * The total number of bytes transferred so far.
  			 */
  var totalBytesWritten: Double = js.native
}

object iOSDownloadprogressEvent {
  @scala.inline
  def apply(
    bytesWritten: Double,
    sessionIdentifier: String,
    source: iOS,
    taskIdentifier: Double,
    totalBytesExpectedToWrite: Double,
    totalBytesWritten: Double
  ): iOSDownloadprogressEvent = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], sessionIdentifier = sessionIdentifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], taskIdentifier = taskIdentifier.asInstanceOf[js.Any], totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSDownloadprogressEvent]
  }
  @scala.inline
  implicit class iOSDownloadprogressEventOps[Self <: iOSDownloadprogressEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesWritten(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesWritten")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTotalBytesExpectedToWrite(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesExpectedToWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytesWritten(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesWritten")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

