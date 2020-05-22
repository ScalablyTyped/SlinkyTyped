package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIterationDetailsModel extends js.Object {
  var actionResults: js.Array[TestActionResultModel]
  var attachments: js.Array[TestCaseResultAttachmentModel]
  var comment: String
  var completedDate: js.Date
  var durationInMs: Double
  var errorMessage: String
  var id: Double
  var outcome: String
  var parameters: js.Array[TestResultParameterModel]
  var startedDate: js.Date
  var url: String
}

object TestIterationDetailsModel {
  @scala.inline
  def apply(
    actionResults: js.Array[TestActionResultModel],
    attachments: js.Array[TestCaseResultAttachmentModel],
    comment: String,
    completedDate: js.Date,
    durationInMs: Double,
    errorMessage: String,
    id: Double,
    outcome: String,
    parameters: js.Array[TestResultParameterModel],
    startedDate: js.Date,
    url: String
  ): TestIterationDetailsModel = {
    val __obj = js.Dynamic.literal(actionResults = actionResults.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIterationDetailsModel]
  }
}

