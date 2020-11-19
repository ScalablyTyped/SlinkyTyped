package typingsSlinky.staticEval

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.estree.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("static-eval", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  * Evaluates the given ESTree.Expression, with the given named variables in place.
  * @param ast [ESTree.Expression] An esprima expression derived from parse.body[].expression
  * @param vars Named variables, objects or functions which may be referenced in the expression.
  */
  def apply(ast: Expression, vars: StringDictionary[js.Any]): js.Any = js.native
}
