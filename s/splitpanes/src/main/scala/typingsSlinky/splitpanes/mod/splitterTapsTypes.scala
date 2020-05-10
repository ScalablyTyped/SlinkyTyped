package typingsSlinky.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait splitterTapsTypes extends js.Object {
  var splitter: Null | Double = js.native
  var timeoutId: Null | js.Object = js.native
}

object splitterTapsTypes {
  @scala.inline
  def apply(): splitterTapsTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[splitterTapsTypes]
  }
  @scala.inline
  implicit class splitterTapsTypesOps[Self <: splitterTapsTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSplitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitter")(null)
        ret
    }
    @scala.inline
    def withTimeoutId(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutId")(null)
        ret
    }
  }
  
}

