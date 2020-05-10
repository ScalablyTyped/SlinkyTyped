package typingsSlinky.select2.mod

import typingsSlinky.select2.AnonMore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessedResult[Result] extends js.Object {
  var pagination: js.UndefOr[AnonMore] = js.native
  var results: js.Array[Result] = js.native
}

object ProcessedResult {
  @scala.inline
  def apply[Result](results: js.Array[Result]): ProcessedResult[Result] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedResult[Result]]
  }
  @scala.inline
  implicit class ProcessedResultOps[Self[result] <: ProcessedResult[result], Result] (val x: Self[Result]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Result] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Result]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Result] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Result] with Other]
    @scala.inline
    def withResults(value: js.Array[Result]): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagination(value: AnonMore): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
  }
  
}

