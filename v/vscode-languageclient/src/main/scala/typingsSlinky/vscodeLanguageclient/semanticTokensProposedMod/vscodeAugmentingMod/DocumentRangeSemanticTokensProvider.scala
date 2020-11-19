package typingsSlinky.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod

import typingsSlinky.vscode.mod.CancellationToken
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.Range
import typingsSlinky.vscode.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The document range semantic tokens provider interface defines the contract between extensions and
  * semantic tokens.
  */
@js.native
trait DocumentRangeSemanticTokensProvider extends js.Object {
  
  /**
    * See [provideDocumentSemanticTokens](#DocumentSemanticTokensProvider.provideDocumentSemanticTokens).
    */
  def provideDocumentRangeSemanticTokens(document: TextDocument, range: Range, token: CancellationToken): ProviderResult[SemanticTokens] = js.native
}
object DocumentRangeSemanticTokensProvider {
  
  @scala.inline
  def apply(
    provideDocumentRangeSemanticTokens: (TextDocument, Range, CancellationToken) => ProviderResult[SemanticTokens]
  ): DocumentRangeSemanticTokensProvider = {
    val __obj = js.Dynamic.literal(provideDocumentRangeSemanticTokens = js.Any.fromFunction3(provideDocumentRangeSemanticTokens))
    __obj.asInstanceOf[DocumentRangeSemanticTokensProvider]
  }
  
  @scala.inline
  implicit class DocumentRangeSemanticTokensProviderOps[Self <: DocumentRangeSemanticTokensProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProvideDocumentRangeSemanticTokens(value: (TextDocument, Range, CancellationToken) => ProviderResult[SemanticTokens]): Self = this.set("provideDocumentRangeSemanticTokens", js.Any.fromFunction3(value))
  }
}
