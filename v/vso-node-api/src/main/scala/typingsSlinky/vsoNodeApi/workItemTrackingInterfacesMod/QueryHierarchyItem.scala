package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryHierarchyItem extends WorkItemTrackingResource {
  /**
    * The child query items inside a query folder.
    */
  var children: js.Array[QueryHierarchyItem] = js.native
  /**
    * The clauses for a flat query.
    */
  var clauses: WorkItemQueryClause = js.native
  /**
    * The columns of the query.
    */
  var columns: js.Array[WorkItemFieldReference] = js.native
  /**
    * The identity who created the query item.
    */
  var createdBy: IdentityReference = js.native
  /**
    * When the query item was created.
    */
  var createdDate: js.Date = js.native
  /**
    * The link query mode.
    */
  var filterOptions: LinkQueryMode = js.native
  /**
    * If this is a query folder, indicates if it contains any children.
    */
  var hasChildren: Boolean = js.native
  /**
    * The id of the query item.
    */
  var id: String = js.native
  /**
    * Indicates if this query item is deleted.
    */
  var isDeleted: Boolean = js.native
  /**
    * Indicates if this is a query folder or a query.
    */
  var isFolder: Boolean = js.native
  /**
    * Indicates if the WIQL of this query is invalid. This could be due to invalid syntax or a no longer valid area/iteration path.
    */
  var isInvalidSyntax: Boolean = js.native
  /**
    * Indicates if this query item is public or private.
    */
  var isPublic: Boolean = js.native
  /**
    * The identity who last ran the query.
    */
  var lastExecutedBy: IdentityReference = js.native
  /**
    * When the query was last run.
    */
  var lastExecutedDate: js.Date = js.native
  /**
    * The identity who last modified the query item.
    */
  var lastModifiedBy: IdentityReference = js.native
  /**
    * When the query item was last modified.
    */
  var lastModifiedDate: js.Date = js.native
  /**
    * The link query clause.
    */
  var linkClauses: WorkItemQueryClause = js.native
  /**
    * The name of the query item.
    */
  var name: String = js.native
  /**
    * The path of the query item.
    */
  var path: String = js.native
  /**
    * The recursion option for use in a tree query.
    */
  var queryRecursionOption: QueryRecursionOption = js.native
  /**
    * The type of query.
    */
  var queryType: QueryType = js.native
  /**
    * The sort columns of the query.
    */
  var sortColumns: js.Array[WorkItemQuerySortColumn] = js.native
  /**
    * The source clauses in a tree or one-hop link query.
    */
  var sourceClauses: WorkItemQueryClause = js.native
  /**
    * The target clauses in a tree or one-hop link query.
    */
  var targetClauses: WorkItemQueryClause = js.native
  /**
    * The WIQL text of the query
    */
  var wiql: String = js.native
}

object QueryHierarchyItem {
  @scala.inline
  def apply(
    _links: js.Any,
    children: js.Array[QueryHierarchyItem],
    clauses: WorkItemQueryClause,
    columns: js.Array[WorkItemFieldReference],
    createdBy: IdentityReference,
    createdDate: js.Date,
    filterOptions: LinkQueryMode,
    hasChildren: Boolean,
    id: String,
    isDeleted: Boolean,
    isFolder: Boolean,
    isInvalidSyntax: Boolean,
    isPublic: Boolean,
    lastExecutedBy: IdentityReference,
    lastExecutedDate: js.Date,
    lastModifiedBy: IdentityReference,
    lastModifiedDate: js.Date,
    linkClauses: WorkItemQueryClause,
    name: String,
    path: String,
    queryRecursionOption: QueryRecursionOption,
    queryType: QueryType,
    sortColumns: js.Array[WorkItemQuerySortColumn],
    sourceClauses: WorkItemQueryClause,
    targetClauses: WorkItemQueryClause,
    url: String,
    wiql: String
  ): QueryHierarchyItem = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], clauses = clauses.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], filterOptions = filterOptions.asInstanceOf[js.Any], hasChildren = hasChildren.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], isInvalidSyntax = isInvalidSyntax.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], lastExecutedBy = lastExecutedBy.asInstanceOf[js.Any], lastExecutedDate = lastExecutedDate.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], linkClauses = linkClauses.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], queryRecursionOption = queryRecursionOption.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], sortColumns = sortColumns.asInstanceOf[js.Any], sourceClauses = sourceClauses.asInstanceOf[js.Any], targetClauses = targetClauses.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], wiql = wiql.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryHierarchyItem]
  }
  @scala.inline
  implicit class QueryHierarchyItemOps[Self <: QueryHierarchyItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[QueryHierarchyItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClauses(value: WorkItemQueryClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[WorkItemFieldReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedBy(value: IdentityReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterOptions(value: LinkQueryMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInvalidSyntax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvalidSyntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastExecutedBy(value: IdentityReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastExecutedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastExecutedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastExecutedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedBy(value: IdentityReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkClauses(value: WorkItemQueryClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkClauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryRecursionOption(value: QueryRecursionOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryRecursionOption")(value.asInstanceOf[js.Any])
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
    def withSourceClauses(value: WorkItemQueryClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceClauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetClauses(value: WorkItemQueryClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetClauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWiql(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiql")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

