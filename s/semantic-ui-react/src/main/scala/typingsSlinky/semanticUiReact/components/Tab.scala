package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.AnonMenuItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.tabMod.default
import typingsSlinky.semanticUiReact.tabTabMod.TabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tab {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Tab", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def activeIndex(value: Double | String): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultActiveIndex(value: Double | String): this.type = set("defaultActiveIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def grid(value: js.Any): this.type = set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def menu(value: js.Any): this.type = set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def menuPosition(value: left | right): this.type = set("menuPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def onTabChange(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ TabProps) => Unit): this.type = set("onTabChange", js.Any.fromFunction2(value))
    @scala.inline
    def panes(value: js.Array[AnonMenuItem]): this.type = set("panes", value.asInstanceOf[js.Any])
    @scala.inline
    def renderActiveOnly(value: Boolean): this.type = set("renderActiveOnly", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

