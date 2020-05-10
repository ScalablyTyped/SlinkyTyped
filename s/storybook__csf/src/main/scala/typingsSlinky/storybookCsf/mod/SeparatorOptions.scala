package typingsSlinky.storybookCsf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeparatorOptions extends js.Object {
  var groupSeparator: String | js.RegExp = js.native
  var rootSeparator: String | js.RegExp = js.native
}

object SeparatorOptions {
  @scala.inline
  def apply(groupSeparator: String | js.RegExp, rootSeparator: String | js.RegExp): SeparatorOptions = {
    val __obj = js.Dynamic.literal(groupSeparator = groupSeparator.asInstanceOf[js.Any], rootSeparator = rootSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparatorOptions]
  }
  @scala.inline
  implicit class SeparatorOptionsOps[Self <: SeparatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupSeparatorRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupSeparator(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootSeparatorRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootSeparator(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootSeparator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

