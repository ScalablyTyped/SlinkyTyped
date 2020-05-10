package typingsSlinky.storybookComponents.syntaxhighlighterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxHighlighterState extends js.Object {
  var copied: Boolean = js.native
}

object SyntaxHighlighterState {
  @scala.inline
  def apply(copied: Boolean): SyntaxHighlighterState = {
    val __obj = js.Dynamic.literal(copied = copied.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxHighlighterState]
  }
  @scala.inline
  implicit class SyntaxHighlighterStateOps[Self <: SyntaxHighlighterState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopied(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copied")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

