package typingsSlinky.wordpressComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.slotMod.Slot.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slot {
  @JSImport("@wordpress/components", "Slot")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def bubblesVirtually(value: Boolean): this.type = set("bubblesVirtually", value.asInstanceOf[js.Any])
    @scala.inline
    def children(value: /* fills */ js.Array[js.Array[ReactElement]] => ReactElement | Null): this.type = set("children", js.Any.fromFunction1(value))
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Slot.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

