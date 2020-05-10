package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitImportStatusDetail extends js.Object {
  /**
    * All valid steps for the import process
    */
  var allSteps: js.Array[String] = js.native
  /**
    * Index into AllSteps for the current step
    */
  var currentStep: Double = js.native
  /**
    * Error message if the operation failed.
    */
  var errorMessage: String = js.native
}

object GitImportStatusDetail {
  @scala.inline
  def apply(allSteps: js.Array[String], currentStep: Double, errorMessage: String): GitImportStatusDetail = {
    val __obj = js.Dynamic.literal(allSteps = allSteps.asInstanceOf[js.Any], currentStep = currentStep.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportStatusDetail]
  }
  @scala.inline
  implicit class GitImportStatusDetailOps[Self <: GitImportStatusDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllSteps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

