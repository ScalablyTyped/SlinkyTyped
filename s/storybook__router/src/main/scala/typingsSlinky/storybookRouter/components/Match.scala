package typingsSlinky.storybookRouter.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookRouter.routerMod.MatchingData
import typingsSlinky.storybookRouter.routerMod.QueryMatchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Match {
  @JSImport("@storybook/router", "Match")
  @js.native
  object component extends js.Object
  
  def withProps(p: QueryMatchProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: MatchingData => TagMod[Any], path: String, startsWith: Boolean): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[QueryMatchProps]))
  }
}

