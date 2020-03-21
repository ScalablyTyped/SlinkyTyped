package typingsSlinky.themeUi.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.themeUi.mod.ColorModeCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColorMode
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, ColorModeCls] {
  @JSImport("theme-ui", "ColorMode")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

