package typingsSlinky.uiGrid.anon

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.rowEdit.saveRowHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveRow[TEntity] extends js.Object {
  /**
    * Raised when a row is ready for saving.
    * Once your row has saved you may need to use angular.extend to update the data entity
    * with any changed data from your save.
    * i.e. lock version information, or last update time/user information
    *
    * Your method should call setSavePromise somewhere in the body before returning control.
    * The feature will then wait, with the gridRow greyed out whilst this promise is being resolved.
    * @param {ng.IScope} scope The grid scope
    * @param {saveRowHandler} handler Callback
    */
  def saveRow(scope: IScope, handler: saveRowHandler[TEntity]): Unit = js.native
}

object SaveRow {
  @scala.inline
  def apply[TEntity](saveRow: (IScope, saveRowHandler[TEntity]) => Unit): SaveRow[TEntity] = {
    val __obj = js.Dynamic.literal(saveRow = js.Any.fromFunction2(saveRow))
    __obj.asInstanceOf[SaveRow[TEntity]]
  }
  @scala.inline
  implicit class SaveRowOps[Self[tentity] <: SaveRow[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withSaveRow(value: (IScope, saveRowHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveRow")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

