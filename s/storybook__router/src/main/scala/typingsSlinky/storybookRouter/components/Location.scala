package typingsSlinky.storybookRouter.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookRouter.routerMod.QueryLocationProps
import typingsSlinky.storybookRouter.routerMod.RenderData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Location {
  
  @scala.inline
  def apply(children: RenderData => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[QueryLocationProps]))
  }
  
  @JSImport("@storybook/router", "Location")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: QueryLocationProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
