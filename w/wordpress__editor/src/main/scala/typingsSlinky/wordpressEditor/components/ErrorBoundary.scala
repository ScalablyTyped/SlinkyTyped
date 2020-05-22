package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressEditor.errorBoundaryMod.ErrorBoundary.Props
import typingsSlinky.wordpressEditor.mod.ErrorBoundary.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ErrorBoundary {
  @JSImport("@wordpress/editor", "ErrorBoundary")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onError: () => Unit): Default[tag.type, ^] = {
    val __props = js.Dynamic.literal(onError = js.Any.fromFunction0(onError))
    new Default[tag.type, ^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

