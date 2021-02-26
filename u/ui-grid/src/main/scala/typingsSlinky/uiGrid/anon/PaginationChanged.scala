package typingsSlinky.uiGrid.anon

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.pagination.paginationChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationChanged extends StObject {
  
  /**
    * This event fires when the pageSize or currentPage changes
    * @param {ng.IScope} scope The grid scope
    * @param {paginationChangedHandler} handler Callback
    */
  def paginationChanged(scope: IScope, handler: paginationChangedHandler): Unit = js.native
}
object PaginationChanged {
  
  @scala.inline
  def apply(paginationChanged: (IScope, paginationChangedHandler) => Unit): PaginationChanged = {
    val __obj = js.Dynamic.literal(paginationChanged = js.Any.fromFunction2(paginationChanged))
    __obj.asInstanceOf[PaginationChanged]
  }
  
  @scala.inline
  implicit class PaginationChangedMutableBuilder[Self <: PaginationChanged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaginationChanged(value: (IScope, paginationChangedHandler) => Unit): Self = StObject.set(x, "paginationChanged", js.Any.fromFunction2(value))
  }
}
