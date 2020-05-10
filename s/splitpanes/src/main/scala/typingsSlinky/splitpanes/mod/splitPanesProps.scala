package typingsSlinky.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait splitPanesProps extends js.Object {
   // 支持添加 true
  var dblClickSplitter: Boolean = js.native
   // 是否监控插槽 false
  var horizontal: Boolean = js.native
   // 是否水平 false
  var pushOtherPanes: Boolean = js.native
  var watchSlots: Boolean = js.native
}

object splitPanesProps {
  @scala.inline
  def apply(dblClickSplitter: Boolean, horizontal: Boolean, pushOtherPanes: Boolean, watchSlots: Boolean): splitPanesProps = {
    val __obj = js.Dynamic.literal(dblClickSplitter = dblClickSplitter.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], pushOtherPanes = pushOtherPanes.asInstanceOf[js.Any], watchSlots = watchSlots.asInstanceOf[js.Any])
    __obj.asInstanceOf[splitPanesProps]
  }
  @scala.inline
  implicit class splitPanesPropsOps[Self <: splitPanesProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDblClickSplitter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickSplitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushOtherPanes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushOtherPanes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchSlots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchSlots")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

