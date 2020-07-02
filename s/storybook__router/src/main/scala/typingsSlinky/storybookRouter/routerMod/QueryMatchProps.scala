package typingsSlinky.storybookRouter.routerMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryMatchProps extends js.Object {
  var path: String
  var startsWith: Boolean
  def children(matchingData: MatchingData): ReactElement
}

object QueryMatchProps {
  @scala.inline
  def apply(children: MatchingData => ReactElement, path: String, startsWith: Boolean): QueryMatchProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryMatchProps]
  }
  @scala.inline
  implicit class QueryMatchPropsOps[Self <: QueryMatchProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: MatchingData => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartsWith(value: Boolean): Self = this.set("startsWith", value.asInstanceOf[js.Any])
  }
  
}

