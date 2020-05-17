package typingsSlinky.styledComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait As extends js.Object {
  /**
    * Typing Note: prefer using .withComponent for now as it is actually type-safe.
    *
    * String types need to be cast to themselves to become literal types (as={'a' as 'a'}).
    */
  var as: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any
  ] = js.native
  var forwardedAs: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any
  ] = js.native
}

object As {
  @scala.inline
  def apply(): As = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As]
  }
  @scala.inline
  implicit class AsOps[Self <: As] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAs(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardedAs(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardedAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedAs")(js.undefined)
        ret
    }
  }
  
}

