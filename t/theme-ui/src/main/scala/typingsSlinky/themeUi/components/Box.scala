package typingsSlinky.themeUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.emotionStyledBase.anon.ThemeTheme
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.themeUi.themeUiStrings.div
import typingsSlinky.themeUiComponents.mod.BoxOwnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.react.mod.ComponentProps[typingsSlinky.themeUi.themeUiStrings.div] with typingsSlinky.themeUiComponents.mod.BoxOwnProps with typingsSlinky.emotionStyledBase.anon.ThemeTheme[js.Object] because: IArray(Not a trait, Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object Box {
  @JSImport("theme-ui", "Box")
  @js.native
  object component extends js.Object
  
  def apply(p: ComponentProps[div] with BoxOwnProps with ThemeTheme[js.Object]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Box.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

