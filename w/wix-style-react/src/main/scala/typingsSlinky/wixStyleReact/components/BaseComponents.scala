package typingsSlinky.wixStyleReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wixStyleReact.baseComponentsMod.WixComponentProps
import typingsSlinky.wixStyleReact.baseComponentsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from T because couldn't resolve ClassTree. */
object BaseComponents {
  
  @JSImport("wix-style-react/BaseComponents", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T /* <: WixComponentProps */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[T]]
  
  def apply[T /* <: WixComponentProps */](p: T): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[T /* <: WixComponentProps */](companion: BaseComponents.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}
