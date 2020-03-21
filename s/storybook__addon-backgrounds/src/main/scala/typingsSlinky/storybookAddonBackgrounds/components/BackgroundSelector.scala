package typingsSlinky.storybookAddonBackgrounds.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BackgroundSelector
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.storybookAddonBackgrounds.backgroundSelectorMod.BackgroundSelector
    ] {
  @JSImport("@storybook/addon-backgrounds/dist/containers/BackgroundSelector", "BackgroundSelector")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(api: API, _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.storybookAddonBackgrounds.backgroundSelectorMod.BackgroundSelector
  ] = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.storybookAddonBackgrounds.backgroundSelectorMod.Props
}

