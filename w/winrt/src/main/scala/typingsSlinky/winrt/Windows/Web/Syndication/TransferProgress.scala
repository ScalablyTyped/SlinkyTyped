package typingsSlinky.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferProgress extends js.Object {
  var bytesRetrieved: Double = js.native
  var bytesSent: Double = js.native
  var totalBytesToRetrieve: Double = js.native
  var totalBytesToSend: Double = js.native
}

object TransferProgress {
  @scala.inline
  def apply(bytesRetrieved: Double, bytesSent: Double, totalBytesToRetrieve: Double, totalBytesToSend: Double): TransferProgress = {
    val __obj = js.Dynamic.literal(bytesRetrieved = bytesRetrieved.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], totalBytesToRetrieve = totalBytesToRetrieve.asInstanceOf[js.Any], totalBytesToSend = totalBytesToSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferProgress]
  }
  @scala.inline
  implicit class TransferProgressOps[Self <: TransferProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesRetrieved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesRetrieved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytesSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytesToRetrieve(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesToRetrieve")(value.asInstanceOf[js.Any])
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

