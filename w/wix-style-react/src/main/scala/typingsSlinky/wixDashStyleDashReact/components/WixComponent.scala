package typingsSlinky.wixDashStyleDashReact.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(T))) was not a @ScalaJSDefined trait */
object WixComponent
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.wixDashStyleDashReact.wixDashStyleDashReactMod.WixComponent[js.Any]
    ] {
  @JSImport("wix-style-react", "WixComponent")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

