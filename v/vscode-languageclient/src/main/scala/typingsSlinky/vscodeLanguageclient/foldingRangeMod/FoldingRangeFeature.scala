package typingsSlinky.vscodeLanguageclient.foldingRangeMod

import typingsSlinky.vscode.mod.FoldingRangeProvider
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/foldingRange", "FoldingRangeFeature")
@js.native
class FoldingRangeFeature protected () extends TextDocumentFeature[Boolean | FoldingRangeOptions, FoldingRangeRegistrationOptions, FoldingRangeProvider] {
  def this(client: BaseLanguageClient) = this()
  
  var asFoldingRangeKind: js.Any = js.native
  
  var asFoldingRanges: js.Any = js.native
}
