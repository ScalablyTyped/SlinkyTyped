package typingsSlinky.storybookRouter.routerMod

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
  def apply(to: String, children: TagMod[Any] = null): QueryLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLinkProps]
  }
}

