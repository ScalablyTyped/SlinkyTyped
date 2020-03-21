package typingsSlinky.stormReactDiagrams.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.stormReactDiagrams.defaultPortLabelWidgetMod.DefaultPortLabelProps
import typingsSlinky.stormReactDiagrams.defaultPortModelMod.DefaultPortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultPortLabel
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.stormReactDiagrams.mod.DefaultPortLabel] {
  @JSImport("storm-react-diagrams", "DefaultPortLabel")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    model: DefaultPortModel,
    baseClass: String = null,
    extraProps: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.stormReactDiagrams.mod.DefaultPortLabel] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DefaultPortLabelProps
}

