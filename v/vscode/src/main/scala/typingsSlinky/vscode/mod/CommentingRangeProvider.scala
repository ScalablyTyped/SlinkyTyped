package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentingRangeProvider extends StObject {
  
  /**
    * Provide a list of ranges which allow new comment threads creation or null for a given document
    */
  def provideCommentingRanges(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[Range]] = js.native
}
object CommentingRangeProvider {
  
  @scala.inline
  def apply(provideCommentingRanges: (TextDocument, CancellationToken) => ProviderResult[js.Array[Range]]): CommentingRangeProvider = {
    val __obj = js.Dynamic.literal(provideCommentingRanges = js.Any.fromFunction2(provideCommentingRanges))
    __obj.asInstanceOf[CommentingRangeProvider]
  }
  
  @scala.inline
  implicit class CommentingRangeProviderMutableBuilder[Self <: CommentingRangeProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideCommentingRanges(value: (TextDocument, CancellationToken) => ProviderResult[js.Array[Range]]): Self = StObject.set(x, "provideCommentingRanges", js.Any.fromFunction2(value))
  }
}
