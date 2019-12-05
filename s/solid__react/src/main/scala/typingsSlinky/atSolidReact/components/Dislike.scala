package typingsSlinky.atSolidReact.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atSolidReact.atSolidReactMod.ActivityButtonProps
import typingsSlinky.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Dislike
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atSolidReact.atSolidReactMod.Dislike] {
  @JSImport("@solid/react", "Dislike")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ActivityButtonProps with HTMLAttributes[HTMLButtonElement]
}

