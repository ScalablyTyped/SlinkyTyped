package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullContextualTypeContext")
@js.native
class PullContextualTypeContext protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PullContextualTypeContext {
  def this(
    contextualType: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    provisional: Boolean,
    isInferentiallyTyping: Boolean,
    typeArgumentInferenceContext: typingsSlinky.typescriptServices.TypeScript.TypeArgumentInferenceContext
  ) = this()
  /* CompleteClass */
  override var astSymbolMap: js.Any = js.native
  /* CompleteClass */
  override var contextualType: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol = js.native
  /* CompleteClass */
  override var hasProvisionalErrors: Boolean = js.native
  /* CompleteClass */
  override var isInferentiallyTyping: Boolean = js.native
  /* CompleteClass */
  override var provisional: Boolean = js.native
  /* CompleteClass */
  override var provisionallyTypedSymbols: js.Array[typingsSlinky.typescriptServices.TypeScript.PullSymbol] = js.native
  /* CompleteClass */
  override var typeArgumentInferenceContext: typingsSlinky.typescriptServices.TypeScript.TypeArgumentInferenceContext = js.native
  /* CompleteClass */
  override def getSymbolForAST(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.PullSymbol = js.native
  /* CompleteClass */
  override def invalidateProvisionallyTypedSymbols(): Unit = js.native
  /* CompleteClass */
  override def recordProvisionallyTypedSymbol(symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol): Unit = js.native
  /* CompleteClass */
  override def setSymbolForAST(
    ast: typingsSlinky.typescriptServices.TypeScript.AST,
    symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol
  ): Unit = js.native
}

