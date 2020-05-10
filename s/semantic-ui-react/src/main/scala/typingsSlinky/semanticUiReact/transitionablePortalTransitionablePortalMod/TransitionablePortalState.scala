package typingsSlinky.semanticUiReact.transitionablePortalTransitionablePortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionablePortalState extends js.Object {
  var portalOpen: Boolean = js.native
  var transitionVisible: Boolean = js.native
}

object TransitionablePortalState {
  @scala.inline
  def apply(portalOpen: Boolean, transitionVisible: Boolean): TransitionablePortalState = {
    val __obj = js.Dynamic.literal(portalOpen = portalOpen.asInstanceOf[js.Any], transitionVisible = transitionVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionablePortalState]
  }
  @scala.inline
  implicit class TransitionablePortalStateOps[Self <: TransitionablePortalState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPortalOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionVisible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

