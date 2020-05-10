package typingsSlinky.tensorflowTfjsCore.engineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryInfo extends js.Object {
  var numBytes: Double = js.native
  var numDataBuffers: Double = js.native
  var numTensors: Double = js.native
  var reasons: js.Array[String] = js.native
  var unreliable: js.UndefOr[Boolean] = js.native
}

object MemoryInfo {
  @scala.inline
  def apply(numBytes: Double, numDataBuffers: Double, numTensors: Double, reasons: js.Array[String]): MemoryInfo = {
    val __obj = js.Dynamic.literal(numBytes = numBytes.asInstanceOf[js.Any], numDataBuffers = numDataBuffers.asInstanceOf[js.Any], numTensors = numTensors.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
  @scala.inline
  implicit class MemoryInfoOps[Self <: MemoryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumDataBuffers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDataBuffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumTensors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTensors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnreliable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreliable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnreliable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreliable")(js.undefined)
        ret
    }
  }
  
}

