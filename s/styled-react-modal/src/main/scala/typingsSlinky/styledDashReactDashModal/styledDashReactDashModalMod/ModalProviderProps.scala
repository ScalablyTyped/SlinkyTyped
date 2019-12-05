package typingsSlinky.styledDashReactDashModal.styledDashReactDashModalMod

import slinky.core.TagMod
import typingsSlinky.styledDashComponents.styledDashComponentsMod.AnyStyledComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProviderProps extends js.Object {
  var backgroundComponent: js.UndefOr[AnyStyledComponent] = js.undefined
  var children: TagMod[Any]
}

object ModalProviderProps {
  @scala.inline
  def apply(children: TagMod[Any], backgroundComponent: AnyStyledComponent = null): ModalProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (backgroundComponent != null) __obj.updateDynamic("backgroundComponent")(backgroundComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProviderProps]
  }
}

