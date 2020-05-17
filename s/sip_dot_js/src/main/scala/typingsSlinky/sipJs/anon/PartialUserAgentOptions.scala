package typingsSlinky.sipJs.anon

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typingsSlinky.sipJs.coreMod.URI
import typingsSlinky.sipJs.sessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typingsSlinky.sipJs.sessionMod.Session
import typingsSlinky.sipJs.transportMod.Transport
import typingsSlinky.sipJs.userAgentDelegateMod.UserAgentDelegate
import typingsSlinky.sipJs.userAgentOptionsMod.LogConnector
import typingsSlinky.sipJs.userAgentOptionsMod.LogLevel
import typingsSlinky.sipJs.userAgentOptionsMod.SIPExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<sip.js.sip.js/lib/api/user-agent-options.UserAgentOptions> */
@js.native
trait PartialUserAgentOptions extends js.Object {
  var allowLegacyNotifications: js.UndefOr[Boolean] = js.native
  var allowOutOfDialogRefers: js.UndefOr[Boolean] = js.native
  var authorizationPassword: js.UndefOr[String] = js.native
  var authorizationUsername: js.UndefOr[String] = js.native
  var autoStart: js.UndefOr[Boolean] = js.native
  var autoStop: js.UndefOr[Boolean] = js.native
  var delegate: js.UndefOr[UserAgentDelegate] = js.native
  var displayName: js.UndefOr[String] = js.native
  var forceRport: js.UndefOr[Boolean] = js.native
  var hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.native
  var hackIpInContact: js.UndefOr[Boolean | String] = js.native
  var hackViaTcp: js.UndefOr[Boolean] = js.native
  var hackWssInTransport: js.UndefOr[Boolean] = js.native
  var logBuiltinEnabled: js.UndefOr[Boolean] = js.native
  var logConfiguration: js.UndefOr[Boolean] = js.native
  var logConnector: js.UndefOr[LogConnector] = js.native
  var logLevel: js.UndefOr[LogLevel] = js.native
  var noAnswerTimeout: js.UndefOr[Double] = js.native
  var preloadedRouteSet: js.UndefOr[js.Array[String]] = js.native
  var reconnectionAttempts: js.UndefOr[Double] = js.native
  var reconnectionDelay: js.UndefOr[Double] = js.native
  var sessionDescriptionHandlerFactory: js.UndefOr[SessionDescriptionHandlerFactory] = js.native
  var sessionDescriptionHandlerFactoryOptions: js.UndefOr[js.Object] = js.native
  var sipExtension100rel: js.UndefOr[SIPExtension] = js.native
  var sipExtensionExtraSupported: js.UndefOr[js.Array[String]] = js.native
  var sipExtensionReplaces: js.UndefOr[SIPExtension] = js.native
  var sipjsId: js.UndefOr[String] = js.native
  var transportConstructor: js.UndefOr[Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport]] = js.native
  var transportOptions: js.UndefOr[js.Any] = js.native
  var uri: js.UndefOr[URI] = js.native
  var userAgentString: js.UndefOr[String] = js.native
  var viaHost: js.UndefOr[String] = js.native
}

object PartialUserAgentOptions {
  @scala.inline
  def apply(): PartialUserAgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUserAgentOptions]
  }
  @scala.inline
  implicit class PartialUserAgentOptionsOps[Self <: PartialUserAgentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowLegacyNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLegacyNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowLegacyNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLegacyNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowOutOfDialogRefers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOutOfDialogRefers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOutOfDialogRefers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOutOfDialogRefers")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizationPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizationUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationUsername")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoStop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStop")(js.undefined)
        ret
    }
    @scala.inline
    def withDelegate(value: UserAgentDelegate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withForceRport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceRport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRport")(js.undefined)
        ret
    }
    @scala.inline
    def withHackAllowUnregisteredOptionTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackAllowUnregisteredOptionTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHackAllowUnregisteredOptionTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackAllowUnregisteredOptionTags")(js.undefined)
        ret
    }
    @scala.inline
    def withHackIpInContact(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackIpInContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHackIpInContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackIpInContact")(js.undefined)
        ret
    }
    @scala.inline
    def withHackViaTcp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackViaTcp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHackViaTcp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackViaTcp")(js.undefined)
        ret
    }
    @scala.inline
    def withHackWssInTransport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackWssInTransport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHackWssInTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackWssInTransport")(js.undefined)
        ret
    }
    @scala.inline
    def withLogBuiltinEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logBuiltinEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogBuiltinEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logBuiltinEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLogConfiguration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withLogConnector(
      value: (/* level */ LogLevel, /* category */ String, /* label */ js.UndefOr[String], /* content */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConnector")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutLogConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConnector")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withNoAnswerTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAnswerTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoAnswerTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAnswerTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadedRouteSet(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadedRouteSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadedRouteSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadedRouteSet")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectionAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectionAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectionDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectionDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionDescriptionHandlerFactory(value: (/* session */ Session, /* options */ js.UndefOr[js.Object]) => SessionDescriptionHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerFactory")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSessionDescriptionHandlerFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionDescriptionHandlerFactoryOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerFactoryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionDescriptionHandlerFactoryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerFactoryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSipExtension100rel(value: SIPExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipExtension100rel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSipExtension100rel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipExtension100rel")(js.undefined)
        ret
    }
    @scala.inline
    def withSipExtensionExtraSupported(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipExtensionExtraSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSipExtensionExtraSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipExtensionExtraSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withSipExtensionReplaces(value: SIPExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipExtensionReplaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSipExtensionReplaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipExtensionReplaces")(js.undefined)
        ret
    }
    @scala.inline
    def withSipjsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipjsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSipjsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipjsId")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportConstructor(value: Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportConstructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportConstructor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportConstructor")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgentString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgentString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgentString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgentString")(js.undefined)
        ret
    }
    @scala.inline
    def withViaHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viaHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViaHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viaHost")(js.undefined)
        ret
    }
  }
  
}

