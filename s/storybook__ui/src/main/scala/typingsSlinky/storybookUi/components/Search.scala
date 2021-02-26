package typingsSlinky.storybookUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookUi.anon.Children
import typingsSlinky.storybookUi.anon.GetItemProps
import typingsSlinky.storybookUi.sidebarTypesMod.CombinedDataset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Search {
  
  @scala.inline
  def apply(
    children: /* args */ GetItemProps => ReactElement,
    clearLastViewed: () => Unit,
    dataset: CombinedDataset,
    getLastViewed: () => js.Array[typingsSlinky.storybookUi.sidebarTypesMod.Selection]
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), clearLastViewed = js.Any.fromFunction0(clearLastViewed), dataset = dataset.asInstanceOf[js.Any], getLastViewed = js.Any.fromFunction0(getLastViewed))
    new Builder(js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Search", "Search")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def enableShortcuts(value: Boolean): this.type = set("enableShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialQuery(value: String): this.type = set("initialQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
