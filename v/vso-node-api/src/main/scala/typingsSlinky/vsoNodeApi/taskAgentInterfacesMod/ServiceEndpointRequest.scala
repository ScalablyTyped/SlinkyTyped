package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEndpointRequest extends js.Object {
  var dataSourceDetails: DataSourceDetails = js.native
  var resultTransformationDetails: ResultTransformationDetails = js.native
  var serviceEndpointDetails: ServiceEndpointDetails = js.native
}

object ServiceEndpointRequest {
  @scala.inline
  def apply(
    dataSourceDetails: DataSourceDetails,
    resultTransformationDetails: ResultTransformationDetails,
    serviceEndpointDetails: ServiceEndpointDetails
  ): ServiceEndpointRequest = {
    val __obj = js.Dynamic.literal(dataSourceDetails = dataSourceDetails.asInstanceOf[js.Any], resultTransformationDetails = resultTransformationDetails.asInstanceOf[js.Any], serviceEndpointDetails = serviceEndpointDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointRequest]
  }
  @scala.inline
  implicit class ServiceEndpointRequestOps[Self <: ServiceEndpointRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceDetails(value: DataSourceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultTransformationDetails(value: ResultTransformationDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultTransformationDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceEndpointDetails(value: ServiceEndpointDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceEndpointDetails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

