package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SynonymCollection. */
@js.native
trait SynonymCollection extends js.Object {
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
  /** An array of synonyms. */
  var synonyms: js.Array[Synonym] = js.native
}

object SynonymCollection {
  @scala.inline
  def apply(pagination: Pagination, synonyms: js.Array[Synonym]): SynonymCollection = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], synonyms = synonyms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynonymCollection]
  }
  @scala.inline
  implicit class SynonymCollectionOps[Self <: SynonymCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPagination(value: Pagination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSynonyms(value: js.Array[Synonym]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synonyms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

