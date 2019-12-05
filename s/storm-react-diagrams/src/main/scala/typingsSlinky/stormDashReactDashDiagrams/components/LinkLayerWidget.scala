package typingsSlinky.stormDashReactDashDiagrams.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsPointModelMod.PointModel
import typingsSlinky.stormDashReactDashDiagrams.distSrcWidgetsLayersLinkLayerWidgetMod.LinkLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinkLayerWidget
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.stormDashReactDashDiagrams.stormDashReactDashDiagramsMod.LinkLayerWidget
    ] {
  @JSImport("storm-react-diagrams", "LinkLayerWidget")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    diagramEngine: DiagramEngine,
    pointAdded: (PointModel, MouseEvent) => js.Any,
    baseClass: String = null,
    extraProps: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.stormDashReactDashDiagrams.stormDashReactDashDiagramsMod.LinkLayerWidget
  ] = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], pointAdded = js.Any.fromFunction2(pointAdded))
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LinkLayerProps
}

