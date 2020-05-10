package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'boxes' | 'scores'> */
@js.native
trait NonMaxSuppressionV5Inputs extends js.Object {
  var boxes: js.Any = js.native
  var scores: js.Any = js.native
}

object NonMaxSuppressionV5Inputs {
  @scala.inline
  def apply(boxes: js.Any, scores: js.Any): NonMaxSuppressionV5Inputs = {
    val __obj = js.Dynamic.literal(boxes = boxes.asInstanceOf[js.Any], scores = scores.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonMaxSuppressionV5Inputs]
  }
  @scala.inline
  implicit class NonMaxSuppressionV5InputsOps[Self <: NonMaxSuppressionV5Inputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScores(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scores")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

