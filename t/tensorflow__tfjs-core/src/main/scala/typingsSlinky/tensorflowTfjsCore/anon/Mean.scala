package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mean extends js.Object {
  var mean: Tensor[Rank] = js.native
  var variance: Tensor[Rank] = js.native
}

object Mean {
  @scala.inline
  def apply(mean: Tensor[Rank], variance: Tensor[Rank]): Mean = {
    val __obj = js.Dynamic.literal(mean = mean.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mean]
  }
  @scala.inline
  implicit class MeanOps[Self <: Mean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMean(value: Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariance(value: Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

