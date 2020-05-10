package typingsSlinky.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUiViewContextAnchor extends js.Object {
  var uiViewContextAnchor: String = js.native
  var uiViewName: String = js.native
}

object AnonUiViewContextAnchor {
  @scala.inline
  def apply(uiViewContextAnchor: String, uiViewName: String): AnonUiViewContextAnchor = {
    val __obj = js.Dynamic.literal(uiViewContextAnchor = uiViewContextAnchor.asInstanceOf[js.Any], uiViewName = uiViewName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUiViewContextAnchor]
  }
  @scala.inline
  implicit class AnonUiViewContextAnchorOps[Self <: AnonUiViewContextAnchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUiViewContextAnchor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiViewContextAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUiViewName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiViewName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

