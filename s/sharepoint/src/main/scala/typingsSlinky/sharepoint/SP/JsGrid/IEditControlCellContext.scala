package typingsSlinky.sharepoint.SP.JsGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sharepoint.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditControlCellContext extends IEditActorCellContext {
  
  def Hide(element: HTMLElement): Unit = js.native
  
  def NotifyEditComplete(): Unit = js.native
  
  def NotifyExpandControl(): Unit = js.native
  
  def Show(element: HTMLElement): Unit = js.native
  
  var cellHeight: Double = js.native
  
  // TODO: Determine correct type
  var cellRect: js.Any = js.native
  
  var cellStyle: js.Any = js.native
  
  var cellWidth: Double = js.native
}
object IEditControlCellContext {
  
  @scala.inline
  def apply(
    Hide: HTMLElement => Unit,
    NotifyEditComplete: () => Unit,
    NotifyExpandControl: () => Unit,
    SetCurrentValue: js.Any => Unit,
    Show: HTMLElement => Unit,
    cellExpandSpace: Bottom,
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
  implicit class IEditControlCellContextMutableBuilder[Self <: IEditControlCellContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRect(value: js.Any): Self = StObject.set(x, "cellRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellStyle(value: js.Any): Self = StObject.set(x, "cellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide(value: HTMLElement => Unit): Self = StObject.set(x, "Hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyEditComplete(value: () => Unit): Self = StObject.set(x, "NotifyEditComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotifyExpandControl(value: () => Unit): Self = StObject.set(x, "NotifyExpandControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: HTMLElement => Unit): Self = StObject.set(x, "Show", js.Any.fromFunction1(value))
  }
}
