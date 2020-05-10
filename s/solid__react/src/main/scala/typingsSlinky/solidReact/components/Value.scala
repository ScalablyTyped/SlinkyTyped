package typingsSlinky.solidReact.components

import typingsSlinky.solidReact.AnonSrc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Value {
  @JSImport("@solid/react", "Value")
  @js.native
  object component extends js.Object
  
  def withProps(p: AnonSrc): SharedBuilder_AnonSrc1279231614[typingsSlinky.solidReact.mod.Value] = new SharedBuilder_AnonSrc1279231614[typingsSlinky.solidReact.mod.Value](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(src: String): SharedBuilder_AnonSrc1279231614[typingsSlinky.solidReact.mod.Value] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_AnonSrc1279231614[typingsSlinky.solidReact.mod.Value](js.Array(this.component, __props.asInstanceOf[AnonSrc]))
  }
}

