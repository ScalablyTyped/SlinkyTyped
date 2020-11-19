package typingsSlinky.wordpressElement.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Component {
  
  @JSImport("@wordpress/element", "Component")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P, S, SS] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.wordpressElement.mod.Component[P, S, SS]]
  
  def apply[P, S, SS](p: P): Builder[P, S, SS] = new Builder[P, S, SS](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[P, S, SS](companion: Component.type): Builder[P, S, SS] = new Builder[P, S, SS](js.Array(this.component, js.Dictionary.empty))()
}
