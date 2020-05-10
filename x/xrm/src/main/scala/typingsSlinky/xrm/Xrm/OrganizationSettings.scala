package typingsSlinky.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns information about the current organization settings.
  */
@js.native
trait OrganizationSettings extends js.Object {
  /**
    * Returns a lookup object containing the ID, name, and entity type of the base currency for the current organization.
    */
  var baseCurrency: LookupValue = js.native
  /**
    * Returns the ID of the base currency for the current organization.
    * @deprecated Deprecated in v9.1; use {@link Xrm.OrganizationSettings.baseCurrency globalContext.organizationSettings.baseCurrency} instead to display name along with the ID.
    */
  var baseCurrencyId: String = js.native
  /**
    * Returns the default country/region code for phone numbers for the current organization.
    */
  var defaultCountryCode: String = js.native
  /**
    * Indicates whether the auto-save option is enabled for the current organization.
    */
  var isAutoSaveEnabled: Boolean = js.native
  /**
    * Returns the preferred language ID for the current organization.
    */
  var languageId: Double = js.native
  /**
    * Returns the ID of the current organization.
    */
  var organizationId: String = js.native
  /**
    * Returns the unique name of the current organization.
    */
  var uniqueName: String = js.native
  /**
    * Indicates whether the Skype protocol is used for the current organization.
    */
  var useSkypeProtocol: Boolean = js.native
}

object OrganizationSettings {
  @scala.inline
  def apply(
    baseCurrency: LookupValue,
    baseCurrencyId: String,
    defaultCountryCode: String,
    isAutoSaveEnabled: Boolean,
    languageId: Double,
    organizationId: String,
    uniqueName: String,
    useSkypeProtocol: Boolean
  ): OrganizationSettings = {
    val __obj = js.Dynamic.literal(baseCurrency = baseCurrency.asInstanceOf[js.Any], baseCurrencyId = baseCurrencyId.asInstanceOf[js.Any], defaultCountryCode = defaultCountryCode.asInstanceOf[js.Any], isAutoSaveEnabled = isAutoSaveEnabled.asInstanceOf[js.Any], languageId = languageId.asInstanceOf[js.Any], organizationId = organizationId.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], useSkypeProtocol = useSkypeProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationSettings]
  }
  @scala.inline
  implicit class OrganizationSettingsOps[Self <: OrganizationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseCurrency(value: LookupValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseCurrencyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCurrencyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAutoSaveEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutoSaveEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseSkypeProtocol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSkypeProtocol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

