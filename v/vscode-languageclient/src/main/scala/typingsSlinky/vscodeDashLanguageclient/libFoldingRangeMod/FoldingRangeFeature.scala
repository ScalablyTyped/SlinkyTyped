package typingsSlinky.vscodeDashLanguageclient.libFoldingRangeMod

import typingsSlinky.vscodeDashLanguageclient.libClientMod.BaseLanguageClient
import typingsSlinky.vscodeDashLanguageclient.libClientMod.TextDocumentFeature
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/foldingRange", "FoldingRangeFeature")
@js.native
class FoldingRangeFeature protected () extends TextDocumentFeature[TextDocumentRegistrationOptions] {
  def this(client: BaseLanguageClient) = this()
  var asFoldingRangeKind: js.Any = js.native
  var asFoldingRanges: js.Any = js.native
}

