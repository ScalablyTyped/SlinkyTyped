package typingsSlinky.vscode.mod

import typingsSlinky.vscode.anon.Inserting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "CompletionItem")
@js.native
class CompletionItem protected () extends StObject {
  /**
    * Creates a new completion item.
    *
    * Completion items must have at least a [label](#CompletionItem.label) which then
    * will be used as insert text as well as for sorting and filtering.
    *
    * @param label The label of the completion.
    * @param kind The [kind](#CompletionItemKind) of the completion.
    */
  def this(label: String) = this()
  def this(label: String, kind: CompletionItemKind) = this()
  
  /**
    * An optional array of additional [text edits](#TextEdit) that are applied when
    * selecting this completion. Edits must not overlap with the main [edit](#CompletionItem.textEdit)
    * nor with themselves.
    */
  var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.native
  
  /**
    * An optional [command](#Command) that is executed *after* inserting this completion. *Note* that
    * additional modifications to the current document should be described with the
    * [additionalTextEdits](#CompletionItem.additionalTextEdits)-property.
    */
  var command: js.UndefOr[Command] = js.native
  
  /**
    * An optional set of characters that when pressed while this completion is active will accept it first and
    * then type that character. *Note* that all commit characters should have `length=1` and that superfluous
    * characters will be ignored.
    */
  var commitCharacters: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A human-readable string with additional information
    * about this item, like type or symbol information.
    */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * A human-readable string that represents a doc-comment.
    */
  var documentation: js.UndefOr[String | MarkdownString] = js.native
  
  /**
    * A string that should be used when filtering a set of
    * completion items. When `falsy` the [label](#CompletionItem.label)
    * is used.
    *
    * Note that the filter text is matched against the leading word (prefix) which is defined
    * by the [`range`](#CompletionItem.range)-property.
    * prefix.
    */
  var filterText: js.UndefOr[String] = js.native
  
  /**
    * A string or snippet that should be inserted in a document when selecting
    * this completion. When `falsy` the [label](#CompletionItem.label)
    * is used.
    */
  var insertText: js.UndefOr[String | SnippetString] = js.native
  
  /**
    * Keep whitespace of the [insertText](#CompletionItem.insertText) as is. By default, the editor adjusts leading
    * whitespace of new lines so that they match the indentation of the line for which the item is accepted - setting
    * this to `true` will prevent that.
    */
  var keepWhitespace: js.UndefOr[Boolean] = js.native
  
  /**
    * The kind of this completion item. Based on the kind
    * an icon is chosen by the editor.
    */
  var kind: js.UndefOr[CompletionItemKind] = js.native
  
  /**
    * The label of this completion item. By default
    * this is also the text that is inserted when selecting
    * this completion.
    */
  var label: String = js.native
  
  /**
    * Select this item when showing. *Note* that only one completion item can be selected and
    * that the editor decides which item that is. The rule is that the *first* item of those
    * that match best is selected.
    */
  var preselect: js.UndefOr[Boolean] = js.native
  
  /**
    * A range or a insert and replace range selecting the text that should be replaced by this completion item.
    *
    * When omitted, the range of the [current word](#TextDocument.getWordRangeAtPosition) is used as replace-range
    * and as insert-range the start of the [current word](#TextDocument.getWordRangeAtPosition) to the
    * current position is used.
    *
    * *Note 1:* A range must be a [single line](#Range.isSingleLine) and it must
    * [contain](#Range.contains) the position at which completion has been [requested](#CompletionItemProvider.provideCompletionItems).
    * *Note 2:* A insert range must be a prefix of a replace range, that means it must be contained and starting at the same position.
    */
  var range: js.UndefOr[Range | Inserting] = js.native
  
  /**
    * A string that should be used when comparing this item
    * with other items. When `falsy` the [label](#CompletionItem.label)
    * is used.
    *
    * Note that `sortText` is only used for the initial ordering of completion
    * items. When having a leading word (prefix) ordering is based on how
    * well completion match that prefix and the initial ordering is only used
    * when completions match equal. The prefix is defined by the
    * [`range`](#CompletionItem.range)-property and can therefore be different
    * for each completion.
    */
  var sortText: js.UndefOr[String] = js.native
  
  /**
    * Tags for this completion item.
    */
  var tags: js.UndefOr[js.Array[CompletionItemTag]] = js.native
  
  /**
    * @deprecated Use `CompletionItem.insertText` and `CompletionItem.range` instead.
    *
    * An [edit](#TextEdit) which is applied to a document when selecting
    * this completion. When an edit is provided the value of
    * [insertText](#CompletionItem.insertText) is ignored.
    *
    * The [range](#Range) of the edit must be single-line and on the same
    * line completions were [requested](#CompletionItemProvider.provideCompletionItems) at.
    */
  var textEdit: js.UndefOr[TextEdit] = js.native
}
