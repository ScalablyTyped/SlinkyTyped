package typingsSlinky.sipJs.userAgentOptionsMod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typingsSlinky.sipJs.coreMod.URI
import typingsSlinky.sipJs.sessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typingsSlinky.sipJs.sessionMod.Session
import typingsSlinky.sipJs.transportMod.Transport
import typingsSlinky.sipJs.userAgentDelegateMod.UserAgentDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentOptions extends js.Object {
  /**
    * If `true`, the user agent will accept out of dialog NOTIFY.
    * @remarks
    * RFC 6665 obsoletes the use of out of dialog NOTIFY from RFC 3265.
    * @defaultValue `false`
    */
  var allowLegacyNotifications: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the user agent will accept out of dialog REFER.
    * @defaultValue `false`
    */
  var allowOutOfDialogRefers: js.UndefOr[Boolean] = js.native
  /**
    * Authorization password.
    * @defaultValue `""`
    */
  var authorizationPassword: js.UndefOr[String] = js.native
  /**
    * Authorization username.
    * @defaultValue `""`
    */
  var authorizationUsername: js.UndefOr[String] = js.native
  /**
    * @deprecated
    * If `true`, the user agent calls the `start()` method in the constructor.
    * @defaultValue `false`
    * @remarks
    * The call to start() resolves when the user agent connects, so if this
    * option is set to `true` an alternative method of connection detection
    * must be used.
    */
  var autoStart: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the user agent calls the `stop()` method on unload (if running in browser window).
    * @defaultValue `true`
    */
  var autoStop: js.UndefOr[Boolean] = js.native
  /**
    * Delegate for {@link UserAgent}.
    * @defaultValue `{}`
    */
  var delegate: js.UndefOr[UserAgentDelegate] = js.native
  /**
    * The display name associated with the user agent.
    * @remarks
    * Descriptive name to be shown to the called party when calling or sending IM messages
    * (the display name portion of the From header).
    * It must NOT be enclosed between double quotes even if the given name contains multi-byte symbols
    * (SIPjs will always enclose the `displayName` value between double quotes).
    * @defaultValue `""`
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Force adding rport to Via header.
    * @defaultValue `false`
    */
  var forceRport: js.UndefOr[Boolean] = js.native
  /**
    * Hack
    * @deprecated TBD
    */
  var hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.native
  /**
    * Hack
    * @deprecated TBD
    */
  var hackIpInContact: js.UndefOr[Boolean | String] = js.native
  /**
    * Hack
    * @deprecated TBD
    */
  var hackViaTcp: js.UndefOr[Boolean] = js.native
  /**
    * Hack
    * @deprecated TBD
    */
  var hackWssInTransport: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether log messages should be written to the browser console.
    * @defaultValue `true`
    */
  var logBuiltinEnabled: js.UndefOr[Boolean] = js.native
  /**
    * If true, constructor logs the user agent configuration.
    * @defaultValue `true`
    */
  var logConfiguration: js.UndefOr[Boolean] = js.native
  /**
    * A function which will be called every time a log is generated.
    * @defaultValue A noop
    */
  var logConnector: js.UndefOr[LogConnector] = js.native
  /**
    * Indicates the verbosity level of the log messages.
    * @defaultValue `"log"`
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  /**
    * Number of seconds after which an incoming call is rejected if not answered.
    * @defaultValue 60
    */
  var noAnswerTimeout: js.UndefOr[Double] = js.native
  /**
    * Adds a Route header(s) to outgoing requests.
    * @defaultValue `[]`
    */
  var preloadedRouteSet: js.UndefOr[js.Array[String]] = js.native
  /**
    * @deprecated
    * Maximum number of times to attempt to reconnect when the transport connection drops.
    * @defaultValue 0
    */
  var reconnectionAttempts: js.UndefOr[Double] = js.native
  /**
    * @deprecated
    * Seconds to wait between reconnection attempts when the transport connection drops.
    * @defaultValue 4
    */
  var reconnectionDelay: js.UndefOr[Double] = js.native
  /**
    * A factory for generating `SessionDescriptionHandler` instances.
    * @remarks
    * The factory will be passed a `Session` object for the current session
    * and the `sessionDescriptionHandlerFactoryOptions` object.
    * @defaultValue `Web.SessionDescriptionHandler.defaultFactory`
    */
  var sessionDescriptionHandlerFactory: js.UndefOr[SessionDescriptionHandlerFactory] = js.native
  /**
    * Options to passed to `sessionDescriptionHandlerFactory`.
    * @remarks
    * See `Web.SessionDescriptionHandlerOptions` for details.
    * @defaultValue `{}`
    */
  var sessionDescriptionHandlerFactoryOptions: js.UndefOr[js.Object] = js.native
  /**
    * Reliable provisional responses.
    * https://tools.ietf.org/html/rfc3262
    * @defaultValue `SIPExtension.Unsupported`
    */
  var sipExtension100rel: js.UndefOr[SIPExtension] = js.native
  /**
    * Extra option tags to claim support for.
    * @remarks
    * Setting an extra option tag does not enable support for the associated extension
    * it simply adds the tag to the list of supported options.
    * See {@link UserAgentRegisteredOptionTags} for valid option tags.
    * @defaultValue `[]`
    */
  var sipExtensionExtraSupported: js.UndefOr[js.Array[String]] = js.native
  /**
    * Replaces header.
    * https://tools.ietf.org/html/rfc3891
    * @defaultValue `SIPExtension.Unsupported`
    */
  var sipExtensionReplaces: js.UndefOr[SIPExtension] = js.native
  /**
    * An id uniquely identify this user agent instance.
    * @defaultValue
    * A random id generated by default.
    */
  var sipjsId: js.UndefOr[String] = js.native
  /**
    * A constructor function for the user agent's `Transport`.
    * @remarks
    * For more information about creating your own transport see `Transport`.
    * @defaultValue `WebSocketTransport`
    */
  var transportConstructor: js.UndefOr[Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport]] = js.native
  /**
    * An options bucket object passed to `transportConstructor` when instantiated.
    * @remarks
    * See WebSocket Transport Configuration Parameters for the full list of options for the default transport.
    * @defaultValue `{}`
    */
  var transportOptions: js.UndefOr[js.Any] = js.native
  /**
    * SIP Addresses-of-Record URI associated with the user agent.
    * @remarks
    * This is a SIP address given to you by your provider.
    * If the user agent registers, it is the address-of-record which the user agent registers a contact for.
    * An address-of-record represents an identity of the user, generally a long-term identity,
    * and it does not have a dependency on any device; users can move between devices or even
    * be associated with multiple devices at one time while retaining the same address-of-record.
    * A simple URI, generally of the form `sip:egdar@example.com`, is used for an address-of-record.
    * @defaultValue
    * By default, URI is set to `sip:anonymous.X@anonymous.invalid`, where X is a random token generated for each UA.
    */
  var uri: js.UndefOr[URI] = js.native
  /**
    * User agent string used in the UserAgent header.
    * @defaultValue
    * A reasonable value is utilized.
    */
  var userAgentString: js.UndefOr[String] = js.native
  /**
    * Hostname to use in Via header.
    * @defaultValue
    * A random hostname in the .invalid domain.
    */
  var viaHost: js.UndefOr[String] = js.native
}

object UserAgentOptions {
  @scala.inline
  def apply(): UserAgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentOptions]
  }
  @scala.inline
  implicit class UserAgentOptionsOps[Self <: UserAgentOptions] (val x: Self) extends AnyVal {
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

