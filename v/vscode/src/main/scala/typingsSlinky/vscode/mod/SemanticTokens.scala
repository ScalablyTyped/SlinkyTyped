package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "SemanticTokens")
@js.native
class SemanticTokens protected () extends js.Object {
  def this(data: js.typedarray.Uint32Array) = this()
  def this(data: js.typedarray.Uint32Array, resultId: String) = this()
  /**
  		 * The actual tokens data.
  		 * @see [provideDocumentSemanticTokens](#DocumentSemanticTokensProvider.provideDocumentSemanticTokens) for an explanation of the format.
  		 */
  val data: js.typedarray.Uint32Array = js.native
  /**
  		 * The result id of the tokens.
  		 *
  		 * This is the id that will be passed to `DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits` (if implemented).
  		 */
  val resultId: js.UndefOr[String] = js.native
}

