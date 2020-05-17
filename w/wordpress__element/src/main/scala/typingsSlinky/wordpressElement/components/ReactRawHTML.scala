package typingsSlinky.wordpressElement.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressElement.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.wordpressElement.anon.Children with (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HTMLProps<HTMLDivElement> * / js.Any) because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HTMLProps<HTMLDivElement> * / js.Any because couldn't resolve ClassTree.) */
object ReactRawHTML {
  @JSGlobal("React.RawHTML")
  @js.native
  object component extends js.Object
  
  def apply(
    p: Children with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HTMLProps<HTMLDivElement> */ js.Any)
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactRawHTML.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

