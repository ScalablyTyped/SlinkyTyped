package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type/directives.js
@js.native
trait GraphQLDirective extends js.Object {
  var args: js.Array[GraphQLArgument] = js.native
  var description: String = js.native
  var name: String = js.native
  var onField: Boolean = js.native
  var onFragment: Boolean = js.native
  var onOperation: Boolean = js.native
}

object GraphQLDirective {
  @scala.inline
  def apply(
    args: js.Array[GraphQLArgument],
    description: String,
    name: String,
    onField: Boolean,
    onFragment: Boolean,
    onOperation: Boolean
  ): GraphQLDirective = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onField = onField.asInstanceOf[js.Any], onFragment = onFragment.asInstanceOf[js.Any], onOperation = onOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLDirective]
  }
  @scala.inline
  implicit class GraphQLDirectiveOps[Self <: GraphQLDirective] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[GraphQLArgument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnFragment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnOperation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOperation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

