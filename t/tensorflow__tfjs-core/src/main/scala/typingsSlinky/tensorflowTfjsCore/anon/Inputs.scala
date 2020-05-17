package typingsSlinky.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.modelTypesMod.SavedModelTensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inputs extends js.Object {
  var inputs: StringDictionary[SavedModelTensorInfo] = js.native
  var outputs: StringDictionary[SavedModelTensorInfo] = js.native
}

object Inputs {
  @scala.inline
  def apply(inputs: StringDictionary[SavedModelTensorInfo], outputs: StringDictionary[SavedModelTensorInfo]): Inputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
  @scala.inline
  implicit class InputsOps[Self <: Inputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputs(value: StringDictionary[SavedModelTensorInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: StringDictionary[SavedModelTensorInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

