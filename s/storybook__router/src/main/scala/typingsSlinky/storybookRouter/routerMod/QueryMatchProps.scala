package typingsSlinky.storybookRouter.routerMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryMatchProps extends js.Object {
  var path: String = js.native
  var startsWith: Boolean = js.native
  def children(matchingData: MatchingData): TagMod[Any] = js.native
}

object QueryMatchProps {
  @scala.inline
  def apply(children: MatchingData => TagMod[Any], path: String, startsWith: Boolean): QueryMatchProps = {
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
    def withChildren(value: MatchingData => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartsWith(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsWith")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

