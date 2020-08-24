package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.labelDetailMod.LabelDetailProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LabelDetail {
  @JSImport("semantic-ui-react", "LabelDetail")
  @js.native
  object component extends js.Object
  
  def withProps(p: LabelDetailProps): SharedBuilder_LabelDetailProps_543902875 = new SharedBuilder_LabelDetailProps_543902875(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: LabelDetail.type): SharedBuilder_LabelDetailProps_543902875 = new SharedBuilder_LabelDetailProps_543902875(js.Array(this.component, js.Dictionary.empty))()
}

