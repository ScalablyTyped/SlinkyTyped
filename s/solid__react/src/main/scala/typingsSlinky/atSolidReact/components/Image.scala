package typingsSlinky.atSolidReact.components

import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atSolidReact.Anon_DefaultSrc
import typingsSlinky.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Image
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atSolidReact.atSolidReactMod.Image] {
  @JSImport("@solid/react", "Image")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = Anon_DefaultSrc with HTMLAttributes[HTMLImageElement]
}

