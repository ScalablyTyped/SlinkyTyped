package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataInForm extends js.Object {
  var Items: js.Array[Item] = js.native
}

object ListDataInForm {
  @scala.inline
  def apply(Items: js.Array[Item]): ListDataInForm = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataInForm]
  }
  @scala.inline
  implicit class ListDataInFormOps[Self <: ListDataInForm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[Item]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

