package typingsSlinky.uiDashGrid.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeBase {
  import typingsSlinky.uiDashGrid.uiDashGridMod.IGridRowOf

  type rowCollapsedHandler[TEntity] = js.Function1[/* row */ IGridRowOf[TEntity], Unit]
  type rowExpandedHandler[TEntity] = js.Function1[/* row */ IGridRowOf[TEntity], Unit]
}
