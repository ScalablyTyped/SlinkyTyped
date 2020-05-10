package typingsSlinky.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderContextFieldInForm extends RenderContextForm {
  var CurrentFieldSchema: FieldSchemaInForm = js.native
  var CurrentFieldValue: js.Any = js.native
  var CurrentGroup: Group = js.native
  var CurrentGroupIdx: Double = js.native
  var CurrentItems: js.Array[Item] = js.native
}

object RenderContextFieldInForm {
  @scala.inline
  def apply(
    CurrentFieldSchema: FieldSchemaInForm,
    CurrentFieldValue: js.Any,
    CurrentGroup: Group,
    CurrentGroupIdx: Double,
    CurrentItem: Item,
    CurrentItems: js.Array[Item],
    FieldControlModes: StringDictionary[ClientControlMode],
    FormContext: ClientFormContext,
    FormUniqueId: String,
    ListData: ListDataInForm,
    ListSchema: ListSchemaInForm
  ): RenderContextFieldInForm = {
    val __obj = js.Dynamic.literal(CurrentFieldSchema = CurrentFieldSchema.asInstanceOf[js.Any], CurrentFieldValue = CurrentFieldValue.asInstanceOf[js.Any], CurrentGroup = CurrentGroup.asInstanceOf[js.Any], CurrentGroupIdx = CurrentGroupIdx.asInstanceOf[js.Any], CurrentItem = CurrentItem.asInstanceOf[js.Any], CurrentItems = CurrentItems.asInstanceOf[js.Any], FieldControlModes = FieldControlModes.asInstanceOf[js.Any], FormContext = FormContext.asInstanceOf[js.Any], FormUniqueId = FormUniqueId.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextFieldInForm]
  }
  @scala.inline
  implicit class RenderContextFieldInFormOps[Self <: RenderContextFieldInForm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentFieldSchema(value: FieldSchemaInForm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentFieldSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentFieldValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentFieldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentGroup(value: Group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentGroupIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentGroupIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentItems(value: js.Array[Item]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

