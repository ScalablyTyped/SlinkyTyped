package typingsSlinky.wordpressNux.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressNux.dotTipMod.DotTip.Props
import typingsSlinky.wordpressNux.mod.DotTip.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DotTip {
  @JSImport("@wordpress/nux", "DotTip")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(tipId: String): Default[tag.type, ^] = {
    val __props = js.Dynamic.literal(tipId = tipId.asInstanceOf[js.Any])
    new Default[tag.type, ^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

