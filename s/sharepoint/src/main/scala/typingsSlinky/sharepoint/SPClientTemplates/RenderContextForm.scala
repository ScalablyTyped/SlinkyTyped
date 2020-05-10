package typingsSlinky.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderContextForm extends RenderContext {
  var CSRCustomLayout: js.UndefOr[Boolean] = js.native
  var CurrentItem: Item = js.native
  var FieldControlModes: StringDictionary[ClientControlMode] = js.native
  var FormContext: ClientFormContext = js.native
  var FormUniqueId: String = js.native
  var ListData: ListDataInForm = js.native
  var ListSchema: ListSchemaInForm = js.native
}

object RenderContextForm {
  @scala.inline
  def apply(
    CurrentItem: Item,
    FieldControlModes: StringDictionary[ClientControlMode],
    FormContext: ClientFormContext,
    FormUniqueId: String,
    ListData: ListDataInForm,
    ListSchema: ListSchemaInForm
  ): RenderContextForm = {
    val __obj = js.Dynamic.literal(CurrentItem = CurrentItem.asInstanceOf[js.Any], FieldControlModes = FieldControlModes.asInstanceOf[js.Any], FormContext = FormContext.asInstanceOf[js.Any], FormUniqueId = FormUniqueId.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextForm]
  }
  @scala.inline
  implicit class RenderContextFormOps[Self <: RenderContextForm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentItem(value: Item): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldControlModes(value: StringDictionary[ClientControlMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldControlModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormContext(value: ClientFormContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormUniqueId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormUniqueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListData(value: ListDataInForm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListSchema(value: ListSchemaInForm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCSRCustomLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSRCustomLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCSRCustomLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSRCustomLayout")(js.undefined)
        ret
    }
  }
  
}

