package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericType extends AST {
  
  var name: AST = js.native
  
  def structuralEquals(ast: GenericType, includingPosition: Boolean): Boolean = js.native
  
  var typeArgumentList: TypeArgumentList = js.native
}
object GenericType {
  
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: () => Double,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    name: AST,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (GenericType, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    typeArgumentList: TypeArgumentList,
    width: () => Double
  ): GenericType = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), typeArgumentList = typeArgumentList.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[GenericType]
  }
  
  @scala.inline
  implicit class GenericTypeMutableBuilder[Self <: GenericType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: AST): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuralEquals(value: (GenericType, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTypeArgumentList(value: TypeArgumentList): Self = StObject.set(x, "typeArgumentList", value.asInstanceOf[js.Any])
  }
}
