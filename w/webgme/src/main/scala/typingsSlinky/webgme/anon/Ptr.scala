package typingsSlinky.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ptr extends js.Object {
  var ptr: MetaCardRulemin1max1 = js.native
  var set: MetaCardRuleminnumbermaxn = js.native
}

object Ptr {
  @scala.inline
  def apply(ptr: MetaCardRulemin1max1, set: MetaCardRuleminnumbermaxn): Ptr = {
    val __obj = js.Dynamic.literal(ptr = ptr.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ptr]
  }
  @scala.inline
  implicit class PtrOps[Self <: Ptr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPtr(value: MetaCardRulemin1max1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ptr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: MetaCardRuleminnumbermaxn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

