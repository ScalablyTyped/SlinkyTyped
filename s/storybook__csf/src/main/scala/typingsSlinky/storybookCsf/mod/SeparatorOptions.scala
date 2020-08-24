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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupSeparatorRegExp(value: js.RegExp): Self = this.set("groupSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupSeparator(value: String | js.RegExp): Self = this.set("groupSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootSeparatorRegExp(value: js.RegExp): Self = this.set("rootSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootSeparator(value: String | js.RegExp): Self = this.set("rootSeparator", value.asInstanceOf[js.Any])
  }
  
}

