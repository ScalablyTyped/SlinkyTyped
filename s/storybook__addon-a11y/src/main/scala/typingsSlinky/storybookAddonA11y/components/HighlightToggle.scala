package typingsSlinky.storybookAddonA11y.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import typingsSlinky.storybookAddonA11y.anon.TypeofHighlightToggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree., Couldn't find props for typingsSlinky.std.stdStrings.Pick with ((typingsSlinky.std.stdStrings.Pick with js.Any with typingsSlinky.propTypes.propTypesStrings.InferPropsInner with typingsSlinky.std.stdStrings.Partial) | js.Any | (typingsSlinky.propTypes.propTypesStrings.InferPropsInner with typingsSlinky.std.stdStrings.Pick with js.Any with typingsSlinky.std.stdStrings.Partial)) with typingsSlinky.std.stdStrings.Partial with js.Any because: IArray(Couldn't find props for typingsSlinky.std.stdStrings.Pick with js.Any with typingsSlinky.propTypes.propTypesStrings.InferPropsInner with typingsSlinky.std.stdStrings.Partial because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.), Could't extract props from js.Any because couldn't resolve ClassTree., Couldn't find props for typingsSlinky.propTypes.propTypesStrings.InferPropsInner with typingsSlinky.std.stdStrings.Pick with js.Any with typingsSlinky.std.stdStrings.Partial because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.)), IArray(Could't extract props from js.Any because couldn't resolve ClassTree.), Couldn't find props for typingsSlinky.std.stdStrings.Pick with js.Any with typingsSlinky.propTypes.propTypesStrings.InferPropsInner with typingsSlinky.std.stdStrings.Partial because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.), Couldn't find props for typingsSlinky.propTypes.propTypesStrings.InferPropsInner with typingsSlinky.std.stdStrings.Pick with js.Any with typingsSlinky.std.stdStrings.Partial because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.) */
object HighlightToggle {
  
  @JSImport("@storybook/addon-a11y/dist/components/Report/HighlightToggle", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: LibraryManagedAttributes[TypeofHighlightToggle, js.Any]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: HighlightToggle.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
