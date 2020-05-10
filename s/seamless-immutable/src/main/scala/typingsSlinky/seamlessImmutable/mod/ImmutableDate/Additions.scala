package typingsSlinky.seamlessImmutable.mod.ImmutableDate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** New functions added by seamless-immutable. */
@js.native
trait Additions extends js.Object {
  def asMutable(): js.Date = js.native
}

object Additions {
  @scala.inline
  def apply(asMutable: () => js.Date): Additions = {
    val __obj = js.Dynamic.literal(asMutable = js.Any.fromFunction0(asMutable))
    __obj.asInstanceOf[Additions]
  }
  @scala.inline
  implicit class AdditionsOps[Self <: Additions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsMutable(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asMutable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

