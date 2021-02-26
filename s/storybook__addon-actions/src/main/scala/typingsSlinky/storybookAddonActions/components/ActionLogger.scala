package typingsSlinky.storybookAddonActions.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonActions.containersActionLoggerMod.ActionLoggerProps
import typingsSlinky.storybookAddonActions.containersActionLoggerMod.default
import typingsSlinky.storybookApi.mod.API
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionLogger {
  
  @scala.inline
  def apply(active: Boolean, api: API): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[ActionLoggerProps]))
  }
  
  @JSImport("@storybook/addon-actions/dist/containers/ActionLogger", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ActionLoggerProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
