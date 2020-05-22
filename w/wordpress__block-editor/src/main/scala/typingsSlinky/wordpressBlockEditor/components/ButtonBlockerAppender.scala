package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.buttonBlockAppenderMod.ButtonBlockAppender.Props
import typingsSlinky.wordpressBlockEditor.mod.ButtonBlockerAppender.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ButtonBlockerAppender {
  @JSImport("@wordpress/block-editor", "ButtonBlockerAppender")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props371668099[^] = new SharedBuilder_Props371668099[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(rootClientId: String): SharedBuilder_Props371668099[^] = {
    val __props = js.Dynamic.literal(rootClientId = rootClientId.asInstanceOf[js.Any])
    new SharedBuilder_Props371668099[^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

