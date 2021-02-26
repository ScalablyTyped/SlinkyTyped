package typingsSlinky.storybookRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookRouter.routerMod.RouteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Route {
  
  @scala.inline
  def apply(path: String): Builder = {
    val __props = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RouteProps]))
  }
  
  @JSImport("@storybook/router", "Route")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def hideOnly(value: Boolean): this.type = set("hideOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startsWith(value: Boolean): this.type = set("startsWith", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RouteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
