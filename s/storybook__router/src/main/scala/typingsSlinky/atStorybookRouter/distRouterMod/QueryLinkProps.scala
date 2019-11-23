package typingsSlinky.atStorybookRouter.distRouterMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLinkProps extends js.Object {
  var children: TagMod[Any]
  var to: String
}

object QueryLinkProps {
  @scala.inline
  def apply(children: TagMod[Any], to: String): QueryLinkProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryLinkProps]
  }
}

