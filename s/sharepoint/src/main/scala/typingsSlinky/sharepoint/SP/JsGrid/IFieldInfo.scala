package typingsSlinky.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IFieldInfo extends js.Object {
  var dateOnly: js.UndefOr[Boolean] = js.native
  var defaultCellStyleId: js.UndefOr[js.Any] = js.native
  var editMode: js.UndefOr[EditMode] = js.native
  var fieldKey: String = js.native
  var hasDataValue: js.UndefOr[Boolean] = js.native
  var hasLocalizedValue: js.UndefOr[Boolean] = js.native
  var multiValue: js.UndefOr[Boolean] = js.native
  var propertyTypeId: String = js.native
  var textDirection: js.UndefOr[TextDirection] = js.native
}

object IFieldInfo {
  @scala.inline
  def apply(fieldKey: String, propertyTypeId: String): IFieldInfo = {
    val __obj = js.Dynamic.literal(fieldKey = fieldKey.asInstanceOf[js.Any], propertyTypeId = propertyTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldInfo]
  }
  @scala.inline
  implicit class IFieldInfoOps[Self <: IFieldInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCellStyleId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCellStyleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCellStyleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCellStyleId")(js.undefined)
        ret
    }
    @scala.inline
    def withEditMode(value: EditMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHasDataValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDataValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDataValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDataValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHasLocalizedValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLocalizedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasLocalizedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLocalizedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDirection(value: TextDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDirection")(js.undefined)
        ret
    }
  }
  
}

