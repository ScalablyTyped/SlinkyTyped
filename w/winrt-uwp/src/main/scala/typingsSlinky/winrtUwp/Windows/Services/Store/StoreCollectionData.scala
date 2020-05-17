package typingsSlinky.winrtUwp.Windows.Services.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides additional data for a product SKU that the user has an entitlement to use. */
@js.native
trait StoreCollectionData extends js.Object {
  /** Gets the date on which the product SKU was acquired. */
  var acquiredDate: js.Date = js.native
  /** Gets the promotion campaign ID that is associated with the product SKU. */
  var campaignId: String = js.native
  /** Gets the developer offer ID that is associated with the product SKU. */
  var developerOfferId: String = js.native
  /** Gets the end date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
  var endDate: js.Date = js.native
  /** Gets complete collection data for the product SKU in JSON format. */
  var extendedJsonData: String = js.native
  /** Gets a value that indicates whether the product SKU is a trial version. */
  var isTrial: Boolean = js.native
  /** Gets the start date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
  var startDate: js.Date = js.native
  /** Gets the remaining trial time for the product SKU. */
  var trialTimeRemaining: Double = js.native
}

object StoreCollectionData {
  @scala.inline
  def apply(
    acquiredDate: js.Date,
    campaignId: String,
    developerOfferId: String,
    endDate: js.Date,
    extendedJsonData: String,
    isTrial: Boolean,
    startDate: js.Date,
    trialTimeRemaining: Double
  ): StoreCollectionData = {
    val __obj = js.Dynamic.literal(acquiredDate = acquiredDate.asInstanceOf[js.Any], campaignId = campaignId.asInstanceOf[js.Any], developerOfferId = developerOfferId.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], extendedJsonData = extendedJsonData.asInstanceOf[js.Any], isTrial = isTrial.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], trialTimeRemaining = trialTimeRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreCollectionData]
  }
  @scala.inline
  implicit class StoreCollectionDataOps[Self <: StoreCollectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcquiredDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquiredDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCampaignId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeveloperOfferId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerOfferId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedJsonData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedJsonData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTrial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrialTimeRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialTimeRemaining")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

