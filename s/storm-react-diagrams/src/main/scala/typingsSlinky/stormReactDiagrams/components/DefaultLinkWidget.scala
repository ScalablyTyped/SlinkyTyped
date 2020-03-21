package typingsSlinky.stormReactDiagrams.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.stormReactDiagrams.defaultLinkModelMod.DefaultLinkModel
import typingsSlinky.stormReactDiagrams.defaultLinkWidgetMod.DefaultLinkProps
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.pointModelMod.PointModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultLinkWidget
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.stormReactDiagrams.mod.DefaultLinkWidget] {
  @JSImport("storm-react-diagrams", "DefaultLinkWidget")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    diagramEngine: DiagramEngine,
    link: DefaultLinkModel,
    baseClass: String = null,
    color: String = null,
    extraProps: js.Any = null,
    pointAdded: (/* point */ PointModel, /* event */ MouseEvent) => _ = null,
    smooth: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.stormReactDiagrams.mod.DefaultLinkWidget] = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (pointAdded != null) __obj.updateDynamic("pointAdded")(js.Any.fromFunction2(pointAdded))
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DefaultLinkProps
}

