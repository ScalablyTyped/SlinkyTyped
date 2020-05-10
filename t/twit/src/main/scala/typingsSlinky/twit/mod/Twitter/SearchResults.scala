package typingsSlinky.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResults extends js.Object {
  var search_metadata: Metadata = js.native
  var statuses: js.Array[Status] = js.native
}

object SearchResults {
  @scala.inline
  def apply(search_metadata: Metadata, statuses: js.Array[Status]): SearchResults = {
    val __obj = js.Dynamic.literal(search_metadata = search_metadata.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResults]
  }
  @scala.inline
  implicit class SearchResultsOps[Self <: SearchResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearch_metadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses(value: js.Array[Status]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

