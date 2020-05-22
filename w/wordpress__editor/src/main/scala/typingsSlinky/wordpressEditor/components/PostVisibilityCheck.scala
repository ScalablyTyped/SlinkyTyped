package typingsSlinky.wordpressEditor.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressEditor.mod.PostVisibilityCheck.^
import typingsSlinky.wordpressEditor.postVisibilityCheckMod.PostVisibilityCheck.Props
import typingsSlinky.wordpressEditor.postVisibilityCheckMod.PostVisibilityCheck.RenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PostVisibilityCheck {
  @JSImport("@wordpress/editor", "PostVisibilityCheck")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(render: RenderProps => ReactElement): Default[tag.type, ^] = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Default[tag.type, ^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

