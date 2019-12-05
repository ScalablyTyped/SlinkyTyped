package typingsSlinky.atStorybookComponents.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookComponents.atStorybookComponentsStrings.critical
import typingsSlinky.atStorybookComponents.atStorybookComponentsStrings.negative
import typingsSlinky.atStorybookComponents.atStorybookComponentsStrings.neutral
import typingsSlinky.atStorybookComponents.atStorybookComponentsStrings.positive
import typingsSlinky.atStorybookComponents.atStorybookComponentsStrings.warning
import typingsSlinky.atStorybookComponents.distBadgeBadgeMod.BadgeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Badge
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/components/dist/Badge/Badge", "Badge")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    status: positive | negative | neutral | warning | critical,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BadgeProps
}

