package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigurationRequest {
  
  @JSImport("vscode-languageclient/lib/client", "ConfigurationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    ConfigurationParams with PartialResultParams, 
    js.Array[js.Any], 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
