package typingsSlinky.vscodeLanguageclient.configurationMod

import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsSlinky.vscodeJsonrpc.mod.HandlerResult
import typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationRequest.HandlerSignature
import typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationRequest.MiddlewareSignature
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

