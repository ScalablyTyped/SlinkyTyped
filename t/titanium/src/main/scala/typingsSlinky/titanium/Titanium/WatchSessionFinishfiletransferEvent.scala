package typingsSlinky.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * App completed file transfer to watch app.
	 */
@js.native
trait WatchSessionFinishfiletransferEvent extends WatchSessionBaseEvent {
  /**
  		 * Error code if transfer failed.
  		 */
  var errorCode: Double = js.native
  /**
  		 * URL of the file transferred.
  		 */
  var fileURL: String = js.native
  /**
  		 * Error message if any.
  		 */
  var message: String = js.native
  /**
  		 * meta data of the file transferred.
  		 */
  var metaData: js.Any = js.native
  /**
  		 * If the transfer was successful.
  		 */
  var success: Boolean = js.native
}

object WatchSessionFinishfiletransferEvent {
  @scala.inline
  def apply(
    errorCode: Double,
    fileURL: String,
    message: String,
    metaData: js.Any,
    source: WatchSession,
    success: Boolean
  ): WatchSessionFinishfiletransferEvent = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], fileURL = fileURL.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionFinishfiletransferEvent]
  }
  @scala.inline
  implicit class WatchSessionFinishfiletransferEventOps[Self <: WatchSessionFinishfiletransferEvent] (val x: Self) extends AnyVal {
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
    def withFileURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileURL")(value.asInstanceOf[js.Any])
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

