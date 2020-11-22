package typingsSlinky.wordpressComponents.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.wordpressComponents.blockMod.FlexBlock.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FlexBlock {
  
  @JSImport("@wordpress/components", "FlexBlock")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props574622906[HTMLDivElement] = new SharedBuilder_Props574622906[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FlexBlock.type): SharedBuilder_Props574622906[HTMLDivElement] = new SharedBuilder_Props574622906[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
}
