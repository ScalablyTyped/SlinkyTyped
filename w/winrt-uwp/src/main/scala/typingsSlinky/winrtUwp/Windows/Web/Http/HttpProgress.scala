package typingsSlinky.winrtUwp.Windows.Web.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains status information on the progress of an HttpClient operation. */
@js.native
trait HttpProgress extends js.Object {
  /** The total number of bytes received. */
  var bytesReceived: Double = js.native
  /** The total number of bytes sent. */
  var bytesSent: Double = js.native
  /** The number of retries. */
  var retries: Double = js.native
  /** The step in the progress of an HTTP connection. */
  var stage: HttpProgressStage = js.native
  /** The total number of data bytes to receive. */
  var totalBytesToReceive: Double = js.native
  /** The total number of data bytes to send. */
  var totalBytesToSend: Double = js.native
}

object HttpProgress {
  @scala.inline
  def apply(
    bytesReceived: Double,
    bytesSent: Double,
    retries: Double,
    stage: HttpProgressStage,
    totalBytesToReceive: Double,
    totalBytesToSend: Double
  ): HttpProgress = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], totalBytesToReceive = totalBytesToReceive.asInstanceOf[js.Any], totalBytesToSend = totalBytesToSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProgress]
  }
  @scala.inline
  implicit class HttpProgressOps[Self <: HttpProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesReceived(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytesSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStage(value: HttpProgressStage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytesToReceive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesToReceive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytesToSend(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesToSend")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

