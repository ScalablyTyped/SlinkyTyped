package typingsSlinky.storybookRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookRouter.routerMod.QueryLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  @scala.inline
  def apply(to: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[QueryLinkProps]))
  }
  
  @JSImport("@storybook/router", "Link")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: QueryLinkProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
