package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsButtonButtonMod.ButtonProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesModalModalActionsMod.ModalActionsProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesModalModalActionsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ModalActions
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/ModalActions", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    actions: SemanticShorthandCollection[ButtonProps] = null,
    as: js.Any = null,
    content: SemanticShorthandContent = null,
    onActionClick: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ButtonProps) => Unit = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction2(onActionClick))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ModalActionsProps
}

