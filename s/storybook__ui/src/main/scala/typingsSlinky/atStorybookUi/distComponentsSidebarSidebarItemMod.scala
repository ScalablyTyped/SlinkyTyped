package typingsSlinky.atStorybookUi

import slinky.core.ReactComponentClass
import typingsSlinky.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typingsSlinky.atStorybookComponents.distIconIconMod.IconsProps
import typingsSlinky.atStorybookTheming.distTypesMod.Theme
import typingsSlinky.atStorybookUi.atStorybookUiStrings.span
import typingsSlinky.react.reactMod.ComponentProps
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarItem", JSImport.Namespace)
@js.native
object distComponentsSidebarSidebarItemMod extends js.Object {
  val Item: StyledComponent[js.Any, (Pick[_, String | Double | js.Symbol]) with Anon_Theme, Theme] = js.native
  def default(hasNameIsComponentIsLeafIsExpandedIsSelectedProps: js.Any): Element = js.native
  type ExpanderProps = ComponentProps[span] with Anon_IsExpandable
  type IconProps = ComponentProps[ReactComponentClass[IconsProps]] with Anon_ClassName
}

