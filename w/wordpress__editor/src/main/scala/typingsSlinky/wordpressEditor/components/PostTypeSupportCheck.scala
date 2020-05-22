package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressEditor.mod.PostTypeSupportCheck.^
import typingsSlinky.wordpressEditor.postTypeSupportCheckMod.PostTypeSupportCheck.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PostTypeSupportCheck {
  @JSImport("@wordpress/editor", "PostTypeSupportCheck")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(supportKeys: String | js.Array[String]): Default[tag.type, ^] = {
    val __props = js.Dynamic.literal(supportKeys = supportKeys.asInstanceOf[js.Any])
    new Default[tag.type, ^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

