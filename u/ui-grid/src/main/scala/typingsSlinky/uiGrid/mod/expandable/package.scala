package typingsSlinky.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expandable {
  type rowExpandedStateChangedHandler[TEntity] = js.Function1[/* row */ typingsSlinky.uiGrid.mod.IGridRowOf[TEntity], scala.Unit]
}
