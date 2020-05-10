package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of objects describing the entities for the workspace. */
@js.native
trait EntityCollection extends js.Object {
  /** An array of objects describing the entities defined for the workspace. */
  var entities: js.Array[Entity] = js.native
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
}

object EntityCollection {
  @scala.inline
  def apply(entities: js.Array[Entity], pagination: Pagination): EntityCollection = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityCollection]
  }
  @scala.inline
  implicit class EntityCollectionOps[Self <: EntityCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: js.Array[Entity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagination(value: Pagination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

