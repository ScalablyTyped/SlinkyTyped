package typingsSlinky.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeDeclaration extends js.Object {
  var includeDeclaration: Boolean = js.native
}

object AnonIncludeDeclaration {
  @scala.inline
  def apply(includeDeclaration: Boolean): AnonIncludeDeclaration = {
    val __obj = js.Dynamic.literal(includeDeclaration = includeDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeDeclaration]
  }
  @scala.inline
  implicit class AnonIncludeDeclarationOps[Self <: AnonIncludeDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeDeclaration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

