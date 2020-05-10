package typingsSlinky.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired to indicate that a [urlSession](Modules.URLSession) task finished transferring data.
		 * Available only on iOS 7 and later.
		 */
@js.native
trait iOSSessioncompletedEvent extends iOSBaseEvent {
  /**
  			 * The error code of the error, if any (potentially system-dependent).
  			 */
  var errorCode: Double = js.native
  /**
  			 * A string containing the localized description of the error.
  			 */
  var message: String = js.native
  /**
  			 * The response text for upload tasks (since SDK 7.2.0).
  			 */
  var responseText: String = js.native
  /**
  			 * The `urlSession` session identifier. If it does not exist, this property is not provided.
  			 * This property is available since Titanium Mobile 5.4.0.GA.
  			 */
  var sessionIdentifier: String = js.native
  /**
  			 * The response status code for upload tasks (since SDK 7.2.0).
  			 */
  var statusCode: Double = js.native
  /**
  			 * Indicates if the operation succeeded. Returns true if download succeeded, false otherwise.
  			 */
  var success: Boolean = js.native
  /**
  			 * The `urlSession` download task's identifier.
  			 */
  var taskIdentifier: Double = js.native
}

object iOSSessioncompletedEvent {
  @scala.inline
  def apply(
    errorCode: Double,
    message: String,
    responseText: String,
    sessionIdentifier: String,
    source: iOS,
    statusCode: Double,
    success: Boolean,
    taskIdentifier: Double
  ): iOSSessioncompletedEvent = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], sessionIdentifier = sessionIdentifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], taskIdentifier = taskIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSSessioncompletedEvent]
  }
  @scala.inline
  implicit class iOSSessioncompletedEventOps[Self <: iOSSessioncompletedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
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

