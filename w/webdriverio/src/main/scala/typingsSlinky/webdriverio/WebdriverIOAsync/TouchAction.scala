package typingsSlinky.webdriverio.WebdriverIOAsync

import typingsSlinky.webdriverio.TouchActionSync
import typingsSlinky.webdriverio.WebdriverIO.ActionTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchAction
  extends TouchActionSync
     with TouchActions {
  var element: js.UndefOr[Element] = js.native
}

object TouchAction {
  @scala.inline
  def apply(action: ActionTypes): TouchAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchAction]
  }
  @scala.inline
  implicit class TouchActionOps[Self <: TouchAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
  }
  
}

