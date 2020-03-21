package typingsSlinky.themeUi.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.themeUi.AnonAs
import typingsSlinky.themeUi.mod.SxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(themeUi), Name(mod), Name(SxProps))),IArray(),NoComments), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(themeUi), Name(AnonAs))),IArray(),NoComments)),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)) because couldn't resolve ClassTree. */
object Styled
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.themeUi.mod.Styled] {
  @JSImport("theme-ui", "Styled")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = (/* import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements['div'] */ js.Any) with SxProps with AnonAs
}

