package typingsSlinky.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object moveColumns {
  
  type columnPositionChangedHandler = js.Function3[
    /* colDef */ typingsSlinky.uiGrid.mod.moveColumns.IColumnDef, 
    /* originalPosition */ scala.Double, 
    /* finalPosition */ scala.Double, 
    scala.Unit
  ]
}
