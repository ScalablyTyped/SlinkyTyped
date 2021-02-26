package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.anon.LoginUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthBlock {
  
  @scala.inline
  def apply(id: String, loginUrl: String): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], loginUrl = loginUrl.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[LoginUrl]))
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/RefBlocks", "AuthBlock")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LoginUrl): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
