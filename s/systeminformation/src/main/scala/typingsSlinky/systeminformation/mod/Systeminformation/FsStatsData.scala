package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsStatsData extends js.Object {
  var ms: Double = js.native
  var rx_bytes: Double = js.native
  var rx_sec: Double = js.native
  var tx_bytes: Double = js.native
  var tx_sec: Double = js.native
  var wx_bytes: Double = js.native
  var wx_sec: Double = js.native
}

object FsStatsData {
  @scala.inline
  def apply(
    ms: Double,
    rx_bytes: Double,
    rx_sec: Double,
    tx_bytes: Double,
    tx_sec: Double,
    wx_bytes: Double,
    wx_sec: Double
  ): FsStatsData = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any], rx_bytes = rx_bytes.asInstanceOf[js.Any], rx_sec = rx_sec.asInstanceOf[js.Any], tx_bytes = tx_bytes.asInstanceOf[js.Any], tx_sec = tx_sec.asInstanceOf[js.Any], wx_bytes = wx_bytes.asInstanceOf[js.Any], wx_sec = wx_sec.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsStatsData]
  }
  @scala.inline
  implicit class FsStatsDataOps[Self <: FsStatsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRx_bytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx_bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRx_sec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx_sec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTx_bytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx_bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTx_sec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx_sec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWx_bytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wx_bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWx_sec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wx_sec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

