package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.badgeMod.BadgeProps
import typingsSlinky.storybookComponents.storybookComponentsStrings.critical
import typingsSlinky.storybookComponents.storybookComponentsStrings.negative
import typingsSlinky.storybookComponents.storybookComponentsStrings.neutral
import typingsSlinky.storybookComponents.storybookComponentsStrings.positive
import typingsSlinky.storybookComponents.storybookComponentsStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Badge {
  
  @scala.inline
  def apply(status: positive | negative | neutral | warning | critical): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[BadgeProps]))
  }
  
  @JSImport("@storybook/components", "Badge")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BadgeProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
