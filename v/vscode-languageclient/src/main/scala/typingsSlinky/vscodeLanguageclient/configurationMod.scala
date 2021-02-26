package typingsSlinky.vscodeLanguageclient

import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsSlinky.vscodeJsonrpc.mod.HandlerResult
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.StaticFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationRequest.HandlerSignature
import typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationRequest.MiddlewareSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  @JSImport("vscode-languageclient/lib/configuration", "ConfigurationFeature")
  @js.native
  class ConfigurationFeature protected () extends StaticFeature {
    def this(_client: BaseLanguageClient) = this()
    
    var _client: js.Any = js.native
    
    var getConfiguration: js.Any = js.native
    
    def initialize(): Unit = js.native
  }
  
  @js.native
  trait ConfigurationWorkspaceMiddleware extends StObject {
    
    var configuration: js.UndefOr[MiddlewareSignature] = js.native
  }
  object ConfigurationWorkspaceMiddleware {
    
    @scala.inline
    def apply(): ConfigurationWorkspaceMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationWorkspaceMiddleware]
    }
    
    @scala.inline
    implicit class ConfigurationWorkspaceMiddlewareMutableBuilder[Self <: ConfigurationWorkspaceMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfiguration(
        value: (/* params */ ConfigurationParams, /* token */ CancellationToken, /* next */ HandlerSignature) => HandlerResult[js.Array[js.Any], Unit]
      ): Self = StObject.set(x, "configuration", js.Any.fromFunction3(value))
      
      @scala.inline
      def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    }
  }
}
