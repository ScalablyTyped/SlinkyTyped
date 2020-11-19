package typingsSlinky.slickgrid.Slick

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnHeaderCellRenderedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  
      // todo: might be JQuery instance
  var column: Column[T] = js.native
  
  var node: HTMLElement = js.native
}
object OnHeaderCellRenderedEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T], node: HTMLElement): OnHeaderCellRenderedEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeaderCellRenderedEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnHeaderCellRenderedEventArgsOps[Self <: OnHeaderCellRenderedEventArgs[_], T /* <: SlickData */] (val x: Self with OnHeaderCellRenderedEventArgs[T]) extends AnyVal {
    
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
    def setColumn(value: Column[T]): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: HTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
  }
}
