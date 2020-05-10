package typingsSlinky.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.modelTypesMod.ModelTensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOutputs extends js.Object {
  var inputs: StringDictionary[ModelTensorInfo] = js.native
  var outputs: StringDictionary[ModelTensorInfo] = js.native
}

object AnonOutputs {
  @scala.inline
  def apply(inputs: StringDictionary[ModelTensorInfo], outputs: StringDictionary[ModelTensorInfo]): AnonOutputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOutputs]
  }
  @scala.inline
  implicit class AnonOutputsOps[Self <: AnonOutputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputs(value: StringDictionary[ModelTensorInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: StringDictionary[ModelTensorInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

