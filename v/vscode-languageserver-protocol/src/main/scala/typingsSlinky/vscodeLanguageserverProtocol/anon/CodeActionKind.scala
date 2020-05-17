package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionKind extends js.Object {
  /**
    * The code action kind is support with the following value
    * set.
    */
  var codeActionKind: `0` = js.native
}

object CodeActionKind {
  @scala.inline
  def apply(codeActionKind: `0`): CodeActionKind = {
    val __obj = js.Dynamic.literal(codeActionKind = codeActionKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionKind]
  }
  @scala.inline
  implicit class CodeActionKindOps[Self <: CodeActionKind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeActionKind(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeActionKind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

