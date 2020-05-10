package typingsSlinky.uiGrid.mod.pinning

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.IGridColumnOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridPinningApi[TEntity] extends js.Object {
  // Events
  /**
    * raised when column pin state has changed
    * @param {ng.IScope} scope The grid scope
    * @param {columnPinHandler} handler Callback
    */
  def columnPin(scope: IScope, handler: columnPinHandler): Unit = js.native
  // Methods
  /**
    * Pin column left, right, or none
    * @param {IGridColumn} col The column being pinned
    * @param {string} container One of the recognized container types from uiGridPinningConstants
    */
  def pinColumn(col: IGridColumnOf[TEntity], container: String): Unit = js.native
}

object IGridPinningApi {
  @scala.inline
  def apply[TEntity](columnPin: (IScope, columnPinHandler) => Unit, pinColumn: (IGridColumnOf[TEntity], String) => Unit): IGridPinningApi[TEntity] = {
    val __obj = js.Dynamic.literal(columnPin = js.Any.fromFunction2(columnPin), pinColumn = js.Any.fromFunction2(pinColumn))
    __obj.asInstanceOf[IGridPinningApi[TEntity]]
  }
  @scala.inline
  implicit class IGridPinningApiOps[Self[tentity] <: IGridPinningApi[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withColumnPin(value: (IScope, columnPinHandler) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnPin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPinColumn(value: (IGridColumnOf[TEntity], String) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinColumn")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

