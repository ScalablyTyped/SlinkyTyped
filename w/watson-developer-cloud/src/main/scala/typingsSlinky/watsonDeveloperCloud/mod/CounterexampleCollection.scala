package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** CounterexampleCollection. */
@js.native
trait CounterexampleCollection extends js.Object {
  /** An array of objects describing the examples marked as irrelevant input. */
  var counterexamples: js.Array[Counterexample] = js.native
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
}

object CounterexampleCollection {
  @scala.inline
  def apply(counterexamples: js.Array[Counterexample], pagination: Pagination): CounterexampleCollection = {
    val __obj = js.Dynamic.literal(counterexamples = counterexamples.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterexampleCollection]
  }
  @scala.inline
  implicit class CounterexampleCollectionOps[Self <: CounterexampleCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounterexamples(value: js.Array[Counterexample]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterexamples")(value.asInstanceOf[js.Any])
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

