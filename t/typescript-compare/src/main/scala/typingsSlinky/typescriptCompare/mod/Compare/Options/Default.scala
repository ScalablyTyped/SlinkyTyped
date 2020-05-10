package typingsSlinky.typescriptCompare.mod.Compare.Options

import typingsSlinky.typescriptCompare.typescriptCompareStrings.broaderLeft
import typingsSlinky.typescriptCompare.typescriptCompareStrings.broaderRight
import typingsSlinky.typescriptCompare.typescriptCompareStrings.equal
import typingsSlinky.typescriptCompare.typescriptCompareStrings.mismatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Default
  extends typingsSlinky.typescriptCompare.mod.Compare.Options {
  @JSName("broaderLeft")
  var broaderLeft_Default: broaderLeft = js.native
  @JSName("broaderRight")
  var broaderRight_Default: broaderRight = js.native
  @JSName("equal")
  var equal_Default: equal = js.native
  @JSName("mismatch")
  var mismatch_Default: mismatch = js.native
}

object Default {
  @scala.inline
  def apply(broaderLeft: broaderLeft, broaderRight: broaderRight, equal: equal, mismatch: mismatch): Default = {
    val __obj = js.Dynamic.literal(broaderLeft = broaderLeft.asInstanceOf[js.Any], broaderRight = broaderRight.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], mismatch = mismatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  @scala.inline
  implicit class DefaultOps[Self <: Default] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroaderLeft(value: broaderLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broaderLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBroaderRight(value: broaderRight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broaderRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEqual(value: equal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMismatch(value: mismatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mismatch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

