package typingsSlinky.sparqljs.mod

import typingsSlinky.sparqljs.sparqljsStrings.delete
import typingsSlinky.sparqljs.sparqljsStrings.deletewhere
import typingsSlinky.sparqljs.sparqljsStrings.insert
import typingsSlinky.sparqljs.sparqljsStrings.insertdelete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertDeleteOperation extends UpdateOperation {
  var delete: js.UndefOr[js.Array[Quads]] = js.native
  var graph: js.UndefOr[String] = js.native
  var insert: js.UndefOr[js.Array[Quads]] = js.native
  var updateType: insert | delete | deletewhere | insertdelete = js.native
  var where: js.UndefOr[js.Array[Pattern]] = js.native
}

object InsertDeleteOperation {
  @scala.inline
  def apply(updateType: insert | delete | deletewhere | insertdelete): InsertDeleteOperation = {
    val __obj = js.Dynamic.literal(updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertDeleteOperation]
  }
  @scala.inline
  implicit class InsertDeleteOperationOps[Self <: InsertDeleteOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateType(value: insert | delete | deletewhere | insertdelete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: js.Array[Quads]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withGraph(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: js.Array[Quads]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withWhere(value: js.Array[Pattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.undefined)
        ret
    }
  }
  
}

