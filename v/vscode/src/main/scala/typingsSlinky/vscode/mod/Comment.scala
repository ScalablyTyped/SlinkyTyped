package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  /**
  		 * The [author information](#CommentAuthorInformation) of the comment
  		 */
  var author: CommentAuthorInformation = js.native
  /**
  		 * The human-readable comment body
  		 */
  var body: String | MarkdownString = js.native
  /**
  		 * Context value of the comment. This can be used to contribute comment specific actions.
  		 * For example, a comment is given a context value as `editable`. When contributing actions to `comments/comment/title`
  		 * using `menus` extension point, you can specify context value for key `comment` in `when` expression like `comment == editable`.
  		 * ```json
  		 *	"contributes": {
  		 *		"menus": {
  		 *			"comments/comment/title": [
  		 *				{
  		 *					"command": "extension.deleteComment",
  		 *					"when": "comment == editable"
  		 *				}
  		 *			]
  		 *		}
  		 *	}
  		 * ```
  		 * This will show action `extension.deleteComment` only for comments with `contextValue` is `editable`.
  		 */
  var contextValue: js.UndefOr[String] = js.native
  /**
  		 * Optional label describing the [Comment](#Comment)
  		 * Label will be rendered next to authorName if exists.
  		 */
  var label: js.UndefOr[String] = js.native
  /**
  		 * [Comment mode](#CommentMode) of the comment
  		 */
  var mode: CommentMode = js.native
  /**
  		 * Optional reactions of the [comment](#Comment)
  		 */
  var reactions: js.UndefOr[js.Array[CommentReaction]] = js.native
}

object Comment {
  @scala.inline
  def apply(author: CommentAuthorInformation, body: String | MarkdownString, mode: CommentMode): Comment = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: CommentAuthorInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String | MarkdownString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: CommentMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withReactions(value: js.Array[CommentReaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactions")(js.undefined)
        ret
    }
  }
  
}

