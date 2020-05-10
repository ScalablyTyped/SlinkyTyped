package typingsSlinky.tensorflowTfjsCore.fusedUtilMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FusedBatchMatMulConfig extends js.Object {
  var a: Tensor3D = js.native
  var activation: js.UndefOr[Activation] = js.native
  var b: Tensor3D = js.native
  var bias: js.UndefOr[Tensor[Rank]] = js.native
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.native
  var transposeA: Boolean = js.native
  var transposeB: Boolean = js.native
}

object FusedBatchMatMulConfig {
  @scala.inline
  def apply(a: Tensor3D, b: Tensor3D, transposeA: Boolean, transposeB: Boolean): FusedBatchMatMulConfig = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], transposeA = transposeA.asInstanceOf[js.Any], transposeB = transposeB.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedBatchMatMulConfig]
  }
  @scala.inline
  implicit class FusedBatchMatMulConfigOps[Self <: FusedBatchMatMulConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: Tensor3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: Tensor3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransposeA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transposeA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransposeB(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transposeB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivation(value: Activation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activation")(js.undefined)
        ret
    }
    @scala.inline
    def withBias(value: Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(js.undefined)
        ret
    }
    @scala.inline
    def withPreluActivationWeights(value: Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preluActivationWeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreluActivationWeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preluActivationWeights")(js.undefined)
        ret
    }
  }
  
}

