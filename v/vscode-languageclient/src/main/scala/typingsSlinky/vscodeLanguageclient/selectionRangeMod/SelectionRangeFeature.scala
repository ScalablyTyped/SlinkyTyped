package typingsSlinky.vscodeLanguageclient.selectionRangeMod

import typingsSlinky.vscode.mod.SelectionRangeProvider
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/selectionRange", "SelectionRangeFeature")
@js.native
class SelectionRangeFeature protected () extends TextDocumentFeature[
      Boolean | SelectionRangeOptions, 
      SelectionRangeRegistrationOptions, 
      SelectionRangeProvider
    ] {
  def this(client: BaseLanguageClient) = this()
}
