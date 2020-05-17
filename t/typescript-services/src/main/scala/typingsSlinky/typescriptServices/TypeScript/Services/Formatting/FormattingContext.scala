package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattingContext extends js.Object {
  var contextNode: IndentationNodeContext = js.native
  var contextNodeAllOnSameLine: js.Any = js.native
  var contextNodeBlockIsOnOneLine: js.Any = js.native
  var currentTokenParent: IndentationNodeContext = js.native
  var currentTokenSpan: TokenSpan = js.native
  var formattingRequestKind: FormattingRequestKind = js.native
  var nextNodeAllOnSameLine: js.Any = js.native
  var nextNodeBlockIsOnOneLine: js.Any = js.native
  var nextTokenParent: IndentationNodeContext = js.native
  var nextTokenSpan: TokenSpan = js.native
  var snapshot: js.Any = js.native
  var tokensAreOnSameLine: js.Any = js.native
  def BlockIsOnOneLine(node: IndentationNodeContext): Boolean = js.native
  def ContextNodeAllOnSameLine(): Boolean = js.native
  def ContextNodeBlockIsOnOneLine(): Boolean = js.native
  def NextNodeAllOnSameLine(): Boolean = js.native
  def NextNodeBlockIsOnOneLine(): Boolean = js.native
  def NodeIsOnOneLine(node: IndentationNodeContext): Boolean = js.native
  def TokensAreOnSameLine(): Boolean = js.native
  def updateContext(
    currentTokenSpan: TokenSpan,
    currentTokenParent: IndentationNodeContext,
    nextTokenSpan: TokenSpan,
    nextTokenParent: IndentationNodeContext,
    commonParent: IndentationNodeContext
  ): Unit = js.native
}

object FormattingContext {
  @scala.inline
  def apply(
    BlockIsOnOneLine: IndentationNodeContext => Boolean,
    ContextNodeAllOnSameLine: () => Boolean,
    ContextNodeBlockIsOnOneLine: () => Boolean,
    NextNodeAllOnSameLine: () => Boolean,
    NextNodeBlockIsOnOneLine: () => Boolean,
    NodeIsOnOneLine: IndentationNodeContext => Boolean,
    TokensAreOnSameLine: () => Boolean,
    contextNode: IndentationNodeContext,
    contextNodeAllOnSameLine: js.Any,
    contextNodeBlockIsOnOneLine: js.Any,
    currentTokenParent: IndentationNodeContext,
    currentTokenSpan: TokenSpan,
    formattingRequestKind: FormattingRequestKind,
    nextNodeAllOnSameLine: js.Any,
    nextNodeBlockIsOnOneLine: js.Any,
    nextTokenParent: IndentationNodeContext,
    nextTokenSpan: TokenSpan,
    snapshot: js.Any,
    tokensAreOnSameLine: js.Any,
    updateContext: (TokenSpan, IndentationNodeContext, TokenSpan, IndentationNodeContext, IndentationNodeContext) => Unit
  ): FormattingContext = {
    val __obj = js.Dynamic.literal(BlockIsOnOneLine = js.Any.fromFunction1(BlockIsOnOneLine), ContextNodeAllOnSameLine = js.Any.fromFunction0(ContextNodeAllOnSameLine), ContextNodeBlockIsOnOneLine = js.Any.fromFunction0(ContextNodeBlockIsOnOneLine), NextNodeAllOnSameLine = js.Any.fromFunction0(NextNodeAllOnSameLine), NextNodeBlockIsOnOneLine = js.Any.fromFunction0(NextNodeBlockIsOnOneLine), NodeIsOnOneLine = js.Any.fromFunction1(NodeIsOnOneLine), TokensAreOnSameLine = js.Any.fromFunction0(TokensAreOnSameLine), contextNode = contextNode.asInstanceOf[js.Any], contextNodeAllOnSameLine = contextNodeAllOnSameLine.asInstanceOf[js.Any], contextNodeBlockIsOnOneLine = contextNodeBlockIsOnOneLine.asInstanceOf[js.Any], currentTokenParent = currentTokenParent.asInstanceOf[js.Any], currentTokenSpan = currentTokenSpan.asInstanceOf[js.Any], formattingRequestKind = formattingRequestKind.asInstanceOf[js.Any], nextNodeAllOnSameLine = nextNodeAllOnSameLine.asInstanceOf[js.Any], nextNodeBlockIsOnOneLine = nextNodeBlockIsOnOneLine.asInstanceOf[js.Any], nextTokenParent = nextTokenParent.asInstanceOf[js.Any], nextTokenSpan = nextTokenSpan.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], tokensAreOnSameLine = tokensAreOnSameLine.asInstanceOf[js.Any], updateContext = js.Any.fromFunction5(updateContext))
    __obj.asInstanceOf[FormattingContext]
  }
  @scala.inline
  implicit class FormattingContextOps[Self <: FormattingContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockIsOnOneLine(value: IndentationNodeContext => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockIsOnOneLine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContextNodeAllOnSameLine(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextNodeAllOnSameLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContextNodeBlockIsOnOneLine(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextNodeBlockIsOnOneLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextNodeAllOnSameLine(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextNodeAllOnSameLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextNodeBlockIsOnOneLine(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextNodeBlockIsOnOneLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNodeIsOnOneLine(value: IndentationNodeContext => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeIsOnOneLine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTokensAreOnSameLine(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokensAreOnSameLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContextNode(value: IndentationNodeContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTokenParent(value: IndentationNodeContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTokenParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTokenSpan(value: TokenSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTokenSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattingRequestKind(value: FormattingRequestKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattingRequestKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextTokenParent(value: IndentationNodeContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTokenParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextTokenSpan(value: TokenSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTokenSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateContext(
      value: (TokenSpan, IndentationNodeContext, TokenSpan, IndentationNodeContext, IndentationNodeContext) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateContext")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

