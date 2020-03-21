package typingsSlinky.storybookApi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.storybookApi.mod.Combo
import typingsSlinky.storybookApi.mod.ConsumerProps
import typingsSlinky.storybookApi.mod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Consumer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.storybookApi.mod.Consumer] {
  @JSImport("@storybook/api", "Consumer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    filter: Combo => SubState = null,
    pure: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.storybookApi.mod.Consumer] = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.storybookApi.mod.Consumer] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.storybookApi.mod.Consumer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ConsumerProps[SubState, Combo]
}

