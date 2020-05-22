package typingsSlinky.wordpressEditor.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.blockListMod.BlockList.Props
import typingsSlinky.wordpressEditor.mod.BlockList.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BlockList {
  @JSImport("@wordpress/editor", "BlockList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def renderAppender(value: () => ReactElement): this.type = set("renderAppender", js.Any.fromFunction0(value))
    @scala.inline
    def rootClientId(value: String): this.type = set("rootClientId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BlockList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

