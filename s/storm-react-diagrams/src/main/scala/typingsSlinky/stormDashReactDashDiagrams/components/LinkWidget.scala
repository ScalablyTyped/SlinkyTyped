package typingsSlinky.stormDashReactDashDiagrams.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModel
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import typingsSlinky.stormDashReactDashDiagrams.distSrcWidgetsLinkWidgetMod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinkWidget
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.stormDashReactDashDiagrams.distSrcWidgetsLinkWidgetMod.LinkWidget
    ] {
  @JSImport("storm-react-diagrams/dist/src/widgets/LinkWidget", "LinkWidget")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    diagramEngine: DiagramEngine,
    link: LinkModel[LinkModelListener],
    baseClass: String = null,
    extraProps: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.stormDashReactDashDiagrams.distSrcWidgetsLinkWidgetMod.LinkWidget
  ] = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LinkProps
}

