package typingsSlinky.themeUiComponents.components

import org.scalajs.dom.raw.HTMLSelectElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.themeUiComponents.mod.SelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.react.mod.PropsWithoutRef[typingsSlinky.themeUiComponents.mod.SelectProps] with typingsSlinky.react.mod.RefAttributes[typingsSlinky.std.HTMLSelectElement] because: IArray(Couldn't find props for / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T & U ]: P extends keyof T? T[P] : P extends keyof U? U[P] : never}
  * / typingsSlinky.themeUiComponents.themeUiComponentsStrings.Assign with js.Any because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.), Couldn't find props for / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T[P]}
  * / typingsSlinky.std.stdStrings.Pick with typingsSlinky.themeUiComponents.themeUiComponentsStrings.Assign with js.Any because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.)) */
object Select {
  
  def apply(p: PropsWithoutRef[SelectProps] with RefAttributes[HTMLSelectElement]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@theme-ui/components", "Select")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Select.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
