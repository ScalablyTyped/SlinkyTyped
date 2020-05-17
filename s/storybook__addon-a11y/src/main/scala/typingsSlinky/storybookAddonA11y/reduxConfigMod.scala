package typingsSlinky.storybookAddonA11y

import typingsSlinky.redux.mod.Store
import typingsSlinky.storybookAddonA11y.anon.Data
import typingsSlinky.storybookAddonA11y.anon.HighlightedElementsMap
import typingsSlinky.storybookAddonA11y.anon.Payload
import typingsSlinky.storybookAddonA11y.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-a11y/dist/redux-config", JSImport.Namespace)
@js.native
object reduxConfigMod extends js.Object {
  val default: Store[HighlightedElementsMap, js.Any] = js.native
  def addElement(payload: Data): Payload = js.native
  def clearElements(): Type = js.native
}

