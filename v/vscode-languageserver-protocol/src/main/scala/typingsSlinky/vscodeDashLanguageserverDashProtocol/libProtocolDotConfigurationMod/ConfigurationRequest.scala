package typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod

import typingsSlinky.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.HandlerResult
import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestHandler
import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod.ConfigurationRequest.HandlerSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.configuration", "ConfigurationRequest")
@js.native
object ConfigurationRequest extends js.Object {
  val `type`: RequestType[ConfigurationParams, js.Array[js.Any], Unit, Unit] = js.native
  type HandlerSignature = RequestHandler[ConfigurationParams, js.Array[js.Any], Unit]
  type MiddlewareSignature = js.Function3[
    /* params */ ConfigurationParams, 
    /* token */ CancellationToken, 
    /* next */ HandlerSignature, 
    HandlerResult[js.Array[js.Any], Unit]
  ]
}

