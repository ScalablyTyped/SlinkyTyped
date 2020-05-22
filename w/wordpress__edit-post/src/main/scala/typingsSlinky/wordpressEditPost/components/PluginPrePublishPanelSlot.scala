package typingsSlinky.wordpressEditPost.components

import typingsSlinky.wordpressEditPost.anon.OmitPropsname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PluginPrePublishPanelSlot {
  @JSImport("@wordpress/edit-post", "PluginPrePublishPanel.Slot")
  @js.native
  object component extends js.Object
  
  def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname_1548854944 = new SharedBuilder_OmitPropsname_1548854944(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PluginPrePublishPanelSlot.type): SharedBuilder_OmitPropsname_1548854944 = new SharedBuilder_OmitPropsname_1548854944(js.Array(this.component, js.Dictionary.empty))()
}

