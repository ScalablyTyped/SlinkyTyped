package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.revealContentMod.RevealContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RevealContent {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Reveal/RevealContent", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: RevealContentProps): SharedBuilder_RevealContentProps2098528121 = new SharedBuilder_RevealContentProps2098528121(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RevealContent.type): SharedBuilder_RevealContentProps2098528121 = new SharedBuilder_RevealContentProps2098528121(js.Array(this.component, js.Dictionary.empty))()
}

