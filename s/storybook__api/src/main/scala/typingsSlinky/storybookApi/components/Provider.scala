package typingsSlinky.storybookApi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.storybookApi.mod.Provider] {
  @JSImport("@storybook/api", "Provider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    docsMode: Boolean,
    provider: typingsSlinky.storybookApi.initProviderApiMod.Provider,
    location: WindowLocation = null,
    navigate: NavigateFn = null,
    path: String = null,
    storyId: String = null,
    uri: String = null,
    viewMode: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.storybookApi.mod.Provider] = {
    val __obj = js.Dynamic.literal(docsMode = docsMode.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(navigate.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.storybookApi.mod.Props
}

