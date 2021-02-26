package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.PickPropsWithChildrenClas
import typingsSlinky.storybookUi.menuMod.MenuButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.storybookUi.anon.PickPropsWithChildrenClas with (typingsSlinky.emotionStyledBase.helperMod.Omit[
typingsSlinky.storybookUi.menuMod.MenuButtonProps, 
typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme]) with typingsSlinky.emotionStyledBase.anon.`0`[typingsSlinky.storybookTheming.typesMod.Theme] because: IArray(Couldn't find props for typingsSlinky.storybookUi.menuMod.MenuButtonProps because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.)) */
object MenuButton {
  
  def apply(p: PickPropsWithChildrenClas with (Omit[MenuButtonProps, theme]) with `0`[Theme]): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu", "MenuButton")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MenuButton.type): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
