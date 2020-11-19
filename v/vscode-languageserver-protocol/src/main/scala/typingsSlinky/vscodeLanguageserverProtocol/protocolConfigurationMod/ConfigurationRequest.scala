package typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod

import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsSlinky.vscodeJsonrpc.mod.HandlerResult
import typingsSlinky.vscodeJsonrpc.mod.RequestHandler
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.configuration", "ConfigurationRequest")
@js.native
object ConfigurationRequest extends js.Object {
  
  val `type`: ProtocolRequestType[
    ConfigurationParams with PartialResultParams, 
    js.Array[js.Any], 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
  
  type HandlerSignature = RequestHandler[ConfigurationParams, js.Array[js.Any], Unit]
  
  type MiddlewareSignature = js.Function3[
    /* params */ ConfigurationParams, 
    /* token */ CancellationToken, 
    /* next */ HandlerSignature, 
    HandlerResult[js.Array[js.Any], Unit]
  ]
}
