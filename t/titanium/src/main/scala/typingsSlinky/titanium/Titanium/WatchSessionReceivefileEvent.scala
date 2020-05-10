package typingsSlinky.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * App received file from apple watch in background.
	 */
@js.native
trait WatchSessionReceivefileEvent extends WatchSessionBaseEvent {
  /**
  		 * The downloaded data as a Titanium.Blob object.
  		 */
  var data: Blob = js.native
  /**
  		 * Error code if transfer failed.
  		 */
  var errorCode: Double = js.native
  /**
  		 * Error message if any.
  		 */
  var message: String = js.native
  /**
  		 * Information about the file.
  		 */
  var metaData: js.Any = js.native
  /**
  		 * If the transfer was successful.
  		 */
  var success: Boolean = js.native
}

object WatchSessionReceivefileEvent {
  @scala.inline
  def apply(
    data: Blob,
    errorCode: Double,
    message: String,
    metaData: js.Any,
    source: WatchSession,
    success: Boolean
  ): WatchSessionReceivefileEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionReceivefileEvent]
  }
  @scala.inline
  implicit class WatchSessionReceivefileEventOps[Self <: WatchSessionReceivefileEvent] (val x: Self) extends AnyVal {
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
    def withMetaData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

