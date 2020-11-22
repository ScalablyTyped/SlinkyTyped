package typingsSlinky.wordpressComponents.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.wordpressComponents.itemMod.FlexItem.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FlexItem {
  
  @JSImport("@wordpress/components", "FlexItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1179620027[HTMLDivElement] = new SharedBuilder_Props_1179620027[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FlexItem.type): SharedBuilder_Props_1179620027[HTMLDivElement] = new SharedBuilder_Props_1179620027[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
}
