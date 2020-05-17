package typingsSlinky.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Protected extends js.Object {
  var `protected`: Boolean = js.native
}

object Protected {
  @scala.inline
  def apply(`protected`: Boolean): Protected = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protected]
  }
  @scala.inline
  implicit class ProtectedOps[Self <: Protected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

