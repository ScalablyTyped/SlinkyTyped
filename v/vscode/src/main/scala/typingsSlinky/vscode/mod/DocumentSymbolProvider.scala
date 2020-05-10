package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSymbolProvider extends js.Object {
  /**
  		 * Provide symbol information for the given document.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return An array of document highlights or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideDocumentSymbols(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[DocumentSymbol | SymbolInformation]] = js.native
}

object DocumentSymbolProvider {
  @scala.inline
  def apply(
    provideDocumentSymbols: (TextDocument, CancellationToken) => ProviderResult[js.Array[DocumentSymbol | SymbolInformation]]
  ): DocumentSymbolProvider = {
    val __obj = js.Dynamic.literal(provideDocumentSymbols = js.Any.fromFunction2(provideDocumentSymbols))
    __obj.asInstanceOf[DocumentSymbolProvider]
  }
  @scala.inline
  implicit class DocumentSymbolProviderOps[Self <: DocumentSymbolProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideDocumentSymbols(
      value: (TextDocument, CancellationToken) => ProviderResult[js.Array[DocumentSymbol | SymbolInformation]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentSymbols")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

