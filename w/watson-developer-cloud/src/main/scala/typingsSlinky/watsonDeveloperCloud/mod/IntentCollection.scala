package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IntentCollection. */
@js.native
trait IntentCollection extends js.Object {
  /** An array of objects describing the intents defined for the workspace. */
  var intents: js.Array[Intent] = js.native
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
}

object IntentCollection {
  @scala.inline
  def apply(intents: js.Array[Intent], pagination: Pagination): IntentCollection = {
    val __obj = js.Dynamic.literal(intents = intents.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentCollection]
  }
  @scala.inline
  implicit class IntentCollectionOps[Self <: IntentCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntents(value: js.Array[Intent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intents")(value.asInstanceOf[js.Any])
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

