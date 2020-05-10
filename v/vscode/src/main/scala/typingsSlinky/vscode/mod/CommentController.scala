package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentController extends js.Object {
  /**
  		 * Optional commenting range provider. Provide a list [ranges](#Range) which support commenting to any given resource uri.
  		 *
  		 * If not provided, users can leave comments in any document opened in the editor.
  		 */
  var commentingRangeProvider: js.UndefOr[CommentingRangeProvider] = js.native
  /**
  		 * The id of this comment controller.
  		 */
  val id: String = js.native
  /**
  		 * The human-readable label of this comment controller.
  		 */
  val label: String = js.native
  /**
  		 * Optional reaction handler for creating and deleting reactions on a [comment](#Comment).
  		 */
  var reactionHandler: js.UndefOr[
    js.Function2[/* comment */ Comment, /* reaction */ CommentReaction, js.Promise[Unit]]
  ] = js.native
  /**
  		 * Create a [comment thread](#CommentThread). The comment thread will be displayed in visible text editors (if the resource matches)
  		 * and Comments Panel once created.
  		 *
  		 * @param uri The uri of the document the thread has been created on.
  		 * @param range The range the comment thread is located within the document.
  		 * @param comments The ordered comments of the thread.
  		 */
  def createCommentThread(uri: Uri, range: Range, comments: js.Array[Comment]): CommentThread = js.native
  /**
  		 * Dispose this comment controller.
  		 *
  		 * Once disposed, all [comment threads](#CommentThread) created by this comment controller will also be removed from the editor
  		 * and Comments Panel.
  		 */
  def dispose(): Unit = js.native
}

object CommentController {
  @scala.inline
  def apply(
    createCommentThread: (Uri, Range, js.Array[Comment]) => CommentThread,
    dispose: () => Unit,
    id: String,
    label: String
  ): CommentController = {
    val __obj = js.Dynamic.literal(createCommentThread = js.Any.fromFunction3(createCommentThread), dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentController]
  }
  @scala.inline
  implicit class CommentControllerOps[Self <: CommentController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateCommentThread(value: (Uri, Range, js.Array[Comment]) => CommentThread): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCommentThread")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommentingRangeProvider(value: CommentingRangeProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentingRangeProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentingRangeProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentingRangeProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withReactionHandler(value: (/* comment */ Comment, /* reaction */ CommentReaction) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReactionHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactionHandler")(js.undefined)
        ret
    }
  }
  
}

