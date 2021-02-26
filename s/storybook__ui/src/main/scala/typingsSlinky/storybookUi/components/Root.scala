package typingsSlinky.storybookUi.components

import typingsSlinky.storybookUi.distMod.RootProps
import typingsSlinky.storybookUi.providerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Root {
  
  @scala.inline
  def apply(provider: default): SharedBuilder_RootProps_184115096 = {
    val __props = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    new SharedBuilder_RootProps_184115096(js.Array(this.component, __props.asInstanceOf[RootProps]))
  }
  
  @JSImport("@storybook/ui/dist", "Root")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RootProps): SharedBuilder_RootProps_184115096 = new SharedBuilder_RootProps_184115096(js.Array(this.component, p.asInstanceOf[js.Any]))
}
