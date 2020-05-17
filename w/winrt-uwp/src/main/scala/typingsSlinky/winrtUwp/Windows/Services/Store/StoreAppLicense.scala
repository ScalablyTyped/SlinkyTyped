package typingsSlinky.winrtUwp.Windows.Services.Store

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides license info for the current app, including licenses for products that are offered by the app. */
@js.native
trait StoreAppLicense extends js.Object {
  /** Gets the collection of licenses for add-ons that can be used offline (typically durable add-ons), for which the user has entitlements to use. This property does not include licenses for consumable add-ons. */
  var addOnLicenses: IMapView[String, StoreLicense] = js.native
  /** Gets the expiration date and time for the app license. */
  var expirationDate: js.Date = js.native
  /** Gets complete license data in JSON format. */
  var extendedJsonData: String = js.native
  /** Gets a value that indicates whether the license is active. */
  var isActive: Boolean = js.native
  /** Gets a value that indicates whether the license is a trial license. */
  var isTrial: Boolean = js.native
  /** Gets a value that indicates whether the current user has an entitlement for the usage-limited trial that is associated with this app license. */
  var isTrialOwnedByThisUser: Boolean = js.native
  /** Gets the Store ID of the licensed app SKU from the Windows Store catalog. */
  var skuStoreId: String = js.native
  /** Gets the remaining time for the usage-limited trial that is associated with this app license. */
  var trialTimeRemaining: Double = js.native
  /** Gets a unique ID that identifies the combination of the current user and the usage-limited trial that is associated with this app license. */
  var trialUniqueId: String = js.native
}

object StoreAppLicense {
  @scala.inline
  def apply(
    addOnLicenses: IMapView[String, StoreLicense],
    expirationDate: js.Date,
    extendedJsonData: String,
    isActive: Boolean,
    isTrial: Boolean,
    isTrialOwnedByThisUser: Boolean,
    skuStoreId: String,
    trialTimeRemaining: Double,
    trialUniqueId: String
  ): StoreAppLicense = {
    val __obj = js.Dynamic.literal(addOnLicenses = addOnLicenses.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], extendedJsonData = extendedJsonData.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isTrial = isTrial.asInstanceOf[js.Any], isTrialOwnedByThisUser = isTrialOwnedByThisUser.asInstanceOf[js.Any], skuStoreId = skuStoreId.asInstanceOf[js.Any], trialTimeRemaining = trialTimeRemaining.asInstanceOf[js.Any], trialUniqueId = trialUniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreAppLicense]
  }
  @scala.inline
  implicit class StoreAppLicenseOps[Self <: StoreAppLicense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOnLicenses(value: IMapView[String, StoreLicense]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnLicenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedJsonData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedJsonData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTrial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTrialOwnedByThisUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrialOwnedByThisUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkuStoreId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuStoreId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrialTimeRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialTimeRemaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrialUniqueId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialUniqueId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

