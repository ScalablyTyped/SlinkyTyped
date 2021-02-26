package typingsSlinky.solidReact.components

import typingsSlinky.solidReact.anon.Src
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Value {
  
  @scala.inline
  def apply(src: String): SharedBuilder_Src_531416333[typingsSlinky.solidReact.mod.Value] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_Src_531416333[typingsSlinky.solidReact.mod.Value](js.Array(this.component, __props.asInstanceOf[Src]))
  }
  
  @JSImport("@solid/react", "Value")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Src): SharedBuilder_Src_531416333[typingsSlinky.solidReact.mod.Value] = new SharedBuilder_Src_531416333[typingsSlinky.solidReact.mod.Value](js.Array(this.component, p.asInstanceOf[js.Any]))
}
