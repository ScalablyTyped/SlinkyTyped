package typingsSlinky.winrt.anon

import typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnValueNumber extends js.Object {
  var items: js.Array[ResourceQualifier] = js.native
  var returnValue: Double = js.native
}

object ReturnValueNumber {
  @scala.inline
  def apply(items: js.Array[ResourceQualifier], returnValue: Double): ReturnValueNumber = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValueNumber]
  }
  @scala.inline
  implicit class ReturnValueNumberOps[Self <: ReturnValueNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ResourceQualifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

