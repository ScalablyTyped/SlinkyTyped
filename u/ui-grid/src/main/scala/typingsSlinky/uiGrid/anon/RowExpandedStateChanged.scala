package typingsSlinky.uiGrid.anon

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.expandable.rowExpandedStateChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowExpandedStateChanged[TEntity] extends StObject {
  
  /**
    * raised when cell editing is complete
    * @param {ng.IScope} scope
    * @param {rowExpandedStateChangedHandler} handler
    */
  def rowExpandedStateChanged(scope: IScope, handler: rowExpandedStateChangedHandler[TEntity]): Unit = js.native
}
object RowExpandedStateChanged {
  
  @scala.inline
  def apply[TEntity](rowExpandedStateChanged: (IScope, rowExpandedStateChangedHandler[TEntity]) => Unit): RowExpandedStateChanged[TEntity] = {
    val __obj = js.Dynamic.literal(rowExpandedStateChanged = js.Any.fromFunction2(rowExpandedStateChanged))
    __obj.asInstanceOf[RowExpandedStateChanged[TEntity]]
  }
  
  @scala.inline
  implicit class RowExpandedStateChangedMutableBuilder[Self <: RowExpandedStateChanged[_], TEntity] (val x: Self with RowExpandedStateChanged[TEntity]) extends AnyVal {
    
    @scala.inline
    def setRowExpandedStateChanged(value: (IScope, rowExpandedStateChangedHandler[TEntity]) => Unit): Self = StObject.set(x, "rowExpandedStateChanged", js.Any.fromFunction2(value))
  }
}
