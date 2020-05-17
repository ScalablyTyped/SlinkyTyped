package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Foundation.IWwwFormUrlDecoderEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnValue extends js.Object {
  /** The name-value pairs. */ var items: IWwwFormUrlDecoderEntry = js.native
  /** The number of name-value pairs in items. */ var returnValue: Double = js.native
}

object ReturnValue {
  @scala.inline
  def apply(items: IWwwFormUrlDecoderEntry, returnValue: Double): ReturnValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValue]
  }
  @scala.inline
  implicit class ReturnValueOps[Self <: ReturnValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: IWwwFormUrlDecoderEntry): Self = {
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

