package typingsSlinky.styledDashReactDashModal.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.styledDashComponents.styledDashComponentsMod.AnyStyledComponent
import typingsSlinky.styledDashReactDashModal.styledDashReactDashModalMod.ModalProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ModalProvider
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.styledDashReactDashModal.styledDashReactDashModalMod.ModalProvider
    ] {
  @JSImport("styled-react-modal", "ModalProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(backgroundComponent: AnyStyledComponent = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.styledDashReactDashModal.styledDashReactDashModalMod.ModalProvider
  ] = {
    val __obj = js.Dynamic.literal()
    if (backgroundComponent != null) __obj.updateDynamic("backgroundComponent")(backgroundComponent.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ModalProviderProps
}

