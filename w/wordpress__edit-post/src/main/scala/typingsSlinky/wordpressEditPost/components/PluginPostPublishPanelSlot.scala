package typingsSlinky.wordpressEditPost.components

import typingsSlinky.wordpressEditPost.anon.OmitPropsname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PluginPostPublishPanelSlot {
  @JSImport("@wordpress/edit-post", "PluginPostPublishPanel.Slot")
  @js.native
  object component extends js.Object
  
  def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname_1548854944 = new SharedBuilder_OmitPropsname_1548854944(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PluginPostPublishPanelSlot.type): SharedBuilder_OmitPropsname_1548854944 = new SharedBuilder_OmitPropsname_1548854944(js.Array(this.component, js.Dictionary.empty))()
}

