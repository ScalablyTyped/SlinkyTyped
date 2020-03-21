package typingsSlinky.themeUi.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.themeUiComponents.mod.AlertProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Support for combinations of intersection and union types not implemented */
object Alert
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("theme-ui", "Alert")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = PropsWithoutRef[AlertProps] with RefAttributes[HTMLDivElement]
}

