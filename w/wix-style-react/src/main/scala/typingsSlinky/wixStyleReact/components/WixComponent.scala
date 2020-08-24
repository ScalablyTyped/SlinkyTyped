package typingsSlinky.wixStyleReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from T because couldn't resolve ClassTree. */
object WixComponent {
  @JSImport("wix-style-react", "WixComponent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.wixStyleReact.baseComponentsMod.WixComponentProps */ T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.wixStyleReact.mod.WixComponent[T]]
  
  def apply[/* <: typingsSlinky.wixStyleReact.baseComponentsMod.WixComponentProps */ T](p: T): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.wixStyleReact.baseComponentsMod.WixComponentProps */ T](companion: WixComponent.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

