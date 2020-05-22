package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.mod.TabPanel.^
import typingsSlinky.wordpressComponents.tabPanelMod.TabPanel.Props
import typingsSlinky.wordpressComponents.tabPanelMod.TabPanel.Tab
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.horizontal
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabPanel {
  @JSImport("@wordpress/components", "TabPanel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def activeClass(value: String): this.type = set("activeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def initialTabName(value: String): this.type = set("initialTabName", value.asInstanceOf[js.Any])
    @scala.inline
    def onSelect(value: /* tabName */ String => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(tabs: js.Array[Tab]): Builder = {
    val __props = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

