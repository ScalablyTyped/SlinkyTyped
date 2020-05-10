package typingsSlinky.xrm.Xrm.Navigation

import typingsSlinky.xrm.Xrm.LookupValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFormResult extends js.Object {
  /**
    * Identifies the record displayed or created
    */
  var savedEntityReference: js.Array[LookupValue] = js.native
}

object OpenFormResult {
  @scala.inline
  def apply(savedEntityReference: js.Array[LookupValue]): OpenFormResult = {
    val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFormResult]
  }
  @scala.inline
  implicit class OpenFormResultOps[Self <: OpenFormResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSavedEntityReference(value: js.Array[LookupValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedEntityReference")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

