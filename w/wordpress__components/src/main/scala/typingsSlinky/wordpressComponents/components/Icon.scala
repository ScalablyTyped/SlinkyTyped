package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.iconMod.Icon.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.wordpressComponents.iconMod.Icon.Props[P] because: IArray(Not a trait) */
object Icon {
  @JSImport("@wordpress/components/icon", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def apply[P](p: Props[P]): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P](companion: Icon.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}

