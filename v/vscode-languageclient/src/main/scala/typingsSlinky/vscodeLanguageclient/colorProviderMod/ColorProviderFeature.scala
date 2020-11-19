package typingsSlinky.vscodeLanguageclient.colorProviderMod

import typingsSlinky.vscode.mod.DocumentColorProvider
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/colorProvider", "ColorProviderFeature")
@js.native
class ColorProviderFeature protected () extends TextDocumentFeature[
      Boolean | DocumentColorOptions, 
      DocumentColorRegistrationOptions, 
      DocumentColorProvider
    ] {
  def this(client: BaseLanguageClient) = this()
  
  var asColor: js.Any = js.native
  
  var asColorInformations: js.Any = js.native
  
  var asColorPresentations: js.Any = js.native
}
