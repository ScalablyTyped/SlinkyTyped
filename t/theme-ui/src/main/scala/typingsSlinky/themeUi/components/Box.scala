package typingsSlinky.themeUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.themeUi.themeUiStrings.div
import typingsSlinky.themeUiComponents.mod.BoxOwnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.react.mod.ComponentProps[typingsSlinky.themeUi.themeUiStrings.div] with (typingsSlinky.emotionStyledBase.helperMod.Omit[
typingsSlinky.themeUiComponents.mod.BoxOwnProps, 
typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme]) with typingsSlinky.emotionStyledBase.anon.`0`[js.Object] because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object Box {
  
  def apply(p: ComponentProps[div] with (Omit[BoxOwnProps, theme]) with `0`[js.Object]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("theme-ui", "Box")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Box.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
