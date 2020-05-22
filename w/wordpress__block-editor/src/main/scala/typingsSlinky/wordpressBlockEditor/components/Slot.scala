package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.anon.OmitPropsname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slot {
  @JSImport("@wordpress/block-editor/components/block-controls", "default.Slot")
  @js.native
  object component extends js.Object
  
  def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Slot.type): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, js.Dictionary.empty))()
}

