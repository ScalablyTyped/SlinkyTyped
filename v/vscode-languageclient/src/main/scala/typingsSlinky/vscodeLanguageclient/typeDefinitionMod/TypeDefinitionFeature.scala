package typingsSlinky.vscodeLanguageclient.typeDefinitionMod

import typingsSlinky.vscode.mod.TypeDefinitionProvider
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/typeDefinition", "TypeDefinitionFeature")
@js.native
class TypeDefinitionFeature protected () extends TextDocumentFeature[
      Boolean | TypeDefinitionOptions, 
      TypeDefinitionRegistrationOptions, 
      TypeDefinitionProvider
    ] {
  def this(client: BaseLanguageClient) = this()
}
