package typingsSlinky.tensorflowTfjsCore.fusedUtilMod

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FusedConv2DConfig extends js.Object {
  var activation: js.UndefOr[Activation] = js.native
  var bias: js.UndefOr[Tensor[Rank]] = js.native
  var convInfo: Conv2DInfo = js.native
  var filter: Tensor4D = js.native
  var input: Tensor4D = js.native
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.native
}

object FusedConv2DConfig {
  @scala.inline
  def apply(convInfo: Conv2DInfo, filter: Tensor4D, input: Tensor4D): FusedConv2DConfig = {
    val __obj = js.Dynamic.literal(convInfo = convInfo.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedConv2DConfig]
  }
  @scala.inline
  implicit class FusedConv2DConfigOps[Self <: FusedConv2DConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvInfo(value: Conv2DInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: Tensor4D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: Tensor4D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
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

