package typingsSlinky.slickgrid.Slick

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnHeaderRowCellRenderedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  
  // todo: might be JQuery instance
  var column: Column[T] = js.native
  
  var node: HTMLElement = js.native
}
object OnHeaderRowCellRenderedEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T], node: HTMLElement): OnHeaderRowCellRenderedEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeaderRowCellRenderedEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnHeaderRowCellRenderedEventArgsMutableBuilder[Self <: OnHeaderRowCellRenderedEventArgs[_], T /* <: SlickData */] (val x: Self with OnHeaderRowCellRenderedEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
