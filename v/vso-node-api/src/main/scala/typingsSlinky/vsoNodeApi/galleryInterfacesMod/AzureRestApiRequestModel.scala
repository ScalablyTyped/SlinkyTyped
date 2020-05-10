package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureRestApiRequestModel extends js.Object {
  /**
    * Gets or sets the Asset details
    */
  var assetDetails: AssetDetails = js.native
  /**
    * Gets or sets the asset id
    */
  var assetId: String = js.native
  /**
    * Gets or sets the asset version
    */
  var assetVersion: Double = js.native
  /**
    * Gets or sets the customer support email
    */
  var customerSupportEmail: String = js.native
  /**
    * Gets or sets the integration contact email
    */
  var integrationContactEmail: String = js.native
  /**
    * Gets or sets the asset version
    */
  var operation: String = js.native
  /**
    * Gets or sets the plan identifier if any.
    */
  var planId: String = js.native
  /**
    * Gets or sets the publisher id
    */
  var publisherId: String = js.native
  /**
    * Gets or sets the resource type
    */
  var `type`: String = js.native
}

object AzureRestApiRequestModel {
  @scala.inline
  def apply(
    assetDetails: AssetDetails,
    assetId: String,
    assetVersion: Double,
    customerSupportEmail: String,
    integrationContactEmail: String,
    operation: String,
    planId: String,
    publisherId: String,
    `type`: String
  ): AzureRestApiRequestModel = {
    val __obj = js.Dynamic.literal(assetDetails = assetDetails.asInstanceOf[js.Any], assetId = assetId.asInstanceOf[js.Any], assetVersion = assetVersion.asInstanceOf[js.Any], customerSupportEmail = customerSupportEmail.asInstanceOf[js.Any], integrationContactEmail = integrationContactEmail.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureRestApiRequestModel]
  }
  @scala.inline
  implicit class AzureRestApiRequestModelOps[Self <: AzureRestApiRequestModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetDetails(value: AssetDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssetVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomerSupportEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerSupportEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegrationContactEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrationContactEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

