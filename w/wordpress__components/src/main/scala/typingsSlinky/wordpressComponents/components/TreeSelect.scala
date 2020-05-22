package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.mod.TreeSelect.^
import typingsSlinky.wordpressComponents.treeSelectMod.TreeSelect.Props
import typingsSlinky.wordpressComponents.treeSelectMod.TreeSelect.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeSelect {
  @JSImport("@wordpress/components", "TreeSelect")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def noOptionLabel(value: String): this.type = set("noOptionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedId(value: String): this.type = set("selectedId", value.asInstanceOf[js.Any])
    @scala.inline
    def tree(value: Tree): this.type = set("tree", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TreeSelect.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

