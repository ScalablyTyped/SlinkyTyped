package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleDescriptor extends js.Object {
  var LeftTokenRange: TokenRange = js.native
  var RightTokenRange: TokenRange = js.native
}

object RuleDescriptor {
  @scala.inline
  def apply(LeftTokenRange: TokenRange, RightTokenRange: TokenRange): RuleDescriptor = {
    val __obj = js.Dynamic.literal(LeftTokenRange = LeftTokenRange.asInstanceOf[js.Any], RightTokenRange = RightTokenRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleDescriptor]
  }
  @scala.inline
  implicit class RuleDescriptorOps[Self <: RuleDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftTokenRange(value: TokenRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftTokenRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightTokenRange(value: TokenRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightTokenRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

