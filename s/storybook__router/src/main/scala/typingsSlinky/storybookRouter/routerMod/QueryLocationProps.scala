package typingsSlinky.storybookRouter.routerMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLocationProps extends js.Object {
  def children(renderData: RenderData): TagMod[Any]
}

object QueryLocationProps {
  @scala.inline
  def apply(children: RenderData => TagMod[Any]): QueryLocationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[QueryLocationProps]
  }
}

