package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressEditor.tableOfContentsMod.TableOfContents.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableOfContents {
  @JSImport("@wordpress/editor", "TableOfContents")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def hasOutlineItemsDisabled(value: Boolean): this.type = set("hasOutlineItemsDisabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TableOfContents.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

