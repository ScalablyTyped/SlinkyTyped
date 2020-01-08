package typingsSlinky.atStorybookAddonDashNotes.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SyntaxHighlighter
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/addon-notes/dist/Panel", "SyntaxHighlighter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

