package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionQueryResult extends js.Object {
  /**
    * For each filter supplied in the query, a filter result will be returned in the query result.
    */
  var results: js.Array[ExtensionFilterResult] = js.native
}

object ExtensionQueryResult {
  @scala.inline
  def apply(results: js.Array[ExtensionFilterResult]): ExtensionQueryResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionQueryResult]
  }
  @scala.inline
  implicit class ExtensionQueryResultOps[Self <: ExtensionQueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResults(value: js.Array[ExtensionFilterResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

