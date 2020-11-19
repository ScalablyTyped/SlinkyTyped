package typingsSlinky.storybookAddonA11y

import typingsSlinky.redux.mod.Store
import typingsSlinky.storybookAddonA11y.anon.Data
import typingsSlinky.storybookAddonA11y.anon.HighlightedElementsMap
import typingsSlinky.storybookAddonA11y.anon.Payload
import typingsSlinky.storybookAddonA11y.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-a11y/dist/redux-config", JSImport.Namespace)
@js.native
object reduxConfigMod extends js.Object {
  
  def addElement(payload: Data): Payload = js.native
  
  def clearElements(): Type = js.native
  
  val default: Store[HighlightedElementsMap, js.Any] = js.native
}
