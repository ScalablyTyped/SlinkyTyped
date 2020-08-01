package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.labelGroupMod.LabelGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LabelGroup {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Label/LabelGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LabelGroupProps): SharedBuilder_LabelGroupProps1387370830 = new SharedBuilder_LabelGroupProps1387370830(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: LabelGroup.type): SharedBuilder_LabelGroupProps1387370830 = new SharedBuilder_LabelGroupProps1387370830(js.Array(this.component, js.Dictionary.empty))()
}

