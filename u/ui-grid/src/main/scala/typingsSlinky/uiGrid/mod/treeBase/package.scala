package typingsSlinky.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeBase {
  type rowCollapsedHandler[TEntity] = js.Function1[/* row */ typingsSlinky.uiGrid.mod.IGridRowOf[TEntity], scala.Unit]
  type rowExpandedHandler[TEntity] = js.Function1[/* row */ typingsSlinky.uiGrid.mod.IGridRowOf[TEntity], scala.Unit]
}
