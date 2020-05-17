package typingsSlinky.typescriptServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowAutomaticSemicolonInsertion extends js.Object {
  var allowAutomaticSemicolonInsertion: Boolean = js.native
}

object AllowAutomaticSemicolonInsertion {
  @scala.inline
  def apply(allowAutomaticSemicolonInsertion: Boolean): AllowAutomaticSemicolonInsertion = {
    val __obj = js.Dynamic.literal(allowAutomaticSemicolonInsertion = allowAutomaticSemicolonInsertion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowAutomaticSemicolonInsertion]
  }
  @scala.inline
  implicit class AllowAutomaticSemicolonInsertionOps[Self <: AllowAutomaticSemicolonInsertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAutomaticSemicolonInsertion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutomaticSemicolonInsertion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

