package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.tabPaneMod.TabPaneProps
import typingsSlinky.semanticUiReact.tabTabMod.TabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tab {
  @JSImport("semantic-ui-react", "Tab")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Tab] {
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
    def panesVarargs(value: typingsSlinky.semanticUiReact.anon.MenuItem*): this.type = set("panes", js.Array(value :_*))
    @scala.inline
    def panes(value: js.Array[typingsSlinky.semanticUiReact.anon.MenuItem]): this.type = set("panes", value.asInstanceOf[js.Any])
    @scala.inline
    def renderActiveOnly(value: Boolean): this.type = set("renderActiveOnly", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Pane {
    @JSImport("semantic-ui-react", "Tab.Pane")
    @js.native
    object component extends js.Object
    
    def withProps(p: TabPaneProps): SharedBuilder_TabPaneProps1810713740 = new SharedBuilder_TabPaneProps1810713740(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Pane.type): SharedBuilder_TabPaneProps1810713740 = new SharedBuilder_TabPaneProps1810713740(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

