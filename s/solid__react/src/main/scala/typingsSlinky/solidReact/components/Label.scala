package typingsSlinky.solidReact.components

import typingsSlinky.solidReact.anon.Src
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Label {
  
  @scala.inline
  def apply(src: String): SharedBuilder_Src_531416333[typingsSlinky.solidReact.mod.Label] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_Src_531416333[typingsSlinky.solidReact.mod.Label](js.Array(this.component, __props.asInstanceOf[Src]))
  }
  
  @JSImport("@solid/react", "Label")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Src): SharedBuilder_Src_531416333[typingsSlinky.solidReact.mod.Label] = new SharedBuilder_Src_531416333[typingsSlinky.solidReact.mod.Label](js.Array(this.component, p.asInstanceOf[js.Any]))
}
