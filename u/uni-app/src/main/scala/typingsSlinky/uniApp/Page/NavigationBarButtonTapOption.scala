package typingsSlinky.uniApp.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationBarButtonTapOption extends js.Object {
  /**
    * 原生标题栏按钮数组的下标
    */
  var index: String = js.native
}

object NavigationBarButtonTapOption {
  @scala.inline
  def apply(index: String): NavigationBarButtonTapOption = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarButtonTapOption]
  }
  @scala.inline
  implicit class NavigationBarButtonTapOptionOps[Self <: NavigationBarButtonTapOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

