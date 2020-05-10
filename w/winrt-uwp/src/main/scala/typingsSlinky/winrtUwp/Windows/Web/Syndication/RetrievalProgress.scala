package typingsSlinky.winrtUwp.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains progress information for a data retrieval operation. */
@js.native
trait RetrievalProgress extends js.Object {
  /** The number of bytes that have been received in this data retrieval operation. */
  var bytesRetrieved: Double = js.native
  /** The total number of bytes to be received during this data retrieval operation. */
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

