package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLScalarTypeConfig extends js.Object {
  var description: js.UndefOr[String] = js.native
  var name: String = js.native
  var parseLiteral: js.UndefOr[js.Function1[/* valueAST */ Value, _]] = js.native
  var parseValue: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  def serialize(value: js.Any): js.Any = js.native
}

object GraphQLScalarTypeConfig {
  @scala.inline
  def apply(name: String, serialize: js.Any => js.Any): GraphQLScalarTypeConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[GraphQLScalarTypeConfig]
  }
  @scala.inline
  implicit class GraphQLScalarTypeConfigOps[Self <: GraphQLScalarTypeConfig] (val x: Self) extends AnyVal {
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
    def withSerialize(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
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
    def withParseLiteral(value: /* valueAST */ Value => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseLiteral")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParseLiteral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withParseValue(value: /* value */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParseValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseValue")(js.undefined)
        ret
    }
  }
  
}

