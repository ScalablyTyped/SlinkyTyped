package typingsSlinky.xrm.Xrm

import typingsSlinky.xrm.Xrm.Collection.ItemCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds information about the current user settings.
  */
@js.native
trait UserSettings extends js.Object {
  /**
    * Returns the ID of the default dashboard for the current user.
    */
  var defaultDashboardId: String = js.native
  /**
    * Indicates whether guided help is enabled for the current user.
    */
  var isGuidedHelpEnabled: Boolean = js.native
  /**
    * Indicates whether high contrast is enabled for the current user.
    */
  var isHighContrastEnabled: Boolean = js.native
  /**
    * Indicates whether the language for the current user is a right-to-left (RTL) language.
    */
  var isRTL: Boolean = js.native
  /**
    * Returns the language ID for the current user.
    */
  var languageId: Double = js.native
  /**
    * Returns a collection of lookup objects containing the GUID and display name of each of the security role or teams that the user is associated with.
    */
  var roles: ItemCollection[LookupValue] = js.native
  /**
    * Returns an array of strings that represent the GUID values of each of the security role privilege that the user is associated with or any teams that the user is associated with.
    */
  var securityRolePrivileges: js.Array[String] = js.native
  /**
    * Returns an array of strings that represent the GUID values of each of the security role that the user is associated with or any teams that the user is associated with.
    * @deprecated Deprecated in v9.1; use {@link Xrm.UserSettings.roles globalContext.userSettings.roles} instead to display names of security roles or teams along with the ID.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  var securityRoles: js.Array[String] = js.native
  /**
    * Returns a lookup object containing the ID, display name, and entity type of the transaction currency for the current user.
    */
  var transactionCurrency: LookupValue = js.native
  /**
    * Returns the transaction currency ID for the current user.
    * @deprecated Deprecated in v9.1; use {@link Xrm.UserSettings.transactionCurrency globalContext.userSettings.transactionCurrency} instead to display name along with the ID.
    */
  var transactionCurrencyId: String = js.native
  /**
    * Returns the GUID of the SystemUser.Id value for the current user.
    */
  var userId: String = js.native
  /**
    * Returns the name of the current user.
    */
  var userName: String = js.native
  /**
    * Returns the date formatting information for the current user.
    */
  def dateFormattingInfo(): DateFormattingInfo = js.native
  /**
    * Returns the difference in minutes between the local time and Coordinated Universal Time (UTC).
    */
  def getTimeZoneOffsetMinutes(): Double = js.native
}

object UserSettings {
  @scala.inline
  def apply(
    dateFormattingInfo: () => DateFormattingInfo,
    defaultDashboardId: String,
    getTimeZoneOffsetMinutes: () => Double,
    isGuidedHelpEnabled: Boolean,
    isHighContrastEnabled: Boolean,
    isRTL: Boolean,
    languageId: Double,
    roles: ItemCollection[LookupValue],
    securityRolePrivileges: js.Array[String],
    securityRoles: js.Array[String],
    transactionCurrency: LookupValue,
    transactionCurrencyId: String,
    userId: String,
    userName: String
  ): UserSettings = {
    val __obj = js.Dynamic.literal(dateFormattingInfo = js.Any.fromFunction0(dateFormattingInfo), defaultDashboardId = defaultDashboardId.asInstanceOf[js.Any], getTimeZoneOffsetMinutes = js.Any.fromFunction0(getTimeZoneOffsetMinutes), isGuidedHelpEnabled = isGuidedHelpEnabled.asInstanceOf[js.Any], isHighContrastEnabled = isHighContrastEnabled.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], languageId = languageId.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], securityRolePrivileges = securityRolePrivileges.asInstanceOf[js.Any], securityRoles = securityRoles.asInstanceOf[js.Any], transactionCurrency = transactionCurrency.asInstanceOf[js.Any], transactionCurrencyId = transactionCurrencyId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSettings]
  }
  @scala.inline
  implicit class UserSettingsOps[Self <: UserSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateFormattingInfo(value: () => DateFormattingInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormattingInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultDashboardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDashboardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTimeZoneOffsetMinutes(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeZoneOffsetMinutes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsGuidedHelpEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGuidedHelpEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHighContrastEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHighContrastEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoles(value: ItemCollection[LookupValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityRolePrivileges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRolePrivileges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityRoles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionCurrency(value: LookupValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionCurrencyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionCurrencyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

