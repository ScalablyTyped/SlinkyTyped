package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentRule extends js.Object {
  /**
  		 * The block comment character pair, like `/ * block comment *&#47;`
  		 */
  var blockComment: js.UndefOr[CharacterPair] = js.native
  /**
  		 * The line comment token, like `// this is a comment`
  		 */
  var lineComment: js.UndefOr[String] = js.native
}

object CommentRule {
  @scala.inline
  def apply(): CommentRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentRule]
  }
  @scala.inline
  implicit class CommentRuleOps[Self <: CommentRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockComment(value: CharacterPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockComment")(js.undefined)
        ret
    }
    @scala.inline
    def withLineComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineComment")(js.undefined)
        ret
    }
  }
  
}

