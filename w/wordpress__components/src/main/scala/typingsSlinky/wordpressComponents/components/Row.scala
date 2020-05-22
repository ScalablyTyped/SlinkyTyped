package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.rowMod.PanelRow.Props
import typingsSlinky.wordpressComponents.rowMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Row {
  @JSImport("@wordpress/components/panel/row", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1368680602[^] = new SharedBuilder_Props1368680602[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Row.type): SharedBuilder_Props1368680602[^] = new SharedBuilder_Props1368680602[^](js.Array(this.component, js.Dictionary.empty))()
}

