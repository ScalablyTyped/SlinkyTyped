package typingsSlinky.styledReactModal.mod

import slinky.core.TagMod
import typingsSlinky.styledComponents.styledComponentsMod.AnyStyledComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalProviderProps extends js.Object {
  var backgroundComponent: js.UndefOr[AnyStyledComponent] = js.native
  var children: TagMod[Any] = js.native
}

object ModalProviderProps {
  @scala.inline
  def apply(): ModalProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalProviderProps]
  }
  @scala.inline
  implicit class ModalProviderPropsOps[Self <: ModalProviderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundComponent(value: AnyStyledComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

