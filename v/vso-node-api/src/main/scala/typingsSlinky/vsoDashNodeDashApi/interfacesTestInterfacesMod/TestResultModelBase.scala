package typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultModelBase extends js.Object {
  var comment: String
  var completedDate: js.Date
  var durationInMs: Double
  var errorMessage: String
  var outcome: String
  var startedDate: js.Date
}

object TestResultModelBase {
  @scala.inline
  def apply(
    comment: String,
    completedDate: js.Date,
    durationInMs: Double,
    errorMessage: String,
    outcome: String,
    startedDate: js.Date
  ): TestResultModelBase = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestResultModelBase]
  }
}

