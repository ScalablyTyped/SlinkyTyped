package typingsSlinky.tensorflowTfjsCore.segmentUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatherOpShapeInfo extends js.Object {
  var batchSize: Double = js.native
  var dimSize: Double = js.native
  var outputShape: js.Array[Double] = js.native
  var sliceSize: Double = js.native
}

object GatherOpShapeInfo {
  @scala.inline
  def apply(batchSize: Double, dimSize: Double, outputShape: js.Array[Double], sliceSize: Double): GatherOpShapeInfo = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], dimSize = dimSize.asInstanceOf[js.Any], outputShape = outputShape.asInstanceOf[js.Any], sliceSize = sliceSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatherOpShapeInfo]
  }
  @scala.inline
  implicit class GatherOpShapeInfoOps[Self <: GatherOpShapeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputShape(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSliceSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

