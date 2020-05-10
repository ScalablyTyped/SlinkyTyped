package typingsSlinky.tensorflowTfjsLayers.trainingDatasetMod

import typingsSlinky.tensorflowTfjsLayers.distTypesMod.TensorOrArrayOrMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FitDatasetElement extends js.Object {
  var xs: TensorOrArrayOrMap = js.native
  var ys: TensorOrArrayOrMap = js.native
}

object FitDatasetElement {
  @scala.inline
  def apply(xs: TensorOrArrayOrMap, ys: TensorOrArrayOrMap): FitDatasetElement = {
    val __obj = js.Dynamic.literal(xs = xs.asInstanceOf[js.Any], ys = ys.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitDatasetElement]
  }
  @scala.inline
  implicit class FitDatasetElementOps[Self <: FitDatasetElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXs(value: TensorOrArrayOrMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYs(value: TensorOrArrayOrMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

