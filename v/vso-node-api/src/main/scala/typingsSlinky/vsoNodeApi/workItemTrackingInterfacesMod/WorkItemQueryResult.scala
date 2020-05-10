package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemQueryResult extends js.Object {
  /**
    * The date the query was run in the context of.
    */
  var asOf: js.Date = js.native
  /**
    * The columns of the query.
    */
  var columns: js.Array[WorkItemFieldReference] = js.native
  /**
    * The result type
    */
  var queryResultType: QueryResultType = js.native
  /**
    * The type of the query
    */
  var queryType: QueryType = js.native
  /**
    * The sort columns of the query.
    */
  var sortColumns: js.Array[WorkItemQuerySortColumn] = js.native
  /**
    * The work item links returned by the query.
    */
  var workItemRelations: js.Array[WorkItemLink] = js.native
  /**
    * The work items returned by the query.
    */
  var workItems: js.Array[WorkItemReference] = js.native
}

object WorkItemQueryResult {
  @scala.inline
  def apply(
    asOf: js.Date,
    columns: js.Array[WorkItemFieldReference],
    queryResultType: QueryResultType,
    queryType: QueryType,
    sortColumns: js.Array[WorkItemQuerySortColumn],
    workItemRelations: js.Array[WorkItemLink],
    workItems: js.Array[WorkItemReference]
  ): WorkItemQueryResult = {
    val __obj = js.Dynamic.literal(asOf = asOf.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], queryResultType = queryResultType.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], sortColumns = sortColumns.asInstanceOf[js.Any], workItemRelations = workItemRelations.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemQueryResult]
  }
  @scala.inline
  implicit class WorkItemQueryResultOps[Self <: WorkItemQueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsOf(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[WorkItemFieldReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryResultType(value: QueryResultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryResultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryType(value: QueryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortColumns(value: js.Array[WorkItemQuerySortColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemRelations(value: js.Array[WorkItemLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemRelations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItems(value: js.Array[WorkItemReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

