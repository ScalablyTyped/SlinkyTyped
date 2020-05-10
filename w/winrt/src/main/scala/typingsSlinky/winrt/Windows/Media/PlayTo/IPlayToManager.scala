package typingsSlinky.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToManager extends js.Object {
  var defaultSourceSelection: Boolean = js.native
  var onsourcerequested: js.Any = js.native
  var onsourceselected: js.Any = js.native
}

object IPlayToManager {
  @scala.inline
  def apply(defaultSourceSelection: Boolean, onsourcerequested: js.Any, onsourceselected: js.Any): IPlayToManager = {
    val __obj = js.Dynamic.literal(defaultSourceSelection = defaultSourceSelection.asInstanceOf[js.Any], onsourcerequested = onsourcerequested.asInstanceOf[js.Any], onsourceselected = onsourceselected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToManager]
  }
  @scala.inline
  implicit class IPlayToManagerOps[Self <: IPlayToManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSourceSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSourceSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsourcerequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsourcerequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsourceselected(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsourceselected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

