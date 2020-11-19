package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.revealContentMod.RevealContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RevealContent {
  
  @JSImport("semantic-ui-react", "RevealContent")
  @js.native
  object component extends js.Object
  
  def withProps(p: RevealContentProps): SharedBuilder_RevealContentProps2098528121 = new SharedBuilder_RevealContentProps2098528121(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RevealContent.type): SharedBuilder_RevealContentProps2098528121 = new SharedBuilder_RevealContentProps2098528121(js.Array(this.component, js.Dictionary.empty))()
}
