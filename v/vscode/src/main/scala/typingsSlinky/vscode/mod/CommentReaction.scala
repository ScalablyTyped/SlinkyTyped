package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentReaction extends js.Object {
  /**
  		 * Whether the [author](CommentAuthorInformation) of the comment has reacted to this reaction
  		 */
  val authorHasReacted: Boolean = js.native
  /**
  		 * The number of users who have reacted to this reaction
  		 */
  val count: Double = js.native
  /**
  		 * Icon for the reaction shown in UI.
  		 */
  val iconPath: String | Uri = js.native
  /**
  		 * The human-readable label for the reaction
  		 */
  val label: String = js.native
}

object CommentReaction {
  @scala.inline
  def apply(authorHasReacted: Boolean, count: Double, iconPath: String | Uri, label: String): CommentReaction = {
    val __obj = js.Dynamic.literal(authorHasReacted = authorHasReacted.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], iconPath = iconPath.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentReaction]
  }
  @scala.inline
  implicit class CommentReactionOps[Self <: CommentReaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorHasReacted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorHasReacted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconPath(value: String | Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

