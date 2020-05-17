package typingsSlinky.solidReact.components

import typingsSlinky.solidReact.anon.Src
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Value {
  @JSImport("@solid/react", "Value")
  @js.native
  object component extends js.Object
  
  def withProps(p: Src): SharedBuilder_Src_531416333[typingsSlinky.solidReact.mod.Value] = new SharedBuilder_Src_531416333[typingsSlinky.solidReact.mod.Value](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(src: String): SharedBuilder_Src_531416333[typingsSlinky.solidReact.mod.Value] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_Src_531416333[typingsSlinky.solidReact.mod.Value](js.Array(this.component, __props.asInstanceOf[Src]))
  }
}

