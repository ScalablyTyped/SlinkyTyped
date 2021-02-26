package typingsSlinky.vscode.mod

import typingsSlinky.vscode.anon.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentColorProvider extends StObject {
  
  /**
    * Provide [representations](#ColorPresentation) for a color.
    *
    * @param color The color to show and insert.
    * @param context A context object with additional information
    * @param token A cancellation token.
    * @return An array of color presentations or a thenable that resolves to such. The lack of a result
    * can be signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideColorPresentations(color: Color, context: Document, token: CancellationToken): ProviderResult[js.Array[ColorPresentation]] = js.native
  
  /**
    * Provide colors for the given document.
    *
    * @param document The document in which the command was invoked.
    * @param token A cancellation token.
    * @return An array of [color information](#ColorInformation) or a thenable that resolves to such. The lack of a result
    * can be signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideDocumentColors(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[ColorInformation]] = js.native
}
object DocumentColorProvider {
  
  @scala.inline
  def apply(
    provideColorPresentations: (Color, Document, CancellationToken) => ProviderResult[js.Array[ColorPresentation]],
    provideDocumentColors: (TextDocument, CancellationToken) => ProviderResult[js.Array[ColorInformation]]
  ): DocumentColorProvider = {
    val __obj = js.Dynamic.literal(provideColorPresentations = js.Any.fromFunction3(provideColorPresentations), provideDocumentColors = js.Any.fromFunction2(provideDocumentColors))
    __obj.asInstanceOf[DocumentColorProvider]
  }
  
  @scala.inline
  implicit class DocumentColorProviderMutableBuilder[Self <: DocumentColorProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideColorPresentations(value: (Color, Document, CancellationToken) => ProviderResult[js.Array[ColorPresentation]]): Self = StObject.set(x, "provideColorPresentations", js.Any.fromFunction3(value))
    
    @scala.inline
    def setProvideDocumentColors(value: (TextDocument, CancellationToken) => ProviderResult[js.Array[ColorInformation]]): Self = StObject.set(x, "provideDocumentColors", js.Any.fromFunction2(value))
  }
}
