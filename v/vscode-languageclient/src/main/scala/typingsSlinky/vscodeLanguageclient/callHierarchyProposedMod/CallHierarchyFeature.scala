package typingsSlinky.vscodeLanguageclient.callHierarchyProposedMod

import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyOptions
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/callHierarchy.proposed", "CallHierarchyFeature")
@js.native
class CallHierarchyFeature protected () extends TextDocumentFeature[
      Boolean | CallHierarchyOptions, 
      CallHierarchyRegistrationOptions, 
      CallHierarchyProvider
    ] {
  def this(client: BaseLanguageClient) = this()
}

