package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeritageClause extends AST {
  
  var _nodeType: js.Any = js.native
  
  def structuralEquals(ast: HeritageClause, includingPosition: Boolean): Boolean = js.native
  
  var typeNames: ISeparatedSyntaxList2 = js.native
}
object HeritageClause {
  
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _nodeType: js.Any,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: () => Double,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (HeritageClause, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    typeNames: ISeparatedSyntaxList2,
    width: () => Double
  ): HeritageClause = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _nodeType = _nodeType.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), typeNames = typeNames.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[HeritageClause]
  }
  
  @scala.inline
  implicit class HeritageClauseOps[Self <: HeritageClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_nodeType(value: js.Any): Self = this.set("_nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuralEquals(value: (HeritageClause, Boolean) => Boolean): Self = this.set("structuralEquals", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTypeNames(value: ISeparatedSyntaxList2): Self = this.set("typeNames", value.asInstanceOf[js.Any])
  }
}
