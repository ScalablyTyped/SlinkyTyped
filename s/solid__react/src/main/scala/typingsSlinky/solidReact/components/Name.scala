package typingsSlinky.solidReact.components

import typingsSlinky.solidReact.AnonSrc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Name {
  @JSImport("@solid/react", "Name")
  @js.native
  object component extends js.Object
  
  def withProps(p: AnonSrc): SharedBuilder_AnonSrc1279231614[typingsSlinky.solidReact.mod.Name] = new SharedBuilder_AnonSrc1279231614[typingsSlinky.solidReact.mod.Name](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(src: String): SharedBuilder_AnonSrc1279231614[typingsSlinky.solidReact.mod.Name] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_AnonSrc1279231614[typingsSlinky.solidReact.mod.Name](js.Array(this.component, __props.asInstanceOf[AnonSrc]))
  }
}

