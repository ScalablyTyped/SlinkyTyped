package typingsSlinky.uiDashGrid.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object moveColumns {
  type columnPositionChangedHandler = js.Function3[
    /* colDef */ typingsSlinky.uiDashGrid.uiDashGridMod.moveColumns.IColumnDef, 
    /* originalPosition */ Double, 
    /* finalPosition */ Double, 
    Unit
  ]
}
