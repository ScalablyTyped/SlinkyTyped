package typingsSlinky.wordpressEditPost.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressEditPost.pluginPostStatusInfoMod.PluginPostStatusInfo.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PluginPostStatusInfo {
  @JSImport("@wordpress/edit-post/components/sidebar/plugin-post-status-info", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PluginPostStatusInfo.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

