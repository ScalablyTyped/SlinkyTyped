package typingsSlinky.uiGrid.anon

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.moveColumns.columnPositionChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnPositionChanged extends js.Object {
  /**
    * Raised when a column is moved
    * @param {ng.IScope} scope Grid Scope
    * @param {columnPositionChangedHandler} handler Callback Function
    */
  var columnPositionChanged: js.UndefOr[
    js.Function2[/* scope */ IScope, /* handler */ columnPositionChangedHandler, Unit]
  ] = js.native
}

object ColumnPositionChanged {
  @scala.inline
  def apply(): ColumnPositionChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnPositionChanged]
  }
  @scala.inline
  implicit class ColumnPositionChangedOps[Self <: ColumnPositionChanged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnPositionChanged(value: (/* scope */ IScope, /* handler */ columnPositionChangedHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnPositionChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnPositionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnPositionChanged")(js.undefined)
        ret
    }
  }
  
}

