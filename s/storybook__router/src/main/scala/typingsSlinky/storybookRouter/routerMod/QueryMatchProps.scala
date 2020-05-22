package typingsSlinky.storybookRouter.routerMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryMatchProps extends js.Object {
  var path: String
  var startsWith: Boolean
  def children(matchingData: MatchingData): TagMod[Any]
}

object QueryMatchProps {
  @scala.inline
  def apply(children: MatchingData => TagMod[Any], path: String, startsWith: Boolean): QueryMatchProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryMatchProps]
  }
}

