package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisksIoData extends js.Object {
  var ms: Double = js.native
  var rIO: Double = js.native
  var rIO_sec: Double = js.native
  var tIO: Double = js.native
  var tIO_sec: Double = js.native
  var wIO: Double = js.native
  var wIO_sec: Double = js.native
}

object DisksIoData {
  @scala.inline
  def apply(
    ms: Double,
    rIO: Double,
    rIO_sec: Double,
    tIO: Double,
    tIO_sec: Double,
    wIO: Double,
    wIO_sec: Double
  ): DisksIoData = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any], rIO = rIO.asInstanceOf[js.Any], rIO_sec = rIO_sec.asInstanceOf[js.Any], tIO = tIO.asInstanceOf[js.Any], tIO_sec = tIO_sec.asInstanceOf[js.Any], wIO = wIO.asInstanceOf[js.Any], wIO_sec = wIO_sec.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisksIoData]
  }
  @scala.inline
  implicit class DisksIoDataOps[Self <: DisksIoData] (val x: Self) extends AnyVal {
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
    def withRIO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRIO_sec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rIO_sec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTIO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTIO_sec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tIO_sec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWIO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWIO_sec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wIO_sec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

