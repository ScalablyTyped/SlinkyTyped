package typingsSlinky.themeUiComponents.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.themeUiComponents.mod.CloseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.react.mod.PropsWithoutRef[typingsSlinky.themeUiComponents.mod.CloseProps] with typingsSlinky.react.mod.RefAttributes[typingsSlinky.std.HTMLButtonElement] because: IArray(Couldn't find props for typingsSlinky.themeUiComponents.mod.CloseProps | (/ * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T[P]}
  * / typingsSlinky.std.stdStrings.Pick with typingsSlinky.themeUiComponents.mod.CloseProps) because: IArray(Couldn't find props for typingsSlinky.themeUiComponents.mod.IconButtonProps because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.))) */
object Close {
  @JSImport("@theme-ui/components", "Close")
  @js.native
  object component extends js.Object
  
  def apply(p: PropsWithoutRef[CloseProps] with RefAttributes[HTMLButtonElement]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Close.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

