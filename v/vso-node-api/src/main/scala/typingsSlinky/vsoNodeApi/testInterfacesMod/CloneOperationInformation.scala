package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneOperationInformation extends js.Object {
  var cloneStatistics: CloneStatistics = js.native
  /**
    * If the operation is complete, the DateTime of completion. If operation is not complete, this is DateTime.MaxValue
    */
  var completionDate: js.Date = js.native
  /**
    * DateTime when the operation was started
    */
  var creationDate: js.Date = js.native
  /**
    * Shallow reference of the destination
    */
  var destinationObject: ShallowReference = js.native
  /**
    * Shallow reference of the destination
    */
  var destinationPlan: ShallowReference = js.native
  /**
    * Shallow reference of the destination
    */
  var destinationProject: ShallowReference = js.native
  /**
    * If the operation has Failed, Message contains the reason for failure. Null otherwise.
    */
  var message: String = js.native
  /**
    * The ID of the operation
    */
  var opId: Double = js.native
  /**
    * The type of the object generated as a result of the Clone operation
    */
  var resultObjectType: ResultObjectType = js.native
  /**
    * Shallow reference of the source
    */
  var sourceObject: ShallowReference = js.native
  /**
    * Shallow reference of the source
    */
  var sourcePlan: ShallowReference = js.native
  /**
    * Shallow reference of the source
    */
  var sourceProject: ShallowReference = js.native
  /**
    * Current state of the operation. When State reaches Suceeded or Failed, the operation is complete
    */
  var state: CloneOperationState = js.native
  /**
    * Url for geting the clone information
    */
  var url: String = js.native
}

object CloneOperationInformation {
  @scala.inline
  def apply(
    cloneStatistics: CloneStatistics,
    completionDate: js.Date,
    creationDate: js.Date,
    destinationObject: ShallowReference,
    destinationPlan: ShallowReference,
    destinationProject: ShallowReference,
    message: String,
    opId: Double,
    resultObjectType: ResultObjectType,
    sourceObject: ShallowReference,
    sourcePlan: ShallowReference,
    sourceProject: ShallowReference,
    state: CloneOperationState,
    url: String
  ): CloneOperationInformation = {
    val __obj = js.Dynamic.literal(cloneStatistics = cloneStatistics.asInstanceOf[js.Any], completionDate = completionDate.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], destinationObject = destinationObject.asInstanceOf[js.Any], destinationPlan = destinationPlan.asInstanceOf[js.Any], destinationProject = destinationProject.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], opId = opId.asInstanceOf[js.Any], resultObjectType = resultObjectType.asInstanceOf[js.Any], sourceObject = sourceObject.asInstanceOf[js.Any], sourcePlan = sourcePlan.asInstanceOf[js.Any], sourceProject = sourceProject.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneOperationInformation]
  }
  @scala.inline
  implicit class CloneOperationInformationOps[Self <: CloneOperationInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloneStatistics(value: CloneStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletionDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationObject(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationPlan(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationProject(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultObjectType(value: ResultObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceObject(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourcePlan(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceProject(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: CloneOperationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

