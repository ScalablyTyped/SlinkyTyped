package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestApiResponseStatusModel extends js.Object {
  /**
    * Gets or sets the operation details
    */
  var operationDetails: js.Any = js.native
  /**
    * Gets or sets the operation id
    */
  var operationId: String = js.native
  /**
    * Gets or sets the completed status percentage
    */
  var percentageCompleted: Double = js.native
  /**
    * Gets or sets the status
    */
  var status: RestApiResponseStatus = js.native
  /**
    * Gets or sets the status message
    */
  var statusMessage: String = js.native
}

object RestApiResponseStatusModel {
  @scala.inline
  def apply(
    operationDetails: js.Any,
    operationId: String,
    percentageCompleted: Double,
    status: RestApiResponseStatus,
    statusMessage: String
  ): RestApiResponseStatusModel = {
    val __obj = js.Dynamic.literal(operationDetails = operationDetails.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], percentageCompleted = percentageCompleted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestApiResponseStatusModel]
  }
  @scala.inline
  implicit class RestApiResponseStatusModelOps[Self <: RestApiResponseStatusModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationDetails(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentageCompleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentageCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: RestApiResponseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

