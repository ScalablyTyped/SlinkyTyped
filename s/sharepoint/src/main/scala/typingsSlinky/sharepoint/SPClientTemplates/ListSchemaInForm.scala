package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemaInForm extends ListSchema {
  @JSName("Field")
  var Field_ListSchemaInForm: js.Array[FieldSchemaInForm] = js.native
}

object ListSchemaInForm {
  @scala.inline
  def apply(Field: js.Array[FieldSchemaInForm]): ListSchemaInForm = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemaInForm]
  }
  @scala.inline
  implicit class ListSchemaInFormOps[Self <: ListSchemaInForm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: js.Array[FieldSchemaInForm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Field")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

