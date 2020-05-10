package typingsSlinky.uiGrid.mod.grouping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridGroupingConfiguration extends js.Object {
  /**
    * Hash of currently expanded nodes
    */
  var expandedState: js.UndefOr[IGridExpandedHash] = js.native
  /**
    * GroupArray.  Sorted by groupPriority
    */
  var grouping: js.Array[IGripGroup] = js.native
  /**
    * Array of aggregation objects
    */
  var treeAggregations: js.Array[IGridTreeAggregations] = js.native
}

object IGridGroupingConfiguration {
  @scala.inline
  def apply(grouping: js.Array[IGripGroup], treeAggregations: js.Array[IGridTreeAggregations]): IGridGroupingConfiguration = {
    val __obj = js.Dynamic.literal(grouping = grouping.asInstanceOf[js.Any], treeAggregations = treeAggregations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridGroupingConfiguration]
  }
  @scala.inline
  implicit class IGridGroupingConfigurationOps[Self <: IGridGroupingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrouping(value: js.Array[IGripGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeAggregations(value: js.Array[IGridTreeAggregations]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeAggregations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedState(value: IGridExpandedHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedState")(js.undefined)
        ret
    }
  }
  
}

