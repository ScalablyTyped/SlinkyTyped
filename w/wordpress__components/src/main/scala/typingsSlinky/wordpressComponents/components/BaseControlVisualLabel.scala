package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.baseControlMod.BaseControl.VisualLabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BaseControlVisualLabel {
  @JSImport("@wordpress/components", "BaseControl.VisualLabel")
  @js.native
  object component extends js.Object
  
  def withProps(p: VisualLabelProps): SharedBuilder_VisualLabelProps2140584159 = new SharedBuilder_VisualLabelProps2140584159(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BaseControlVisualLabel.type): SharedBuilder_VisualLabelProps2140584159 = new SharedBuilder_VisualLabelProps2140584159(js.Array(this.component, js.Dictionary.empty))()
}

