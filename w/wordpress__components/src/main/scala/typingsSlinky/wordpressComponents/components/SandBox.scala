package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.mod.SandBox.^
import typingsSlinky.wordpressComponents.sandboxMod.SandBox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SandBox {
  @JSImport("@wordpress/components", "SandBox")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_883064592[^] = new SharedBuilder_Props_883064592[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SandBox.type): SharedBuilder_Props_883064592[^] = new SharedBuilder_Props_883064592[^](js.Array(this.component, js.Dictionary.empty))()
}

object Sandbox {
  @JSImport("@wordpress/components/sandbox", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_883064592[typingsSlinky.wordpressComponents.sandboxMod.default.^] = new SharedBuilder_Props_883064592[typingsSlinky.wordpressComponents.sandboxMod.default.^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Sandbox.type): SharedBuilder_Props_883064592[typingsSlinky.wordpressComponents.sandboxMod.default.^] = new SharedBuilder_Props_883064592[typingsSlinky.wordpressComponents.sandboxMod.default.^](js.Array(this.component, js.Dictionary.empty))()
}

