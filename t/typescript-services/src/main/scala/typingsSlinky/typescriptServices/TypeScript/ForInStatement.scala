package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForInStatement extends AST {
  
  var expression: AST = js.native
  
  var left: AST = js.native
  
  var statement: AST = js.native
  
  def structuralEquals(ast: ForInStatement, includingPosition: Boolean): Boolean = js.native
  
  var variableDeclaration: VariableDeclaration = js.native
}
object ForInStatement {
  
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: () => Double,
    expression: AST,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    left: AST,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    statement: AST,
    structuralEquals: (ForInStatement, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    variableDeclaration: VariableDeclaration,
    width: () => Double
  ): ForInStatement = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), expression = expression.asInstanceOf[js.Any], fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), left = left.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), statement = statement.asInstanceOf[js.Any], structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), variableDeclaration = variableDeclaration.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ForInStatement]
  }
  
  @scala.inline
  implicit class ForInStatementMutableBuilder[Self <: ForInStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: AST): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: AST): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement(value: AST): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuralEquals(value: (ForInStatement, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVariableDeclaration(value: VariableDeclaration): Self = StObject.set(x, "variableDeclaration", value.asInstanceOf[js.Any])
  }
}
