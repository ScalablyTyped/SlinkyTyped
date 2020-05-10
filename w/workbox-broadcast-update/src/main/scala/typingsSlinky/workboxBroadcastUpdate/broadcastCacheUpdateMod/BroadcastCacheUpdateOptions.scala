package typingsSlinky.workboxBroadcastUpdate.broadcastCacheUpdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadcastCacheUpdateOptions extends js.Object {
  var channelName: js.UndefOr[String] = js.native
  var deferNoticationTimeout: js.UndefOr[Double] = js.native
  var headersToCheck: js.UndefOr[js.Array[String]] = js.native
}

object BroadcastCacheUpdateOptions {
  @scala.inline
  def apply(): BroadcastCacheUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastCacheUpdateOptions]
  }
  @scala.inline
  implicit class BroadcastCacheUpdateOptionsOps[Self <: BroadcastCacheUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferNoticationTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferNoticationTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferNoticationTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferNoticationTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadersToCheck(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersToCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadersToCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersToCheck")(js.undefined)
        ret
    }
  }
  
}

