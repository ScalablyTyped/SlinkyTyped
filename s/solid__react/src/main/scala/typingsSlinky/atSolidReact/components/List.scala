package typingsSlinky.atSolidReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atSolidReact.atSolidReactMod.LDflexValue
import typingsSlinky.atSolidReact.atSolidReactMod.ListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atSolidReact.atSolidReactMod.List] {
  @JSImport("@solid/react", "List")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    src: String,
    container: /* items */ typingsSlinky.react.reactMod._Global_.JSX.Element => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    filter: (/* item */ LDflexValue, /* index */ Double, /* array */ js.Array[LDflexValue]) => /* is @solid/react.@solid/react.LDflexValue */ Boolean = null,
    limit: Int | Double = null,
    offset: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atSolidReact.atSolidReactMod.List] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(js.Any.fromFunction1(container))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3(filter))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ListProps
}

