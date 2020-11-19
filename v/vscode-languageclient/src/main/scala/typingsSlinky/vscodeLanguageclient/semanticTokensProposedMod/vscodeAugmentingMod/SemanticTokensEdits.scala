package typingsSlinky.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "SemanticTokensEdits")
@js.native
class SemanticTokensEdits protected () extends js.Object {
  def this(edits: js.Array[SemanticTokensEdit]) = this()
  def this(edits: js.Array[SemanticTokensEdit], resultId: String) = this()
  
  val edits: js.Array[SemanticTokensEdit] = js.native
  
  /**
    * The result id of the tokens.
    *
    * This is the id that will be passed to `DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits` (if implemented).
    */
  val resultId: js.UndefOr[String] = js.native
}
