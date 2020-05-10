package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultsQuery extends js.Object {
  var fields: js.Array[String] = js.native
  var results: js.Array[TestCaseResult] = js.native
  var resultsFilter: ResultsFilter = js.native
}

object TestResultsQuery {
  @scala.inline
  def apply(fields: js.Array[String], results: js.Array[TestCaseResult], resultsFilter: ResultsFilter): TestResultsQuery = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], resultsFilter = resultsFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsQuery]
  }
  @scala.inline
  implicit class TestResultsQueryOps[Self <: TestResultsQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[TestCaseResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultsFilter(value: ResultsFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsFilter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

