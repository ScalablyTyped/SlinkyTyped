package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.mod.PanelRow.^
import typingsSlinky.wordpressComponents.rowMod.PanelRow.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PanelRow {
  @JSImport("@wordpress/components", "PanelRow")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1368680602[^] = new SharedBuilder_Props1368680602[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PanelRow.type): SharedBuilder_Props1368680602[^] = new SharedBuilder_Props1368680602[^](js.Array(this.component, js.Dictionary.empty))()
}

