package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.buttonBlockAppenderMod.ButtonBlockAppender.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonBlockAppender {
  
  @JSImport("@wordpress/block-editor/components/button-block-appender", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props348963618 = new SharedBuilder_Props348963618(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(rootClientId: String): SharedBuilder_Props348963618 = {
    val __props = js.Dynamic.literal(rootClientId = rootClientId.asInstanceOf[js.Any])
    new SharedBuilder_Props348963618(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
