package typingsSlinky.atStorybookComponents.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookComponents.distBrandStorybookLogoMod.StorybookLogoProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StorybookLogo
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/components", "StorybookLogo")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(alt: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StorybookLogoProps
}

