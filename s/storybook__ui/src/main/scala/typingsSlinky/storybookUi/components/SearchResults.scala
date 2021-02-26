package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookUi.anon.CloseMenu
import typingsSlinky.storybookUi.sidebarTypesMod.DownshiftItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchResults {
  
  @scala.inline
  def apply(
    closeMenu: js.UndefOr[js.Function0[Unit]] => Unit,
    getItemProps: /* import warning: importer.ImportType#apply Failed type conversion: downshift.downshift.ControllerStateAndHelpers<@storybook/ui.@storybook/ui/dist/components/sidebar/types.DownshiftItem>['getItemProps'] */ js.Any,
    getMenuProps: /* import warning: importer.ImportType#apply Failed type conversion: downshift.downshift.ControllerStateAndHelpers<@storybook/ui.@storybook/ui/dist/components/sidebar/types.DownshiftItem>['getMenuProps'] */ js.Any,
    query: String,
    results: js.Array[DownshiftItem]
  ): Builder = {
    val __props = js.Dynamic.literal(closeMenu = js.Any.fromFunction1(closeMenu), getItemProps = getItemProps.asInstanceOf[js.Any], getMenuProps = getMenuProps.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CloseMenu]))
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/SearchResults", "SearchResults")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def enableShortcuts(value: Boolean): this.type = set("enableShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightedIndex(value: Double): this.type = set("highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightedIndexNull: this.type = set("highlightedIndex", null)
    
    @scala.inline
    def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CloseMenu): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
