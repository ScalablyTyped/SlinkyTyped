package typingsSlinky.typescriptServices.mod.Services.Formatting

import typingsSlinky.typescriptServices.TypeScript.Services.EditorOptions
import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typingsSlinky.typescriptServices.TypeScript.Services.TextEdit
import typingsSlinky.typescriptServices.TypeScript.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.FormattingManager")
@js.native
class FormattingManager protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingManager {
  def this(
    syntaxTree: SyntaxTree,
    snapshot: ITextSnapshot,
    rulesProvider: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
    editorOptions: EditorOptions
  ) = this()
  /* CompleteClass */
  override var options: js.Any = js.native
  /* CompleteClass */
  override var rulesProvider: js.Any = js.native
  /* CompleteClass */
  override var snapshot: js.Any = js.native
  /* CompleteClass */
  override var syntaxTree: js.Any = js.native
  /* CompleteClass */
  override def formatDocument(minChar: Double, limChar: Double): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def formatOnClosingCurlyBrace(caretPosition: Double): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def formatOnEnter(caretPosition: Double): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def formatOnPaste(minChar: Double, limChar: Double): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def formatOnSemicolon(caretPosition: Double): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def formatSelection(minChar: Double, limChar: Double): js.Array[TextEdit] = js.native
  /* CompleteClass */
  /* private */ override def formatSpan(span: js.Any, formattingRequestKind: js.Any): js.Any = js.native
}

