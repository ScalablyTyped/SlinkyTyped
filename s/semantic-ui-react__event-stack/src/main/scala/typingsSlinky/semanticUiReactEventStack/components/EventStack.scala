package typingsSlinky.semanticUiReactEventStack.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.semanticUiReactEventStack.mod.default
import typingsSlinky.semanticUiReactEventStack.typesEventStackMod.EventStackProps
import typingsSlinky.semanticUiReactEventStack.typesMod.InputEventListener
import typingsSlinky.semanticUiReactEventStack.typesMod.InputTargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EventStack
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@semantic-ui-react/event-stack", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    name: String,
    on: InputEventListener,
    pool: String = null,
    target: InputTargetElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = EventStackProps
}

