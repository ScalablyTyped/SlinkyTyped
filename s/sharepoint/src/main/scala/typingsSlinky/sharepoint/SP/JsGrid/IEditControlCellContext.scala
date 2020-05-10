package typingsSlinky.sharepoint.SP.JsGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sharepoint.AnonBottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IEditControlCellContext extends IEditActorCellContext {
  var cellHeight: Double = js.native
   // TODO: Determine correct type
  var cellRect: js.Any = js.native
  var cellStyle: js.Any = js.native
  var cellWidth: Double = js.native
  def Hide(element: HTMLElement): Unit = js.native
  def NotifyEditComplete(): Unit = js.native
  def NotifyExpandControl(): Unit = js.native
  def Show(element: HTMLElement): Unit = js.native
}

object IEditControlCellContext {
  @scala.inline
  def apply(
    Hide: HTMLElement => Unit,
    NotifyEditComplete: () => Unit,
    NotifyExpandControl: () => Unit,
    SetCurrentValue: js.Any => Unit,
    Show: HTMLElement => Unit,
    cellExpandSpace: AnonBottom,
    cellHeight: Double,
    cellRect: js.Any,
    cellStyle: js.Any,
    cellWidth: Double,
    column: ColumnInfo,
    field: GridField,
    fieldKey: String,
    originalValue: IValue,
    propType: IPropertyType,
    record: IRecord
  ): IEditControlCellContext = {
    val __obj = js.Dynamic.literal(Hide = js.Any.fromFunction1(Hide), NotifyEditComplete = js.Any.fromFunction0(NotifyEditComplete), NotifyExpandControl = js.Any.fromFunction0(NotifyExpandControl), SetCurrentValue = js.Any.fromFunction1(SetCurrentValue), Show = js.Any.fromFunction1(Show), cellExpandSpace = cellExpandSpace.asInstanceOf[js.Any], cellHeight = cellHeight.asInstanceOf[js.Any], cellRect = cellRect.asInstanceOf[js.Any], cellStyle = cellStyle.asInstanceOf[js.Any], cellWidth = cellWidth.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], propType = propType.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditControlCellContext]
  }
  @scala.inline
  implicit class IEditControlCellContextOps[Self <: IEditControlCellContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifyEditComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyEditComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyExpandControl(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyExpandControl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCellHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellRect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

