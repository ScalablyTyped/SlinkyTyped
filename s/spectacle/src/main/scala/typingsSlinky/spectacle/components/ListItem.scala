package typingsSlinky.spectacle.components

import typingsSlinky.spectacle.mod.ListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  @JSImport("spectacle", "ListItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: ListProps): SharedBuilder_ListProps_1053776531[typingsSlinky.spectacle.mod.ListItem] = new SharedBuilder_ListProps_1053776531[typingsSlinky.spectacle.mod.ListItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItem.type): SharedBuilder_ListProps_1053776531[typingsSlinky.spectacle.mod.ListItem] = new SharedBuilder_ListProps_1053776531[typingsSlinky.spectacle.mod.ListItem](js.Array(this.component, js.Dictionary.empty))()
}

