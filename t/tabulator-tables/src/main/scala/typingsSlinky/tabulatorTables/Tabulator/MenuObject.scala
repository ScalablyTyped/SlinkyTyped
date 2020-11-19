package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuObject[T /* <: RowComponent | CellComponent | ColumnComponent | GroupComponent */] extends js.Object {
  
  def action(e: js.Any, component: T): js.Any = js.native
  
  var disabled: js.UndefOr[Boolean | (js.Function1[/* component */ T, Boolean])] = js.native
  
  var label: String | HTMLElement | (js.Function1[/* component */ T, String | HTMLElement]) = js.native
}
object MenuObject {
  
  @scala.inline
  def apply[T /* <: RowComponent | CellComponent | ColumnComponent | GroupComponent */](
    action: (js.Any, T) => js.Any,
    label: String | HTMLElement | (js.Function1[/* component */ T, String | HTMLElement])
  ): MenuObject[T] = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction2(action), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuObject[T]]
  }
  
  @scala.inline
  implicit class MenuObjectOps[Self <: MenuObject[_], T /* <: RowComponent | CellComponent | ColumnComponent | GroupComponent */] (val x: Self with MenuObject[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: (js.Any, T) => js.Any): Self = this.set("action", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLabelFunction1(value: /* component */ T => String | HTMLElement): Self = this.set("label", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelHTMLElement(value: HTMLElement): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String | HTMLElement | (js.Function1[/* component */ T, String | HTMLElement])): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledFunction1(value: /* component */ T => Boolean): Self = this.set("disabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabled(value: Boolean | (js.Function1[/* component */ T, Boolean])): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
  }
}
