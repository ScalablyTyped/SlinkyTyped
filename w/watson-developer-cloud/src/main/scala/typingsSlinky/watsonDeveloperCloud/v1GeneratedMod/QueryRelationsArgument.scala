package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryRelationsArgument. */
@js.native
trait QueryRelationsArgument extends js.Object {
  /** Array of query entities. */
  var entities: js.UndefOr[js.Array[QueryEntitiesEntity]] = js.native
}

object QueryRelationsArgument {
  @scala.inline
  def apply(): QueryRelationsArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsArgument]
  }
  @scala.inline
  implicit class QueryRelationsArgumentOps[Self <: QueryRelationsArgument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: js.Array[QueryEntitiesEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.undefined)
        ret
    }
  }
  
}

