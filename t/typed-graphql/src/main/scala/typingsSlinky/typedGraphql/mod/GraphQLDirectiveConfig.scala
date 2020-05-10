package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLDirectiveConfig extends js.Object {
  var args: js.UndefOr[js.Array[GraphQLArgument]] = js.native
  var description: js.UndefOr[String] = js.native
  var name: String = js.native
  var onField: js.UndefOr[Boolean] = js.native
  var onFragment: js.UndefOr[Boolean] = js.native
  var onOperation: js.UndefOr[Boolean] = js.native
}

object GraphQLDirectiveConfig {
  @scala.inline
  def apply(name: String): GraphQLDirectiveConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLDirectiveConfig]
  }
  @scala.inline
  implicit class GraphQLDirectiveConfigOps[Self <: GraphQLDirectiveConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: js.Array[GraphQLArgument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withOnField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onField")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFragment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFragment")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOperation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOperation")(js.undefined)
        ret
    }
  }
  
}

