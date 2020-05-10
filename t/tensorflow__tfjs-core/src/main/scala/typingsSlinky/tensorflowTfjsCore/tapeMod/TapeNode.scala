package typingsSlinky.tensorflowTfjsCore.tapeMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapeNode extends js.Object {
  var gradient: js.UndefOr[js.Function1[/* dys */ js.Array[Tensor[Rank]], NamedGradientMap]] = js.native
  var id: Double = js.native
  var inputs: NamedTensorMap = js.native
  var kernelName: String = js.native
  var outputs: js.Array[Tensor[Rank]] = js.native
  var saved: js.UndefOr[js.Array[Tensor[Rank]]] = js.native
}

object TapeNode {
  @scala.inline
  def apply(id: Double, inputs: NamedTensorMap, kernelName: String, outputs: js.Array[Tensor[Rank]]): TapeNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], kernelName = kernelName.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapeNode]
  }
  @scala.inline
  implicit class TapeNodeOps[Self <: TapeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: NamedTensorMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: js.Array[Tensor[Rank]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradient(value: /* dys */ js.Array[Tensor[Rank]] => NamedGradientMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(js.undefined)
        ret
    }
    @scala.inline
    def withSaved(value: js.Array[Tensor[Rank]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saved")(js.undefined)
        ret
    }
  }
  
}

