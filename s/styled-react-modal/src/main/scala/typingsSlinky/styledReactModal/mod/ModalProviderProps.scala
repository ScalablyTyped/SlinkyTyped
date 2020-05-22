package typingsSlinky.styledReactModal.mod

import slinky.core.TagMod
import typingsSlinky.styledComponents.styledComponentsMod.AnyStyledComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProviderProps extends js.Object {
  var backgroundComponent: js.UndefOr[AnyStyledComponent] = js.undefined
  var children: TagMod[Any]
}

object ModalProviderProps {
  @scala.inline
  def apply(backgroundComponent: AnyStyledComponent = null, children: TagMod[Any] = null): ModalProviderProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundComponent != null) __obj.updateDynamic("backgroundComponent")(backgroundComponent.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProviderProps]
  }
}

