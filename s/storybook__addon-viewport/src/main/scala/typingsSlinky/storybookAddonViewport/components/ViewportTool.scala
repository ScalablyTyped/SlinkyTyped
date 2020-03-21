package typingsSlinky.storybookAddonViewport.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ViewportTool
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/addon-viewport/dist/Tool", "ViewportTool")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

