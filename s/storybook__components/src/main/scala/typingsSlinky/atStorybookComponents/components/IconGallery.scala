package typingsSlinky.atStorybookComponents.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IconGallery
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/components/dist/blocks", "IconGallery")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

