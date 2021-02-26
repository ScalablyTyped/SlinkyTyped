package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.selectControlMod.SelectControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object SelectControl {
  
  def apply[T /* <: String | js.Array[String] */](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@wordpress/components", "SelectControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T /* <: String | js.Array[String] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  implicit def make[T /* <: String | js.Array[String] */](companion: SelectControl.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}
