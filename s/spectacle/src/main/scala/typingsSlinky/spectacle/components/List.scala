package typingsSlinky.spectacle.components

import typingsSlinky.spectacle.mod.ListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  @JSImport("spectacle", "List")
  @js.native
  object component extends js.Object
  
  def withProps(p: ListProps): SharedBuilder_ListProps_1053776531[typingsSlinky.spectacle.mod.List] = new SharedBuilder_ListProps_1053776531[typingsSlinky.spectacle.mod.List](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: List.type): SharedBuilder_ListProps_1053776531[typingsSlinky.spectacle.mod.List] = new SharedBuilder_ListProps_1053776531[typingsSlinky.spectacle.mod.List](js.Array(this.component, js.Dictionary.empty))()
}

