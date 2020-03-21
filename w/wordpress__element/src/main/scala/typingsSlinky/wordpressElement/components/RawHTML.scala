package typingsSlinky.wordpressElement.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.wordpressElement.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(wordpressElement), Name(AnonChildren))),IArray(),NoComments), TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1))),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)) because couldn't resolve ClassTree. */
object RawHTML
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSGlobal("React.RawHTML")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = AnonChildren with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HTMLProps<HTMLDivElement> */ js.Any)
}

