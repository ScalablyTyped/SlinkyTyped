package typingsSlinky.welldoneSoftwareWhyDidYouRender.WhyDidYouRender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookDifference extends js.Object {
  var diffType: String = js.native
  var nextValue: js.Any = js.native
  var pathString: String = js.native
  var prevValue: js.Any = js.native
}

object HookDifference {
  @scala.inline
  def apply(diffType: String, nextValue: js.Any, pathString: String, prevValue: js.Any): HookDifference = {
    val __obj = js.Dynamic.literal(diffType = diffType.asInstanceOf[js.Any], nextValue = nextValue.asInstanceOf[js.Any], pathString = pathString.asInstanceOf[js.Any], prevValue = prevValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookDifference]
  }
  @scala.inline
  implicit class HookDifferenceOps[Self <: HookDifference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiffType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

