package typingsSlinky.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents device settings for app sync relationships. */
@js.native
trait DeviceAccountConfiguration extends js.Object {
  /** Gets or sets the name that identifies the device account. */
  var accountName: String = js.native
  /** Gets or sets a Boolean value indicating if calendar syncing is enabled. */
  var calendarSyncEnabled: Boolean = js.native
  /** Gets or sets a Boolean value indicating if contacts syncing is enabled. */
  var contactsSyncEnabled: Boolean = js.native
  /** Gets or sets the value that identifies the device account type. */
  var deviceAccountTypeId: String = js.native
  /** Gets or sets the network domain of the device. */
  var domain: String = js.native
  /** Gets or sets the email address of the current user. */
  var emailAddress: String = js.native
  /** Gets or sets a Boolean value indicating if email syncing is enabled. */
  var emailSyncEnabled: Boolean = js.native
  /** Gets or sets the incoming email server address. */
  var incomingServerAddress: String = js.native
  /** Gets or sets the port number to use to connect to the incoming email server. */
  var incomingServerPort: Double = js.native
  /** Gets or sets a Boolean value indicating if Secure Sockets Layer (SSL) should be used when connecting to the incoming email server. */
  var incomingServerRequiresSsl: Boolean = js.native
  /** Gets or sets the username to use when connecting to the incoming email server. */
  var incomingServerUsername: String = js.native
  /** Gets or sets the outgoing email server address. */
  var outgoingServerAddress: String = js.native
  /** Gets or sets the port number to use to connect to the outgoing email server. */
  var outgoingServerPort: Double = js.native
  /** Gets or sets a Boolean value indicating if Secure Sockets Layer (SSL) should be used when connecting to the outgoing email server. */
  var outgoingServerRequiresSsl: Boolean = js.native
  /** Gets or sets the username to use when connecting to the outgoing email server. */
  var outgoingServerUsername: String = js.native
  /** Gets or sets a value indicating the type of the server. */
  var serverType: DeviceAccountServerType = js.native
}

object DeviceAccountConfiguration {
  @scala.inline
  def apply(
    accountName: String,
    calendarSyncEnabled: Boolean,
    contactsSyncEnabled: Boolean,
    deviceAccountTypeId: String,
    domain: String,
    emailAddress: String,
    emailSyncEnabled: Boolean,
    incomingServerAddress: String,
    incomingServerPort: Double,
    incomingServerRequiresSsl: Boolean,
    incomingServerUsername: String,
    outgoingServerAddress: String,
    outgoingServerPort: Double,
    outgoingServerRequiresSsl: Boolean,
    outgoingServerUsername: String,
    serverType: DeviceAccountServerType
  ): DeviceAccountConfiguration = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], calendarSyncEnabled = calendarSyncEnabled.asInstanceOf[js.Any], contactsSyncEnabled = contactsSyncEnabled.asInstanceOf[js.Any], deviceAccountTypeId = deviceAccountTypeId.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], emailSyncEnabled = emailSyncEnabled.asInstanceOf[js.Any], incomingServerAddress = incomingServerAddress.asInstanceOf[js.Any], incomingServerPort = incomingServerPort.asInstanceOf[js.Any], incomingServerRequiresSsl = incomingServerRequiresSsl.asInstanceOf[js.Any], incomingServerUsername = incomingServerUsername.asInstanceOf[js.Any], outgoingServerAddress = outgoingServerAddress.asInstanceOf[js.Any], outgoingServerPort = outgoingServerPort.asInstanceOf[js.Any], outgoingServerRequiresSsl = outgoingServerRequiresSsl.asInstanceOf[js.Any], outgoingServerUsername = outgoingServerUsername.asInstanceOf[js.Any], serverType = serverType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceAccountConfiguration]
  }
  @scala.inline
  implicit class DeviceAccountConfigurationOps[Self <: DeviceAccountConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarSyncEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarSyncEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContactsSyncEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactsSyncEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceAccountTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAccountTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailSyncEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailSyncEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomingServerAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingServerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomingServerPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingServerPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomingServerRequiresSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingServerRequiresSsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomingServerUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingServerUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingServerAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingServerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingServerPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingServerPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingServerRequiresSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingServerRequiresSsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingServerUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingServerUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerType(value: DeviceAccountServerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

