package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLObjectTypeConfig extends js.Object {
  var description: js.UndefOr[String] = js.native
  var fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap = js.native
  var interfaces: js.UndefOr[GraphQLInterfacesThunk | js.Array[GraphQLInterfaceType]] = js.native
  var isTypeOf: js.UndefOr[GraphQLIsTypeOfFn] = js.native
  var name: String = js.native
}

object GraphQLObjectTypeConfig {
  @scala.inline
  def apply(fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap, name: String): GraphQLObjectTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLObjectTypeConfig]
  }
  @scala.inline
  implicit class GraphQLObjectTypeConfigOps[Self <: GraphQLObjectTypeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldsFunction0(value: () => GraphQLFieldConfigMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFields(value: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    def withInterfacesFunction0(value: () => js.Array[GraphQLInterfaceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInterfaces(value: GraphQLInterfacesThunk | js.Array[GraphQLInterfaceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTypeOf(value: (/* source */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeOf")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutIsTypeOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeOf")(js.undefined)
        ret
    }
  }
  
}

