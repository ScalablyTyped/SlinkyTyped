package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccessor extends AST {
  
  var block: Block = js.native
  
  var modifiers: js.Array[PullElementFlags] = js.native
  
  var parameterList: ParameterList = js.native
  
  var propertyName: IASTToken = js.native
  
  var typeAnnotation: TypeAnnotation = js.native
}
object GetAccessor {
  
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    block: Block,
    end: () => Double,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    modifiers: js.Array[PullElementFlags],
    parameterList: ParameterList,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    propertyName: IASTToken,
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (AST, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    typeAnnotation: TypeAnnotation,
    width: () => Double
  ): GetAccessor = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), modifiers = modifiers.asInstanceOf[js.Any], parameterList = parameterList.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), propertyName = propertyName.asInstanceOf[js.Any], setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), typeAnnotation = typeAnnotation.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[GetAccessor]
  }
  
  @scala.inline
  implicit class GetAccessorMutableBuilder[Self <: GetAccessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiers(value: js.Array[PullElementFlags]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersVarargs(value: PullElementFlags*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
    
    @scala.inline
    def setParameterList(value: ParameterList): Self = StObject.set(x, "parameterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: IASTToken): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
