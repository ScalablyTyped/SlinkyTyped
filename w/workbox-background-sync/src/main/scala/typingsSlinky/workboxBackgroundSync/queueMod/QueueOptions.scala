package typingsSlinky.workboxBackgroundSync.queueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueOptions extends js.Object {
  var maxRetentionTime: js.UndefOr[Double] = js.native
  var onSync: js.UndefOr[QueueOnSyncHandler] = js.native
}

object QueueOptions {
  @scala.inline
  def apply(): QueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueOptions]
  }
  @scala.inline
  implicit class QueueOptionsOps[Self <: QueueOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxRetentionTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetentionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetentionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetentionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSync(value: /* options */ QueueOnSyncEvent => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSync")(js.undefined)
        ret
    }
  }
  
}

