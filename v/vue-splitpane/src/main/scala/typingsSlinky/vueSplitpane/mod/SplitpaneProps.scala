package typingsSlinky.vueSplitpane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitpaneProps extends js.Object {
   // = ['vertical', 'horizontal']
  var className: String = js.native
  var defaultPercent: Double = js.native
  var minPercent: Double = js.native
  var split: String = js.native
}

object SplitpaneProps {
  @scala.inline
  def apply(className: String, defaultPercent: Double, minPercent: Double, split: String): SplitpaneProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], defaultPercent = defaultPercent.asInstanceOf[js.Any], minPercent = minPercent.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitpaneProps]
  }
  @scala.inline
  implicit class SplitpanePropsOps[Self <: SplitpaneProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

