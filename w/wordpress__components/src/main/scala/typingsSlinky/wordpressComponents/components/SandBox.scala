package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.sandboxMod.SandBox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SandBox {
  
  @JSImport("@wordpress/components", "SandBox")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SandBox.type): SharedBuilder_Props613517575 = new SharedBuilder_Props613517575(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props613517575 = new SharedBuilder_Props613517575(js.Array(this.component, p.asInstanceOf[js.Any]))
}

object Sandbox {
  
  @JSImport("@wordpress/components/sandbox", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Sandbox.type): SharedBuilder_Props613517575 = new SharedBuilder_Props613517575(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props613517575 = new SharedBuilder_Props613517575(js.Array(this.component, p.asInstanceOf[js.Any]))
}
