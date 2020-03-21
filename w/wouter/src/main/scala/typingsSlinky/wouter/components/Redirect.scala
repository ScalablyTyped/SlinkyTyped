package typingsSlinky.wouter.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.wouter.mod.RedirectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(wouter), Name(mod), Name(RedirectProps))),IArray(),NoComments) because: Not a trait */
object Redirect
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("wouter", "Redirect")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = RedirectProps
}

