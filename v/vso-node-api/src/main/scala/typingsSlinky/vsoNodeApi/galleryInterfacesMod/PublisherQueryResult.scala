package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublisherQueryResult extends js.Object {
  /**
    * For each filter supplied in the query, a filter result will be returned in the query result.
    */
  var results: js.Array[PublisherFilterResult] = js.native
}

object PublisherQueryResult {
  @scala.inline
  def apply(results: js.Array[PublisherFilterResult]): PublisherQueryResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherQueryResult]
  }
  @scala.inline
  implicit class PublisherQueryResultOps[Self <: PublisherQueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResults(value: js.Array[PublisherFilterResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

