package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.orderMod.PageAttributesOrder.Props
import typingsSlinky.wordpressEditor.orderMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Order {
  @JSImport("@wordpress/editor/components/page-attributes/order", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_251748380[^] = new SharedBuilder_Props_251748380[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Order.type): SharedBuilder_Props_251748380[^] = new SharedBuilder_Props_251748380[^](js.Array(this.component, js.Dictionary.empty))()
}

