package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.selectControlMod.SelectControl.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object SelectControl {
  @JSImport("@wordpress/components", "SelectControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: java.lang.String | js.Array[java.lang.String] */ T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def apply[/* <: java.lang.String | js.Array[java.lang.String] */ T](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: java.lang.String | js.Array[java.lang.String] */ T](companion: SelectControl.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

