package typingsSlinky.yaml.typesMod.Schema

import typingsSlinky.yaml.typesMod.AST.Node
import typingsSlinky.yaml.yamlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTag
  extends BaseTag
     with Tag {
  /**
    * If `true`, together with `test` allows for values to be stringified without
    * an explicit tag. For most cases, it's unlikely that you'll actually want to
    * use this, even if you first think you do.
    */
  var default: `true` = js.native
  /**
    * Together with `default` allows for values to be stringified without an
    * explicit tag and detected using a regular expression. For most cases, it's
    * unlikely that you'll actually want to use these, even if you first think
    * you do.
    */
  var test: js.RegExp = js.native
  /**
    * Alternative form used by default tags; called with `test` match results.
    */
  def resolve(`match`: String*): Node | js.Any = js.native
}

object DefaultTag {
  @scala.inline
  def apply(
    default: `true`,
    identify: js.Any => Boolean,
    resolve: /* repeated */ String => Node | js.Any,
    tag: String,
    test: js.RegExp
  ): DefaultTag = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction1(resolve), tag = tag.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTag]
  }
  @scala.inline
  implicit class DefaultTagOps[Self <: DefaultTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolve(value: /* repeated */ String => Node | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTest(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

