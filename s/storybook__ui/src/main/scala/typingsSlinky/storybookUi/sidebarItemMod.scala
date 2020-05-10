package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.std.Pick
import typingsSlinky.storybookComponents.iconMod.IconsProps
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.storybookUiStrings.span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarItem", JSImport.Namespace)
@js.native
object sidebarItemMod extends js.Object {
  val Item: StyledComponent[js.Any, Pick[js.Any, String | Double | js.Symbol], Theme] = js.native
  def default(hasNameIsComponentIsLeafIsExpandedIsSelectedProps: js.Any): ReactElement = js.native
  type ExpanderProps = ComponentProps[span] with AnonIsExpandable
  type IconProps = ComponentProps[ReactComponentClass[IconsProps]] with AnonClassName
}

