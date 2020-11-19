package typingsSlinky.themeUi.components

import org.scalajs.dom.raw.HTMLImageElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.themeUiComponents.mod.AspectImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object AspectImage {
  
  @JSImport("theme-ui", "AspectImage")
  @js.native
  object component extends js.Object
  
  def apply(p: PropsWithoutRef[AspectImageProps] with RefAttributes[HTMLImageElement]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: AspectImage.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
