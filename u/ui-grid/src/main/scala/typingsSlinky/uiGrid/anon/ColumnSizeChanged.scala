package typingsSlinky.uiGrid.anon

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.resizeColumns.columnSizeChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnSizeChanged extends StObject {
  
  /**
    * Raised when column is resized
    * @param {ng.IScope} scope Grid Scope
    * @param {columnSizeChangedHandler} handler Callback
    */
  def columnSizeChanged(scope: IScope, handler: columnSizeChangedHandler): Unit = js.native
}
object ColumnSizeChanged {
  
  @scala.inline
  def apply(columnSizeChanged: (IScope, columnSizeChangedHandler) => Unit): ColumnSizeChanged = {
    val __obj = js.Dynamic.literal(columnSizeChanged = js.Any.fromFunction2(columnSizeChanged))
    __obj.asInstanceOf[ColumnSizeChanged]
  }
  
  @scala.inline
  implicit class ColumnSizeChangedMutableBuilder[Self <: ColumnSizeChanged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnSizeChanged(value: (IScope, columnSizeChangedHandler) => Unit): Self = StObject.set(x, "columnSizeChanged", js.Any.fromFunction2(value))
  }
}
