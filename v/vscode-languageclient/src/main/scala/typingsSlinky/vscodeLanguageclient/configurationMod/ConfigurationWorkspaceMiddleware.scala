package typingsSlinky.vscodeLanguageclient.configurationMod

import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsSlinky.vscodeJsonrpc.mod.HandlerResult
import typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationRequest.HandlerSignature
import typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationRequest.MiddlewareSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationWorkspaceMiddleware extends js.Object {
  var configuration: js.UndefOr[MiddlewareSignature] = js.native
}

object ConfigurationWorkspaceMiddleware {
  @scala.inline
  def apply(): ConfigurationWorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationWorkspaceMiddleware]
  }
  @scala.inline
  implicit class ConfigurationWorkspaceMiddlewareOps[Self <: ConfigurationWorkspaceMiddleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(
      value: (/* params */ ConfigurationParams, /* token */ CancellationToken, /* next */ HandlerSignature) => HandlerResult[js.Array[js.Any], Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
  }
  
}

