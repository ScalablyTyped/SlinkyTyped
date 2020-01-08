package typingsSlinky.atThemeDashUiComponents.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsMod.RadioProps
import typingsSlinky.react.reactMod.PropsWithoutRef
import typingsSlinky.react.reactMod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Radio
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@theme-ui/components", "Radio")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = PropsWithoutRef[RadioProps] with RefAttributes[HTMLInputElement]
}

