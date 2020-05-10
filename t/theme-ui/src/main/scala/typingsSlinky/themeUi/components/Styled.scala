package typingsSlinky.themeUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.themeUi.AnonAs
import typingsSlinky.themeUi.mod.SxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (/ * import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements['div'] * / js.Any) with typingsSlinky.themeUi.mod.SxProps with typingsSlinky.themeUi.AnonAs because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements['div'] * / js.Any because couldn't resolve ClassTree.) */
object Styled {
  @JSImport("theme-ui", "Styled")
  @js.native
  object component extends js.Object
  
  def apply(
    p: (/* import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements['div'] */ js.Any) with SxProps with AnonAs
  ): Default[tag.type, typingsSlinky.themeUi.mod.Styled] = new Default[tag.type, typingsSlinky.themeUi.mod.Styled](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Styled.type): Default[tag.type, typingsSlinky.themeUi.mod.Styled] = new Default[tag.type, typingsSlinky.themeUi.mod.Styled](js.Array(this.component, js.Dictionary.empty))()
}

