package typingsSlinky.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object selection {
  
  type rowSelectionChangedBatchHandler[TEntity] = js.Function2[
    /* row */ js.Array[typingsSlinky.uiGrid.mod.IGridRowOf[TEntity]], 
    /* event */ js.UndefOr[typingsSlinky.angular.mod.IAngularEvent], 
    scala.Unit
  ]
  
  type rowSelectionChangedHandler[TEntity] = js.Function2[
    /* row */ typingsSlinky.uiGrid.mod.IGridRowOf[TEntity], 
    /* event */ js.UndefOr[typingsSlinky.angular.mod.IAngularEvent], 
    scala.Unit
  ]
}
