package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassDeclaration extends AST {
  var classElements: ISyntaxList2 = js.native
  var closeBraceToken: ASTSpan = js.native
  var heritageClauses: ISyntaxList2 = js.native
  var identifier: Identifier = js.native
  var modifiers: js.Array[PullElementFlags] = js.native
  var typeParameterList: TypeParameterList = js.native
  def structuralEquals(ast: ClassDeclaration, includingPosition: Boolean): Boolean = js.native
}

object ClassDeclaration {
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    classElements: ISyntaxList2,
    closeBraceToken: ASTSpan,
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
    structuralEquals: (ClassDeclaration, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    typeParameterList: TypeParameterList,
    width: () => Double
  ): ClassDeclaration = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], classElements = classElements.asInstanceOf[js.Any], closeBraceToken = closeBraceToken.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), heritageClauses = heritageClauses.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), modifiers = modifiers.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), typeParameterList = typeParameterList.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ClassDeclaration]
  }
  @scala.inline
  implicit class ClassDeclarationOps[Self <: ClassDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassElements(value: ISyntaxList2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseBraceToken(value: ASTSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBraceToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeritageClauses(value: ISyntaxList2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heritageClauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiers(value: js.Array[PullElementFlags]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructuralEquals(value: (ClassDeclaration, Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuralEquals")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTypeParameterList(value: TypeParameterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameterList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

