package typingsSlinky.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxSelectColumn[T /* <: SlickData */] extends Plugin[T] {
  
  def getColumnDefinition(): ColumnMetadata[T] = js.native
}
object CheckboxSelectColumn {
  
  @scala.inline
  def apply[T /* <: SlickData */](destroy: () => Unit, getColumnDefinition: () => ColumnMetadata[T], init: Grid[T] => Unit): CheckboxSelectColumn[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getColumnDefinition = js.Any.fromFunction0(getColumnDefinition), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[CheckboxSelectColumn[T]]
  }
  
  @scala.inline
  implicit class CheckboxSelectColumnMutableBuilder[Self <: CheckboxSelectColumn[_], T /* <: SlickData */] (val x: Self with CheckboxSelectColumn[T]) extends AnyVal {
    
    @scala.inline
    def setGetColumnDefinition(value: () => ColumnMetadata[T]): Self = StObject.set(x, "getColumnDefinition", js.Any.fromFunction0(value))
  }
}
