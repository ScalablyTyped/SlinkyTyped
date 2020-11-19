package typingsSlinky.wordpressElement.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from java.lang.String because couldn't resolve ClassTree. */
object CreateInterpolateElement {
  
  @JSImport("@wordpress/element/build-types/create-interpolate-element", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: String): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CreateInterpolateElement.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
