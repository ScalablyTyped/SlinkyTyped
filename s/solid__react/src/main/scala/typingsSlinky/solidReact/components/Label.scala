package typingsSlinky.solidReact.components

import typingsSlinky.solidReact.AnonSrc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Label {
  @JSImport("@solid/react", "Label")
  @js.native
  object component extends js.Object
  
  def withProps(p: AnonSrc): SharedBuilder_AnonSrc1279231614[typingsSlinky.solidReact.mod.Label] = new SharedBuilder_AnonSrc1279231614[typingsSlinky.solidReact.mod.Label](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(src: String): SharedBuilder_AnonSrc1279231614[typingsSlinky.solidReact.mod.Label] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_AnonSrc1279231614[typingsSlinky.solidReact.mod.Label](js.Array(this.component, __props.asInstanceOf[AnonSrc]))
  }
}

