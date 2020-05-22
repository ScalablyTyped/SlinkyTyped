package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.mod.Notice.^
import typingsSlinky.wordpressComponents.noticeMod.Notice.Action
import typingsSlinky.wordpressComponents.noticeMod.Notice.Props
import typingsSlinky.wordpressNotices.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Notice {
  @JSImport("@wordpress/components", "Notice")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def actions(value: js.Array[Action]): this.type = set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def isDismissible(value: Boolean): this.type = set("isDismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def onRemove(value: () => Unit): this.type = set("onRemove", js.Any.fromFunction0(value))
    @scala.inline
    def status(value: Status): this.type = set("status", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Notice.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

