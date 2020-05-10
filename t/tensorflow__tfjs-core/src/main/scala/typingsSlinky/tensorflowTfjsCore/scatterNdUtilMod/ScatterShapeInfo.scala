package typingsSlinky.tensorflowTfjsCore.scatterNdUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterShapeInfo extends js.Object {
  var numUpdates: Double = js.native
  var outputSize: Double = js.native
  var sliceRank: Double = js.native
  var sliceSize: Double = js.native
  var strides: js.Array[Double] = js.native
}

object ScatterShapeInfo {
  @scala.inline
  def apply(
    numUpdates: Double,
    outputSize: Double,
    sliceRank: Double,
    sliceSize: Double,
    strides: js.Array[Double]
  ): ScatterShapeInfo = {
    val __obj = js.Dynamic.literal(numUpdates = numUpdates.asInstanceOf[js.Any], outputSize = outputSize.asInstanceOf[js.Any], sliceRank = sliceRank.asInstanceOf[js.Any], sliceSize = sliceSize.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterShapeInfo]
  }
  @scala.inline
  implicit class ScatterShapeInfoOps[Self <: ScatterShapeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumUpdates(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSliceRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceRank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSliceSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrides(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strides")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

