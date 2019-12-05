package typingsSlinky.vscodeDashLanguageclient.libConfigurationMod

import typingsSlinky.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.HandlerResult
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod.ConfigurationParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod.ConfigurationRequest.HandlerSignature
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod.ConfigurationRequest.MiddlewareSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationWorkspaceMiddleware extends js.Object {
  var configuration: js.UndefOr[MiddlewareSignature] = js.undefined
}

object ConfigurationWorkspaceMiddleware {
  @scala.inline
  def apply(
    configuration: (/* params */ ConfigurationParams, /* token */ CancellationToken, /* next */ HandlerSignature) => HandlerResult[js.Array[js.Any], Unit] = null
  ): ConfigurationWorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(js.Any.fromFunction3(configuration))
    __obj.asInstanceOf[ConfigurationWorkspaceMiddleware]
  }
}

