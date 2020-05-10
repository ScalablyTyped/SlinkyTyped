package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// utilities/Typeinfo.js
@js.native
trait TypeInfo extends js.Object {
  def enter(node: Node): Unit = js.native
  def getArgument(): GraphQLArgument = js.native
  def getDirective(): GraphQLDirective = js.native
  def getFieldDef(): GraphQLFieldDefinition = js.native
  def getInputType(): GraphQLInputType = js.native
  def getParentType(): GraphQLCompositeType = js.native
  def getType(): GraphQLOutputType = js.native
  def leave(node: Node): Unit = js.native
}

object TypeInfo {
  @scala.inline
  def apply(
    enter: Node => Unit,
    getArgument: () => GraphQLArgument,
    getDirective: () => GraphQLDirective,
    getFieldDef: () => GraphQLFieldDefinition,
    getInputType: () => GraphQLInputType,
    getParentType: () => GraphQLCompositeType,
    getType: () => GraphQLOutputType,
    leave: Node => Unit
  ): TypeInfo = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), getArgument = js.Any.fromFunction0(getArgument), getDirective = js.Any.fromFunction0(getDirective), getFieldDef = js.Any.fromFunction0(getFieldDef), getInputType = js.Any.fromFunction0(getInputType), getParentType = js.Any.fromFunction0(getParentType), getType = js.Any.fromFunction0(getType), leave = js.Any.fromFunction1(leave))
    __obj.asInstanceOf[TypeInfo]
  }
  @scala.inline
  implicit class TypeInfoOps[Self <: TypeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnter(value: Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetArgument(value: () => GraphQLArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArgument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDirective(value: () => GraphQLDirective): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirective")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFieldDef(value: () => GraphQLFieldDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldDef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInputType(value: () => GraphQLInputType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentType(value: () => GraphQLCompositeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => GraphQLOutputType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLeave(value: Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

