package typingsSlinky.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrievalProgress extends js.Object {
  var bytesRetrieved: Double = js.native
  var totalBytesToRetrieve: Double = js.native
}

object RetrievalProgress {
  @scala.inline
  def apply(bytesRetrieved: Double, totalBytesToRetrieve: Double): RetrievalProgress = {
    val __obj = js.Dynamic.literal(bytesRetrieved = bytesRetrieved.asInstanceOf[js.Any], totalBytesToRetrieve = totalBytesToRetrieve.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrievalProgress]
  }
  @scala.inline
  implicit class RetrievalProgressOps[Self <: RetrievalProgress] (val x: Self) extends AnyVal {
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
    def withTotalBytesToRetrieve(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesToRetrieve")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

