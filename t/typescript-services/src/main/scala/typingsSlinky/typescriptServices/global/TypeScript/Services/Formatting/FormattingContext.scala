package typingsSlinky.typescriptServices.global.TypeScript.Services.Formatting

import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.FormattingContext")
@js.native
class FormattingContext protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext {
  def this(
    snapshot: ITextSnapshot,
    formattingRequestKind: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind
  ) = this()
  /* CompleteClass */
  override var contextNode: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
  /* CompleteClass */
  override var contextNodeAllOnSameLine: js.Any = js.native
  /* CompleteClass */
  override var contextNodeBlockIsOnOneLine: js.Any = js.native
  /* CompleteClass */
  override var currentTokenParent: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
  /* CompleteClass */
  override var currentTokenSpan: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.TokenSpan = js.native
  /* CompleteClass */
  override var formattingRequestKind: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind = js.native
  /* CompleteClass */
  override var nextNodeAllOnSameLine: js.Any = js.native
  /* CompleteClass */
  override var nextNodeBlockIsOnOneLine: js.Any = js.native
  /* CompleteClass */
  override var nextTokenParent: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
  /* CompleteClass */
  override var nextTokenSpan: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.TokenSpan = js.native
  /* CompleteClass */
  override var snapshot: js.Any = js.native
  /* CompleteClass */
  override var tokensAreOnSameLine: js.Any = js.native
  /* CompleteClass */
  override def BlockIsOnOneLine(node: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
  /* CompleteClass */
  override def ContextNodeAllOnSameLine(): Boolean = js.native
  /* CompleteClass */
  override def ContextNodeBlockIsOnOneLine(): Boolean = js.native
  /* CompleteClass */
  override def NextNodeAllOnSameLine(): Boolean = js.native
  /* CompleteClass */
  override def NextNodeBlockIsOnOneLine(): Boolean = js.native
  /* CompleteClass */
  override def NodeIsOnOneLine(node: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
  /* CompleteClass */
  override def TokensAreOnSameLine(): Boolean = js.native
  /* CompleteClass */
  override def updateContext(
    currentTokenSpan: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.TokenSpan,
    currentTokenParent: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
    nextTokenSpan: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.TokenSpan,
    nextTokenParent: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
    commonParent: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext
  ): Unit = js.native
}

