package typingsSlinky.tensorflowTfjsCore.engineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KernelProfile extends js.Object {
  var bytesAdded: Double = js.native
  var inputShapes: js.Array[js.Array[Double]] = js.native
  var name: String = js.native
  var outputShapes: js.Array[js.Array[Double]] = js.native
  var tensorsAdded: Double = js.native
  var totalBytesSnapshot: Double = js.native
  var totalTensorsSnapshot: Double = js.native
}

object KernelProfile {
  @scala.inline
  def apply(
    bytesAdded: Double,
    inputShapes: js.Array[js.Array[Double]],
    name: String,
    outputShapes: js.Array[js.Array[Double]],
    tensorsAdded: Double,
    totalBytesSnapshot: Double,
    totalTensorsSnapshot: Double
  ): KernelProfile = {
    val __obj = js.Dynamic.literal(bytesAdded = bytesAdded.asInstanceOf[js.Any], inputShapes = inputShapes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputShapes = outputShapes.asInstanceOf[js.Any], tensorsAdded = tensorsAdded.asInstanceOf[js.Any], totalBytesSnapshot = totalBytesSnapshot.asInstanceOf[js.Any], totalTensorsSnapshot = totalTensorsSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelProfile]
  }
  @scala.inline
  implicit class KernelProfileOps[Self <: KernelProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesAdded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputShapes(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputShapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputShapes(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputShapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTensorsAdded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorsAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytesSnapshot(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTensorsSnapshot(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTensorsSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

