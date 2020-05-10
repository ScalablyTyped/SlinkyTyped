package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParameters extends js.Object {
  var ast: AST = js.native
  var length: Double = js.native
  def astAt(index: Double): AST = js.native
  def identifierAt(index: Double): Identifier = js.native
  def initializerAt(index: Double): EqualsValueClause = js.native
  def isOptionalAt(index: Double): Boolean = js.native
  def lastParameterIsRest(): Boolean = js.native
  def typeAt(index: Double): AST = js.native
}

object IParameters {
  @scala.inline
  def apply(
    ast: AST,
    astAt: Double => AST,
    identifierAt: Double => Identifier,
    initializerAt: Double => EqualsValueClause,
    isOptionalAt: Double => Boolean,
    lastParameterIsRest: () => Boolean,
    length: Double,
    typeAt: Double => AST
  ): IParameters = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], astAt = js.Any.fromFunction1(astAt), identifierAt = js.Any.fromFunction1(identifierAt), initializerAt = js.Any.fromFunction1(initializerAt), isOptionalAt = js.Any.fromFunction1(isOptionalAt), lastParameterIsRest = js.Any.fromFunction0(lastParameterIsRest), length = length.asInstanceOf[js.Any], typeAt = js.Any.fromFunction1(typeAt))
    __obj.asInstanceOf[IParameters]
  }
  @scala.inline
  implicit class IParametersOps[Self <: IParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAst(value: AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAstAt(value: Double => AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIdentifierAt(value: Double => Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitializerAt(value: Double => EqualsValueClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializerAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsOptionalAt(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptionalAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLastParameterIsRest(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastParameterIsRest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeAt(value: Double => AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAt")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

