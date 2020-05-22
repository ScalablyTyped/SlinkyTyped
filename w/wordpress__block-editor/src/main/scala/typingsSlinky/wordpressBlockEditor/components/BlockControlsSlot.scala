package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.anon.OmitPropsname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BlockControlsSlot {
  @JSImport("@wordpress/block-editor", "BlockControls.Slot")
  @js.native
  object component extends js.Object
  
  def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BlockControlsSlot.type): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, js.Dictionary.empty))()
}

