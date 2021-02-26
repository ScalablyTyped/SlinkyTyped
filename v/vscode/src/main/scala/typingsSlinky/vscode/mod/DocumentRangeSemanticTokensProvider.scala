package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentRangeSemanticTokensProvider extends StObject {
  
  /**
    * @see [provideDocumentSemanticTokens](#DocumentSemanticTokensProvider.provideDocumentSemanticTokens).
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
  implicit class DocumentRangeSemanticTokensProviderMutableBuilder[Self <: DocumentRangeSemanticTokensProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideDocumentRangeSemanticTokens(value: (TextDocument, Range, CancellationToken) => ProviderResult[SemanticTokens]): Self = StObject.set(x, "provideDocumentRangeSemanticTokens", js.Any.fromFunction3(value))
  }
}
