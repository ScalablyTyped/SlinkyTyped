package typingsSlinky.typescriptServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowAutomaticSemicolonInsertion extends js.Object {
  var allowAutomaticSemicolonInsertion: Boolean = js.native
}

object AnonAllowAutomaticSemicolonInsertion {
  @scala.inline
  def apply(allowAutomaticSemicolonInsertion: Boolean): AnonAllowAutomaticSemicolonInsertion = {
    val __obj = js.Dynamic.literal(allowAutomaticSemicolonInsertion = allowAutomaticSemicolonInsertion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowAutomaticSemicolonInsertion]
  }
  @scala.inline
  implicit class AnonAllowAutomaticSemicolonInsertionOps[Self <: AnonAllowAutomaticSemicolonInsertion] (val x: Self) extends AnyVal {
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

