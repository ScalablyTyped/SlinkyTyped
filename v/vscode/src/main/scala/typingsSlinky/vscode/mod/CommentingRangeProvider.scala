package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentingRangeProvider extends js.Object {
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
  implicit class CommentingRangeProviderOps[Self <: CommentingRangeProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideCommentingRanges(value: (TextDocument, CancellationToken) => ProviderResult[js.Array[Range]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideCommentingRanges")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

