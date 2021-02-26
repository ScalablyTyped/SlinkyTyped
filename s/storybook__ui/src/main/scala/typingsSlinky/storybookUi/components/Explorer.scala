package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookUi.explorerMod.ExplorerProps
import typingsSlinky.storybookUi.sidebarTypesMod.CombinedDataset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Explorer {
  
  @scala.inline
  def apply(dataset: CombinedDataset, isBrowsing: Boolean, isLoading: Boolean): Builder = {
    val __props = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], isBrowsing = isBrowsing.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ExplorerProps]))
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Explorer", "Explorer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def selected(value: typingsSlinky.storybookUi.sidebarTypesMod.Selection): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedNull: this.type = set("selected", null)
  }
  
  def withProps(p: ExplorerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
