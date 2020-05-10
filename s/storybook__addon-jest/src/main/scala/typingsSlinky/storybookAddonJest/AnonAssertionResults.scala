package typingsSlinky.storybookAddonJest

import typingsSlinky.storybookAddonJest.provideJestResultMod.AssertionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAssertionResults extends js.Object {
  var assertionResults: js.Array[AssertionResult] = js.native
  var status: String = js.native
}

object AnonAssertionResults {
  @scala.inline
  def apply(assertionResults: js.Array[AssertionResult], status: String): AnonAssertionResults = {
    val __obj = js.Dynamic.literal(assertionResults = assertionResults.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssertionResults]
  }
  @scala.inline
  implicit class AnonAssertionResultsOps[Self <: AnonAssertionResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssertionResults(value: js.Array[AssertionResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assertionResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

