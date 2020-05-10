package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentThread extends js.Object {
  /**
  		 * Whether the thread should be collapsed or expanded when opening the document.
  		 * Defaults to Collapsed.
  		 */
  var collapsibleState: CommentThreadCollapsibleState = js.native
  /**
  		 * The ordered comments of the thread.
  		 */
  var comments: js.Array[Comment] = js.native
  /**
  		 * Context value of the comment thread. This can be used to contribute thread specific actions.
  		 * For example, a comment thread is given a context value as `editable`. When contributing actions to `comments/commentThread/title`
  		 * using `menus` extension point, you can specify context value for key `commentThread` in `when` expression like `commentThread == editable`.
  		 * ```
  		 *	"contributes": {
  		 *		"menus": {
  		 *			"comments/commentThread/title": [
  		 *				{
  		 *					"command": "extension.deleteCommentThread",
  		 *					"when": "commentThread == editable"
  		 *				}
  		 *			]
  		 *		}
  		 *	}
  		 * ```
  		 * This will show action `extension.deleteCommentThread` only for comment threads with `contextValue` is `editable`.
  		 */
  var contextValue: js.UndefOr[String] = js.native
  /**
  		 * The optional human-readable label describing the [Comment Thread](#CommentThread)
  		 */
  var label: js.UndefOr[String] = js.native
  /**
  		 * The range the comment thread is located within the document. The thread icon will be shown
  		 * at the first line of the range.
  		 */
  var range: Range = js.native
  /**
  		 * The uri of the document the thread has been created on.
  		 */
  val uri: Uri = js.native
  /**
  		 * Dispose this comment thread.
  		 *
  		 * Once disposed, this comment thread will be removed from visible editors and Comment Panel when approriate.
  		 */
  def dispose(): Unit = js.native
}

object CommentThread {
  @scala.inline
  def apply(
    collapsibleState: CommentThreadCollapsibleState,
    comments: js.Array[Comment],
    dispose: () => Unit,
    range: Range,
    uri: Uri
  ): CommentThread = {
    val __obj = js.Dynamic.literal(collapsibleState = collapsibleState.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), range = range.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentThread]
  }
  @scala.inline
  implicit class CommentThreadOps[Self <: CommentThread] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsibleState(value: CommentThreadCollapsibleState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsibleState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: js.Array[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

