package typingsSlinky.storybookAddonKnobs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.storybookAddonKnobs.PickAPIonoffemitgetQueryP
import typingsSlinky.storybookAddonKnobs.panelMod.KnobPanelProps
import typingsSlinky.storybookAddonKnobs.panelMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Panel
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@storybook/addon-knobs/dist/components/Panel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    active: Boolean,
    api: PickAPIonoffemitgetQueryP,
    onReset: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(onReset.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = KnobPanelProps
}

