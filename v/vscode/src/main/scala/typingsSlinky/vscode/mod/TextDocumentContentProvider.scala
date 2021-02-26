package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentContentProvider extends StObject {
  
  /**
    * An event to signal a resource has changed.
    */
  var onDidChange: js.UndefOr[Event[Uri]] = js.native
  
  /**
    * Provide textual content for a given uri.
    *
    * The editor will use the returned string-content to create a readonly
    * [document](#TextDocument). Resources allocated should be released when
    * the corresponding document has been [closed](#workspace.onDidCloseTextDocument).
    *
    * **Note**: The contents of the created [document](#TextDocument) might not be
    * identical to the provided text due to end-of-line-sequence normalization.
    *
    * @param uri An uri which scheme matches the scheme this provider was [registered](#workspace.registerTextDocumentContentProvider) for.
    * @param token A cancellation token.
    * @return A string or a thenable that resolves to such.
    */
  def provideTextDocumentContent(uri: Uri, token: CancellationToken): ProviderResult[String] = js.native
}
object TextDocumentContentProvider {
  
  @scala.inline
  def apply(provideTextDocumentContent: (Uri, CancellationToken) => ProviderResult[String]): TextDocumentContentProvider = {
    val __obj = js.Dynamic.literal(provideTextDocumentContent = js.Any.fromFunction2(provideTextDocumentContent))
    __obj.asInstanceOf[TextDocumentContentProvider]
  }
  
  @scala.inline
  implicit class TextDocumentContentProviderMutableBuilder[Self <: TextDocumentContentProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDidChange(
      value: (/* listener */ js.Function1[Uri, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onDidChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnDidChangeUndefined: Self = StObject.set(x, "onDidChange", js.undefined)
    
    @scala.inline
    def setProvideTextDocumentContent(value: (Uri, CancellationToken) => ProviderResult[String]): Self = StObject.set(x, "provideTextDocumentContent", js.Any.fromFunction2(value))
  }
}
