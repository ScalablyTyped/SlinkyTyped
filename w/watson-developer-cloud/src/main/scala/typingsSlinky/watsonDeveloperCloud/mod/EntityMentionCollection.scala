package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** EntityMentionCollection. */
@js.native
trait EntityMentionCollection extends js.Object {
  /** An array of objects describing the entity mentions defined for an entity. */
  var examples: js.Array[EntityMention] = js.native
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
}

object EntityMentionCollection {
  @scala.inline
  def apply(examples: js.Array[EntityMention], pagination: Pagination): EntityMentionCollection = {
    val __obj = js.Dynamic.literal(examples = examples.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityMentionCollection]
  }
  @scala.inline
  implicit class EntityMentionCollectionOps[Self <: EntityMentionCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExamples(value: js.Array[EntityMention]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(value.asInstanceOf[js.Any])
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

