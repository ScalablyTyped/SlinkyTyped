package typingsSlinky.atSemanticDashUiDashReactEventDashStack.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.atSemanticDashUiDashReactEventDashStack.libTypesEventStackMod.EventStackProps
import typingsSlinky.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.InputEventListener
import typingsSlinky.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.InputTargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_EventStackProps_2044787998[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    name: String,
    on: InputEventListener,
    pool: String = null,
    target: InputTargetElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = EventStackProps
}

