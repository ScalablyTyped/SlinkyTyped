package typingsSlinky.scrivito.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Not a trait */
object ChildListTag {
  
  @JSImport("scrivito", "ChildListTag")
  @js.native
  object component extends js.Object
  
  def apply(p: typingsSlinky.scrivito.mod.ChildListTag): Default[tag.type, typingsSlinky.scrivito.mod.ChildListTag] = new Default[tag.type, typingsSlinky.scrivito.mod.ChildListTag](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ChildListTag.type): Default[tag.type, typingsSlinky.scrivito.mod.ChildListTag] = new Default[tag.type, typingsSlinky.scrivito.mod.ChildListTag](js.Array(this.component, js.Dictionary.empty))()
}
