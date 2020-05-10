package typingsSlinky.styledComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForwardedAs[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] extends js.Object {
  var as: js.UndefOr[C] = js.native
  var forwardedAs: js.UndefOr[C] = js.native
}

object AnonForwardedAs {
  @scala.inline
  def apply[C](): AnonForwardedAs[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonForwardedAs[C]]
  }
  @scala.inline
  implicit class AnonForwardedAsOps[Self[c] <: AnonForwardedAs[c], C] (val x: Self[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[C] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[C] with Other]
    @scala.inline
    def withAs(value: C): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardedAs(value: C): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardedAs: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedAs")(js.undefined)
        ret
    }
  }
  
}

