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

/* Inlined std.Required<sip.js.sip.js/lib/api/user-agent-options.UserAgentOptions> */
@js.native
trait RequiredUserAgentOptions extends js.Object {
  var allowLegacyNotifications: Boolean = js.native
  var authorizationPassword: String = js.native
  var authorizationUsername: String = js.native
  var autoStart: Boolean = js.native
  var autoStop: Boolean = js.native
  var delegate: UserAgentDelegate = js.native
  var displayName: String = js.native
  var forceRport: Boolean = js.native
  var hackAllowUnregisteredOptionTags: Boolean = js.native
  var hackIpInContact: Boolean | String = js.native
  var hackViaTcp: Boolean = js.native
  var hackWssInTransport: Boolean = js.native
  var logBuiltinEnabled: Boolean = js.native
  var logConfiguration: Boolean = js.native
  @JSName("logConnector")
  var logConnector_Original: LogConnector = js.native
  var logLevel: LogLevel = js.native
  var noAnswerTimeout: Double = js.native
  var preloadedRouteSet: js.Array[String] = js.native
  var reconnectionAttempts: Double = js.native
  var reconnectionDelay: Double = js.native
  var sessionDescriptionHandlerFactoryOptions: js.Object = js.native
  @JSName("sessionDescriptionHandlerFactory")
  var sessionDescriptionHandlerFactory_Original: SessionDescriptionHandlerFactory = js.native
  var sipExtension100rel: SIPExtension = js.native
  var sipExtensionExtraSupported: js.Array[String] = js.native
  var sipExtensionReplaces: SIPExtension = js.native
  var sipjsId: String = js.native
  var transportConstructor: Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport] = js.native
  var transportOptions: js.Any = js.native
  var uri: URI = js.native
  var userAgentString: String = js.native
  var viaHost: String = js.native
  def logConnector(level: LogLevel, category: String, label: js.UndefOr[String], content: String): Unit = js.native
  def sessionDescriptionHandlerFactory(session: Session): SessionDescriptionHandler = js.native
  def sessionDescriptionHandlerFactory(session: Session, options: js.Object): SessionDescriptionHandler = js.native
}

