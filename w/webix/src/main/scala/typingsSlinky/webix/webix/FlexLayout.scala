package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexLayout extends js.Object {
  @JSName("$getSize")
  var $getSize: js.Array[_] = js.native
  def render(): Unit = js.native
}

object FlexLayout {
  @scala.inline
  def apply($getSize: js.Array[_], render: () => Unit): FlexLayout = {
    val __obj = js.Dynamic.literal($getSize = $getSize.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[FlexLayout]
  }
  @scala.inline
  implicit class FlexLayoutOps[Self <: FlexLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$getSize(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$getSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

