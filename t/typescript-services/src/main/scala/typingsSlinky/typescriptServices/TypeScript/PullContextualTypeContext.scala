package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullContextualTypeContext extends js.Object {
  var astSymbolMap: js.Any = js.native
  var contextualType: PullTypeSymbol = js.native
  var hasProvisionalErrors: Boolean = js.native
  var isInferentiallyTyping: Boolean = js.native
  var provisional: Boolean = js.native
  var provisionallyTypedSymbols: js.Array[PullSymbol] = js.native
  var typeArgumentInferenceContext: TypeArgumentInferenceContext = js.native
  def getSymbolForAST(ast: AST): PullSymbol = js.native
  def invalidateProvisionallyTypedSymbols(): Unit = js.native
  def recordProvisionallyTypedSymbol(symbol: PullSymbol): Unit = js.native
  def setSymbolForAST(ast: AST, symbol: PullSymbol): Unit = js.native
}

object PullContextualTypeContext {
  @scala.inline
  def apply(
    astSymbolMap: js.Any,
    contextualType: PullTypeSymbol,
    getSymbolForAST: AST => PullSymbol,
    hasProvisionalErrors: Boolean,
    invalidateProvisionallyTypedSymbols: () => Unit,
    isInferentiallyTyping: Boolean,
    provisional: Boolean,
    provisionallyTypedSymbols: js.Array[PullSymbol],
    recordProvisionallyTypedSymbol: PullSymbol => Unit,
    setSymbolForAST: (AST, PullSymbol) => Unit,
    typeArgumentInferenceContext: TypeArgumentInferenceContext
  ): PullContextualTypeContext = {
    val __obj = js.Dynamic.literal(astSymbolMap = astSymbolMap.asInstanceOf[js.Any], contextualType = contextualType.asInstanceOf[js.Any], getSymbolForAST = js.Any.fromFunction1(getSymbolForAST), hasProvisionalErrors = hasProvisionalErrors.asInstanceOf[js.Any], invalidateProvisionallyTypedSymbols = js.Any.fromFunction0(invalidateProvisionallyTypedSymbols), isInferentiallyTyping = isInferentiallyTyping.asInstanceOf[js.Any], provisional = provisional.asInstanceOf[js.Any], provisionallyTypedSymbols = provisionallyTypedSymbols.asInstanceOf[js.Any], recordProvisionallyTypedSymbol = js.Any.fromFunction1(recordProvisionallyTypedSymbol), setSymbolForAST = js.Any.fromFunction2(setSymbolForAST), typeArgumentInferenceContext = typeArgumentInferenceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullContextualTypeContext]
  }
  @scala.inline
  implicit class PullContextualTypeContextOps[Self <: PullContextualTypeContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAstSymbolMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astSymbolMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextualType(value: PullTypeSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSymbolForAST(value: AST => PullSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSymbolForAST")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasProvisionalErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasProvisionalErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidateProvisionallyTypedSymbols(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidateProvisionallyTypedSymbols")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInferentiallyTyping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInferentiallyTyping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisionallyTypedSymbols(value: js.Array[PullSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisionallyTypedSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordProvisionallyTypedSymbol(value: PullSymbol => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordProvisionallyTypedSymbol")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSymbolForAST(value: (AST, PullSymbol) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSymbolForAST")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTypeArgumentInferenceContext(value: TypeArgumentInferenceContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeArgumentInferenceContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

