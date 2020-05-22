package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressComponents.mod.QueryControls.^
import typingsSlinky.wordpressComponents.queryControlsMod.QueryControls.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.wordpressComponents.queryControlsMod.QueryControls.Props because: IArray(Not a trait), IArray(Not a trait), IArray(Not a trait) */
object QueryControls {
  @JSImport("@wordpress/components", "QueryControls")
  @js.native
  object component extends js.Object
  
  def apply(p: Props): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: QueryControls.type): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, js.Dictionary.empty))()
}

