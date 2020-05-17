package typingsSlinky.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Brackets extends js.Object {
  /**
  			 * This property is deprecated and will be **ignored** from
  			 * the editor.
  			 * @deprecated
  			 */
  var brackets: js.UndefOr[js.Any] = js.native
  /**
  			 * This property is deprecated and not fully supported anymore by
  			 * the editor (scope and lineStart are ignored).
  			 * Use the autoClosingPairs property in the language configuration file instead.
  			 * @deprecated
  			 */
  var docComment: js.UndefOr[Close] = js.native
}

object Brackets {
  @scala.inline
  def apply(): Brackets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brackets]
  }
  @scala.inline
  implicit class BracketsOps[Self <: Brackets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrackets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brackets")(js.undefined)
        ret
    }
    @scala.inline
    def withDocComment(value: Close): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docComment")(js.undefined)
        ret
    }
  }
  
}

