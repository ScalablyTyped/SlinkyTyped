package typingsSlinky.storybookAddonA11y.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod._Global_.JSX.LibraryManagedAttributes
import typingsSlinky.storybookAddonA11y.TypeofHighlightToggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Could't extract props from TypeRef(QualifiedName(IArray(Name(slinky), Name(core), Name(ReactComponentClass))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(react), Name(mod), Name(_Global_), Name(JSX), Name(LibraryManagedAttributes))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(storybookAddonA11y), Name(TypeofHighlightToggle))),IArray(),NoComments), TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),NoComments)),NoComments)),NoComments) because couldn't resolve ClassTree. */
object HighlightToggle
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/addon-a11y/dist/components/Report/HighlightToggle", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ReactComponentClass[LibraryManagedAttributes[TypeofHighlightToggle, js.Any]]
}

