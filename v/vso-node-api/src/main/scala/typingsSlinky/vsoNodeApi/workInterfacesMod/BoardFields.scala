package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoardFields extends js.Object {
  var columnField: FieldReference = js.native
  var doneField: FieldReference = js.native
  var rowField: FieldReference = js.native
}

object BoardFields {
  @scala.inline
  def apply(columnField: FieldReference, doneField: FieldReference, rowField: FieldReference): BoardFields = {
    val __obj = js.Dynamic.literal(columnField = columnField.asInstanceOf[js.Any], doneField = doneField.asInstanceOf[js.Any], rowField = rowField.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardFields]
  }
  @scala.inline
  implicit class BoardFieldsOps[Self <: BoardFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnField(value: FieldReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoneField(value: FieldReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowField(value: FieldReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowField")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

