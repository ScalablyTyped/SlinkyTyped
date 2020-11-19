package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.labelGroupMod.LabelGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LabelGroup {
  
  @JSImport("semantic-ui-react", "LabelGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: LabelGroupProps): SharedBuilder_LabelGroupProps1387370830 = new SharedBuilder_LabelGroupProps1387370830(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: LabelGroup.type): SharedBuilder_LabelGroupProps1387370830 = new SharedBuilder_LabelGroupProps1387370830(js.Array(this.component, js.Dictionary.empty))()
}
