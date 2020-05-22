package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.mod.PageAttributesOrder.^
import typingsSlinky.wordpressEditor.orderMod.PageAttributesOrder.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageAttributesOrder {
  @JSImport("@wordpress/editor", "PageAttributesOrder")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_251748380[^] = new SharedBuilder_Props_251748380[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PageAttributesOrder.type): SharedBuilder_Props_251748380[^] = new SharedBuilder_Props_251748380[^](js.Array(this.component, js.Dictionary.empty))()
}

