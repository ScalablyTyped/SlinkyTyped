package typingsSlinky.themeUiComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.themeUiComponents.mod.FieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.themeUiComponents.mod.FieldProps[T] because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object Field {
  
  def apply[T /* <: ReactElement */](p: FieldProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@theme-ui/components", "Field")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T /* <: ReactElement */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  implicit def make[T /* <: ReactElement */](companion: Field.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}
