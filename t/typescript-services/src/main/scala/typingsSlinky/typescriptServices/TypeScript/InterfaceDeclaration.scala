package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceDeclaration extends AST {
  
  var body: ObjectType = js.native
  
  var heritageClauses: ISyntaxList2 = js.native
  
  var identifier: Identifier = js.native
  
  var modifiers: js.Array[PullElementFlags] = js.native
  
  def structuralEquals(ast: InterfaceDeclaration, includingPosition: Boolean): Boolean = js.native
  
  var typeParameterList: TypeParameterList = js.native
}
object InterfaceDeclaration {
  
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    body: ObjectType,
    end: () => Double,
    fileName: () => String,
    heritageClauses: ISyntaxList2,
    identifier: Identifier,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    modifiers: js.Array[PullElementFlags],
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (InterfaceDeclaration, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    typeParameterList: TypeParameterList,
    width: () => Double
  ): InterfaceDeclaration = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), heritageClauses = heritageClauses.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), modifiers = modifiers.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), typeParameterList = typeParameterList.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[InterfaceDeclaration]
  }
  
  @scala.inline
  implicit class InterfaceDeclarationOps[Self <: InterfaceDeclaration] (val x: Self) extends AnyVal {
    
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
    def setBody(value: ObjectType): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeritageClauses(value: ISyntaxList2): Self = this.set("heritageClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersVarargs(value: PullElementFlags*): Self = this.set("modifiers", js.Array(value :_*))
    
    @scala.inline
    def setModifiers(value: js.Array[PullElementFlags]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuralEquals(value: (InterfaceDeclaration, Boolean) => Boolean): Self = this.set("structuralEquals", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTypeParameterList(value: TypeParameterList): Self = this.set("typeParameterList", value.asInstanceOf[js.Any])
  }
}
