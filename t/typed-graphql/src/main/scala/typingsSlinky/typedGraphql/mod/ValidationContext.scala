package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationContext extends js.Object {
  def getArgument(): GraphQLArgument = js.native
  def getDirective(): GraphQLDirective = js.native
  def getDocument(): Document = js.native
  def getErrors(): js.Array[js.Error] = js.native
  def getFieldDef(): GraphQLFieldDefinition = js.native
  def getFragment(name: String): FragmentDefinition = js.native
  def getFragmentSpreads(node: SelectionSet): js.Array[FragmentSpread] = js.native
  def getInputType(): GraphQLInputType = js.native
  def getParentType(): GraphQLCompositeType = js.native
  def getRecursiveVariableUsages(operation: OperationDefinition): js.Array[VariableUsage] = js.native
  def getRecursivelyReferencedFragments(operation: OperationDefinition): js.Array[FragmentDefinition] = js.native
  def getSchema(): GraphQLSchema = js.native
  def getType(): GraphQLOutputType = js.native
  def getVariableUsages(node: HasSelectionSet): js.Array[VariableUsage] = js.native
  def reportError(error: js.Error): Unit = js.native
}

object ValidationContext {
  @scala.inline
  def apply(
    getArgument: () => GraphQLArgument,
    getDirective: () => GraphQLDirective,
    getDocument: () => Document,
    getErrors: () => js.Array[js.Error],
    getFieldDef: () => GraphQLFieldDefinition,
    getFragment: String => FragmentDefinition,
    getFragmentSpreads: SelectionSet => js.Array[FragmentSpread],
    getInputType: () => GraphQLInputType,
    getParentType: () => GraphQLCompositeType,
    getRecursiveVariableUsages: OperationDefinition => js.Array[VariableUsage],
    getRecursivelyReferencedFragments: OperationDefinition => js.Array[FragmentDefinition],
    getSchema: () => GraphQLSchema,
    getType: () => GraphQLOutputType,
    getVariableUsages: HasSelectionSet => js.Array[VariableUsage],
    reportError: js.Error => Unit
  ): ValidationContext = {
    val __obj = js.Dynamic.literal(getArgument = js.Any.fromFunction0(getArgument), getDirective = js.Any.fromFunction0(getDirective), getDocument = js.Any.fromFunction0(getDocument), getErrors = js.Any.fromFunction0(getErrors), getFieldDef = js.Any.fromFunction0(getFieldDef), getFragment = js.Any.fromFunction1(getFragment), getFragmentSpreads = js.Any.fromFunction1(getFragmentSpreads), getInputType = js.Any.fromFunction0(getInputType), getParentType = js.Any.fromFunction0(getParentType), getRecursiveVariableUsages = js.Any.fromFunction1(getRecursiveVariableUsages), getRecursivelyReferencedFragments = js.Any.fromFunction1(getRecursivelyReferencedFragments), getSchema = js.Any.fromFunction0(getSchema), getType = js.Any.fromFunction0(getType), getVariableUsages = js.Any.fromFunction1(getVariableUsages), reportError = js.Any.fromFunction1(reportError))
    __obj.asInstanceOf[ValidationContext]
  }
  @scala.inline
  implicit class ValidationContextOps[Self <: ValidationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withGetDocument(value: () => Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetErrors(value: () => js.Array[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFieldDef(value: () => GraphQLFieldDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldDef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFragment(value: String => FragmentDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFragment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFragmentSpreads(value: SelectionSet => js.Array[FragmentSpread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFragmentSpreads")(js.Any.fromFunction1(value))
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
    def withGetRecursiveVariableUsages(value: OperationDefinition => js.Array[VariableUsage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecursiveVariableUsages")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRecursivelyReferencedFragments(value: OperationDefinition => js.Array[FragmentDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecursivelyReferencedFragments")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSchema(value: () => GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => GraphQLOutputType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVariableUsages(value: HasSelectionSet => js.Array[VariableUsage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariableUsages")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReportError(value: js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportError")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

