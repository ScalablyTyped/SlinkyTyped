package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryRelationsFilter. */
@js.native
trait QueryRelationsFilter extends js.Object {
  /** A comma-separated list of document IDs to include in the query. */
  var document_ids: js.UndefOr[js.Array[String]] = js.native
  var entity_types: js.UndefOr[QueryFilterType] = js.native
  var relation_types: js.UndefOr[QueryFilterType] = js.native
}

object QueryRelationsFilter {
  @scala.inline
  def apply(): QueryRelationsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsFilter]
  }
  @scala.inline
  implicit class QueryRelationsFilterOps[Self <: QueryRelationsFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withEntity_types(value: QueryFilterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntity_types: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity_types")(js.undefined)
        ret
    }
    @scala.inline
    def withRelation_types(value: QueryFilterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relation_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelation_types: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relation_types")(js.undefined)
        ret
    }
  }
  
}

