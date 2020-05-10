package typingsSlinky.tensorflowTfjsCore.shaderCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeInfo extends js.Object {
  var flatOffset: Double = js.native
  var isPacked: Boolean = js.native
  var isUniform: Boolean = js.native
  var logicalShape: js.Array[Double] = js.native
  var texShape: js.Tuple2[Double, Double] = js.native
}

object ShapeInfo {
  @scala.inline
  def apply(
    flatOffset: Double,
    isPacked: Boolean,
    isUniform: Boolean,
    logicalShape: js.Array[Double],
    texShape: js.Tuple2[Double, Double]
  ): ShapeInfo = {
    val __obj = js.Dynamic.literal(flatOffset = flatOffset.asInstanceOf[js.Any], isPacked = isPacked.asInstanceOf[js.Any], isUniform = isUniform.asInstanceOf[js.Any], logicalShape = logicalShape.asInstanceOf[js.Any], texShape = texShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeInfo]
  }
  @scala.inline
  implicit class ShapeInfoOps[Self <: ShapeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlatOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPacked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUniform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUniform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalShape(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTexShape(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texShape")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

