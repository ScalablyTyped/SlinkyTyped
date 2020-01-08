package typingsSlinky.atThemeDashUiComponents.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsMod.FieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(atThemeDashUiComponents), Name(atThemeDashUiComponentsMod), Name(FieldProps))) was not a @ScalaJSDefined trait */
object Field
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@theme-ui/components", "Field")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = FieldProps[js.Any]
}

