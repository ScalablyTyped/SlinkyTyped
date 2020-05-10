package typingsSlinky.tensorflowTfjsLayers.executorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionProbe extends js.Object {
  /**
    * Maximum number of tensors that exist during all steps of the
    * execution. Tensor counts are measured at the beginning of every
    * step.
    */
  var maxNumTensors: js.UndefOr[Double] = js.native
  /**
    * Minimum number of tensors that exist during all steps of the
    * execution. Tensor counts are measured at the beginning of every
    * step.
    */
  var minNumTensors: js.UndefOr[Double] = js.native
}

object ExecutionProbe {
  @scala.inline
  def apply(): ExecutionProbe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionProbe]
  }
  @scala.inline
  implicit class ExecutionProbeOps[Self <: ExecutionProbe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxNumTensors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumTensors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNumTensors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumTensors")(js.undefined)
        ret
    }
    @scala.inline
    def withMinNumTensors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNumTensors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinNumTensors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNumTensors")(js.undefined)
        ret
    }
  }
  
}

