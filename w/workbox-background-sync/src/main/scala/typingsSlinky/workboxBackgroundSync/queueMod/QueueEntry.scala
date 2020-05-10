package typingsSlinky.workboxBackgroundSync.queueMod

import org.scalajs.dom.experimental.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueEntry[Metadata] extends js.Object {
  var metadata: js.UndefOr[Metadata] = js.native
  var request: Request = js.native
  var timestamp: js.UndefOr[Double] = js.native
}

object QueueEntry {
  @scala.inline
  def apply[Metadata](request: Request): QueueEntry[Metadata] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueEntry[Metadata]]
  }
  @scala.inline
  implicit class QueueEntryOps[Self[metadata] <: QueueEntry[metadata], Metadata] (val x: Self[Metadata]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Metadata] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Metadata]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Metadata] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Metadata] with Other]
    @scala.inline
    def withRequest(value: Request): Self[Metadata] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: Metadata): Self[Metadata] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self[Metadata] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self[Metadata] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self[Metadata] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

