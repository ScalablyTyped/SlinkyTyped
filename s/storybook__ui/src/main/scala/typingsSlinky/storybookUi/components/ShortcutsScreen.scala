package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.anon.RecordFeatureany
import typingsSlinky.storybookUi.shortcutsMod.ShortcutsScreenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShortcutsScreen {
  
  @scala.inline
  def apply(
    restoreAllDefaultShortcuts: js.Function,
    restoreDefaultShortcut: js.Function,
    setShortcut: js.Function,
    shortcutKeys: RecordFeatureany
  ): typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.storybookUi.shortcutsMod.ShortcutsScreen] = {
    val __props = js.Dynamic.literal(restoreAllDefaultShortcuts = restoreAllDefaultShortcuts.asInstanceOf[js.Any], restoreDefaultShortcut = restoreDefaultShortcut.asInstanceOf[js.Any], setShortcut = setShortcut.asInstanceOf[js.Any], shortcutKeys = shortcutKeys.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.storybookUi.shortcutsMod.ShortcutsScreen](js.Array(this.component, __props.asInstanceOf[ShortcutsScreenProps]))
  }
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "ShortcutsScreen")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ShortcutsScreenProps): typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.storybookUi.shortcutsMod.ShortcutsScreen] = new typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.storybookUi.shortcutsMod.ShortcutsScreen](js.Array(this.component, p.asInstanceOf[js.Any]))
}
