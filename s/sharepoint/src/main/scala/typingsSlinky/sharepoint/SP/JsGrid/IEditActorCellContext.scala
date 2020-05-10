package typingsSlinky.sharepoint.SP.JsGrid

import typingsSlinky.sharepoint.AnonBottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IEditActorCellContext extends js.Object {
  var cellExpandSpace: AnonBottom = js.native
  var column: ColumnInfo = js.native
  var field: GridField = js.native
  var fieldKey: String = js.native
  var originalValue: IValue = js.native
  var propType: IPropertyType = js.native
  var record: IRecord = js.native
  def SetCurrentValue(value: js.Any): Unit = js.native
}

object IEditActorCellContext {
  @scala.inline
  def apply(
    SetCurrentValue: js.Any => Unit,
    cellExpandSpace: AnonBottom,
    column: ColumnInfo,
    field: GridField,
    fieldKey: String,
    originalValue: IValue,
    propType: IPropertyType,
    record: IRecord
  ): IEditActorCellContext = {
    val __obj = js.Dynamic.literal(SetCurrentValue = js.Any.fromFunction1(SetCurrentValue), cellExpandSpace = cellExpandSpace.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], propType = propType.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditActorCellContext]
  }
  @scala.inline
  implicit class IEditActorCellContextOps[Self <: IEditActorCellContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetCurrentValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetCurrentValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCellExpandSpace(value: AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellExpandSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: ColumnInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: GridField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalValue(value: IValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropType(value: IPropertyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecord(value: IRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

