package typingsSlinky.storybookRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookRouter.routerMod.QueryLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link {
  @JSImport("@storybook/router", "Link")
  @js.native
  object component extends js.Object
  
  def withProps(p: QueryLinkProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(to: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[QueryLinkProps]))
  }
}

