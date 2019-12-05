package typingsSlinky.stormDashReactDashDiagrams.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.stormDashReactDashDiagrams.distSrcDefaultsModelsDefaultNodeModelMod.DefaultNodeModel
import typingsSlinky.stormDashReactDashDiagrams.distSrcDefaultsWidgetsDefaultNodeWidgetMod.DefaultNodeProps
import typingsSlinky.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultNodeWidget
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.stormDashReactDashDiagrams.stormDashReactDashDiagramsMod.DefaultNodeWidget
    ] {
  @JSImport("storm-react-diagrams", "DefaultNodeWidget")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    diagramEngine: DiagramEngine,
    node: DefaultNodeModel,
    baseClass: String = null,
    extraProps: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.stormDashReactDashDiagrams.stormDashReactDashDiagramsMod.DefaultNodeWidget
  ] = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DefaultNodeProps
}

