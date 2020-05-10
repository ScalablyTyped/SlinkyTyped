package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.iconGroupMod.IconGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Group {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Icon/Icon", "default.Group")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconGroupProps): SharedBuilder_IconGroupProps_1560966205 = new SharedBuilder_IconGroupProps_1560966205(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Group.type): SharedBuilder_IconGroupProps_1560966205 = new SharedBuilder_IconGroupProps_1560966205(js.Array(this.component, js.Dictionary.empty))()
}

