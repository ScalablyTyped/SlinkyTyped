package typingsSlinky.uifabricUtilities.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Could't extract props from TypeRef(QualifiedName(IArray(Name(TProps))),IArray(),NoComments) because couldn't resolve ClassTree. */
object BaseComponent
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.uifabricUtilities.mod.BaseComponent[js.Any, js.Any]] {
  @JSImport("@uifabric/utilities", "BaseComponent")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

