package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "ConfigurationRequest")
@js.native
object ConfigurationRequest extends js.Object {
  
  val `type`: ProtocolRequestType[
    ConfigurationParams with PartialResultParams, 
    js.Array[js.Any], 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
