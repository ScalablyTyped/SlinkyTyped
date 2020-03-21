package typingsSlinky.stormReactDiagrams.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.stormReactDiagrams.baseActionMod.BaseAction
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.diagramWidgetMod.DiagramProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DiagramWidget
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.stormReactDiagrams.mod.DiagramWidget] {
  @JSImport("storm-react-diagrams", "DiagramWidget")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    diagramEngine: DiagramEngine,
    actionStartedFiring: /* action */ BaseAction => Boolean = null,
    actionStillFiring: /* action */ BaseAction => Unit = null,
    actionStoppedFiring: /* action */ BaseAction => Unit = null,
    allowCanvasTranslation: js.UndefOr[Boolean] = js.undefined,
    allowCanvasZoom: js.UndefOr[Boolean] = js.undefined,
    allowLooseLinks: js.UndefOr[Boolean] = js.undefined,
    baseClass: String = null,
    deleteKeys: js.Array[Double] = null,
    extraProps: js.Any = null,
    inverseZoom: js.UndefOr[Boolean] = js.undefined,
    maxNumberPointsPerLink: Int | Double = null,
    smartRouting: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.stormReactDiagrams.mod.DiagramWidget] = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
    if (actionStartedFiring != null) __obj.updateDynamic("actionStartedFiring")(js.Any.fromFunction1(actionStartedFiring))
    if (actionStillFiring != null) __obj.updateDynamic("actionStillFiring")(js.Any.fromFunction1(actionStillFiring))
    if (actionStoppedFiring != null) __obj.updateDynamic("actionStoppedFiring")(js.Any.fromFunction1(actionStoppedFiring))
    if (!js.isUndefined(allowCanvasTranslation)) __obj.updateDynamic("allowCanvasTranslation")(allowCanvasTranslation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCanvasZoom)) __obj.updateDynamic("allowCanvasZoom")(allowCanvasZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(allowLooseLinks)) __obj.updateDynamic("allowLooseLinks")(allowLooseLinks.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (deleteKeys != null) __obj.updateDynamic("deleteKeys")(deleteKeys.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (!js.isUndefined(inverseZoom)) __obj.updateDynamic("inverseZoom")(inverseZoom.asInstanceOf[js.Any])
    if (maxNumberPointsPerLink != null) __obj.updateDynamic("maxNumberPointsPerLink")(maxNumberPointsPerLink.asInstanceOf[js.Any])
    if (!js.isUndefined(smartRouting)) __obj.updateDynamic("smartRouting")(smartRouting.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DiagramProps
}

