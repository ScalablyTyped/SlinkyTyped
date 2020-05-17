package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  var Descriptor: RuleDescriptor = js.native
  var Flag: RuleFlags = js.native
  var Operation: RuleOperation = js.native
}

object Rule {
  @scala.inline
  def apply(Descriptor: RuleDescriptor, Flag: RuleFlags, Operation: RuleOperation): Rule = {
    val __obj = js.Dynamic.literal(Descriptor = Descriptor.asInstanceOf[js.Any], Flag = Flag.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescriptor(value: RuleDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlag(value: RuleFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: RuleOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

