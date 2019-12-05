package typingsSlinky.atStorybookAddonDashA11y.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookAddonDashA11y.distComponentsColorBlindnessMod.ColorBlindnessProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColorBlindness
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atStorybookAddonDashA11y.distComponentsColorBlindnessMod.ColorBlindness
    ] {
  @JSImport("@storybook/addon-a11y/dist/components/ColorBlindness", "ColorBlindness")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(_overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.atStorybookAddonDashA11y.distComponentsColorBlindnessMod.ColorBlindness
  ] = {
    val __obj = js.Dynamic.literal()
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ColorBlindnessProps
}

