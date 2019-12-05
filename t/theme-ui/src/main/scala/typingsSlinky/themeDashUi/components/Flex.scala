package typingsSlinky.themeDashUi.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.themeDashUi.Anon_As
import typingsSlinky.themeDashUi.themeDashUiMod.SxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Flex
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.themeDashUi.themeDashUiMod.Flex] {
  @JSImport("theme-ui", "Flex")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = (/* import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements['div'] */ js.Any) with SxProps with Anon_As
}

