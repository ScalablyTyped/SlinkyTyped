package typingsSlinky.storybookComponents.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.storybookComponents.iframeMod.IFrameProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IFrame
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.storybookComponents.mod.IFrame] {
  @JSImport("@storybook/components", "IFrame")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    allowFullScreen: Boolean,
    id: String,
    scale: Double,
    src: String,
    title: String,
    style: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.storybookComponents.mod.IFrame] = {
    val __obj = js.Dynamic.literal(allowFullScreen = allowFullScreen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IFrameProps
}

