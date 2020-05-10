package typingsSlinky.uiGrid

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.grouping.aggregationChangedHandler
import typingsSlinky.uiGrid.mod.grouping.groupingChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAggregationChanged[TEntity] extends js.Object {
  /**
    * raised whenever aggregation is changed, added or removed from a column
    * @param {ng.IScope} scope Grid Scope
    * @param {aggregationChangedHandler} handler Callback method
    */
  def aggregationChanged(scope: IScope, handler: aggregationChangedHandler[TEntity]): Unit = js.native
  /**
    * raised whenever the grouped columns change
    * @param {ng.IScope} scope Grid Scope
    * @param {groupingChangedHandler} handler Callback method
    */
  def groupingChanged(scope: IScope, handler: groupingChangedHandler[TEntity]): Unit = js.native
}

object AnonAggregationChanged {
  @scala.inline
  def apply[TEntity](
    aggregationChanged: (IScope, aggregationChangedHandler[TEntity]) => Unit,
    groupingChanged: (IScope, groupingChangedHandler[TEntity]) => Unit
  ): AnonAggregationChanged[TEntity] = {
    val __obj = js.Dynamic.literal(aggregationChanged = js.Any.fromFunction2(aggregationChanged), groupingChanged = js.Any.fromFunction2(groupingChanged))
    __obj.asInstanceOf[AnonAggregationChanged[TEntity]]
  }
  @scala.inline
  implicit class AnonAggregationChangedOps[Self[tentity] <: AnonAggregationChanged[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withAggregationChanged(value: (IScope, aggregationChangedHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGroupingChanged(value: (IScope, groupingChangedHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingChanged")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

