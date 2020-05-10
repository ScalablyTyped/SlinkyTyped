package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryHierarchyItemsResult extends js.Object {
  /**
    * The count of items.
    */
  var count: Double = js.native
  /**
    * Indicates if the max return limit was hit but there are still more items
    */
  var hasMore: Boolean = js.native
  /**
    * The list of items
    */
  var value: js.Array[QueryHierarchyItem] = js.native
}

object QueryHierarchyItemsResult {
  @scala.inline
  def apply(count: Double, hasMore: Boolean, value: js.Array[QueryHierarchyItem]): QueryHierarchyItemsResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryHierarchyItemsResult]
  }
  @scala.inline
  implicit class QueryHierarchyItemsResultOps[Self <: QueryHierarchyItemsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Array[QueryHierarchyItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

