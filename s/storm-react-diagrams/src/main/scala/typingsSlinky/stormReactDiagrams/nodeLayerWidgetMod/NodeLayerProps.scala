package typingsSlinky.stormReactDiagrams.nodeLayerWidgetMod

import typingsSlinky.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeLayerProps extends BaseWidgetProps {
  var diagramEngine: DiagramEngine
}

object NodeLayerProps {
  @scala.inline
  def apply(
    diagramEngine: DiagramEngine,
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null
  ): NodeLayerProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeLayerProps]
  }
}

