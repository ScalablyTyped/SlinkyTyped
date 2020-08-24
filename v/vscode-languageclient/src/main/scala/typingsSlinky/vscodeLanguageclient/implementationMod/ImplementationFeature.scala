package typingsSlinky.vscodeLanguageclient.implementationMod

import typingsSlinky.vscode.mod.ImplementationProvider
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/implementation", "ImplementationFeature")
@js.native
class ImplementationFeature protected () extends TextDocumentFeature[
      Boolean | ImplementationOptions, 
      ImplementationRegistrationOptions, 
      ImplementationProvider
    ] {
  def this(client: BaseLanguageClient) = this()
}

