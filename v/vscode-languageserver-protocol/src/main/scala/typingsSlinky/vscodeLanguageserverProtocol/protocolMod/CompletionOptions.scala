package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionOptions extends WorkDoneProgressOptions {
  
  /**
    * The list of all possible characters that commit a completion. This field can be used
    * if clients don't support individual commmit characters per completion item. See
    * `ClientCapabilities.textDocument.completion.completionItem.commitCharactersSupport`
    *
    * If a server provides both `allCommitCharacters` and commit characters on an individual
    * completion item the ones on the completion item win.
    *
    * @since 3.2.0
    */
  var allCommitCharacters: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The server provides support to resolve additional
    * information for a completion item.
    */
  var resolveProvider: js.UndefOr[Boolean] = js.native
  
  /**
    * Most tools trigger completion request automatically without explicitly requesting
    * it using a keyboard shortcut (e.g. Ctrl+Space). Typically they do so when the user
    * starts to type an identifier. For example if the user types `c` in a JavaScript file
    * code complete will automatically pop up present `console` besides others as a
    * completion item. Characters that make up identifiers don't need to be listed here.
    *
    * If code complete should automatically be trigger on characters not being valid inside
    * an identifier (for example `.` in JavaScript) list them in `triggerCharacters`.
    */
  var triggerCharacters: js.UndefOr[js.Array[String]] = js.native
}
object CompletionOptions {
  
  @scala.inline
  def apply(): CompletionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletionOptions]
  }
  
  @scala.inline
  implicit class CompletionOptionsMutableBuilder[Self <: CompletionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllCommitCharacters(value: js.Array[String]): Self = StObject.set(x, "allCommitCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllCommitCharactersUndefined: Self = StObject.set(x, "allCommitCharacters", js.undefined)
    
    @scala.inline
    def setAllCommitCharactersVarargs(value: String*): Self = StObject.set(x, "allCommitCharacters", js.Array(value :_*))
    
    @scala.inline
    def setResolveProvider(value: Boolean): Self = StObject.set(x, "resolveProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveProviderUndefined: Self = StObject.set(x, "resolveProvider", js.undefined)
    
    @scala.inline
    def setTriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "triggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharactersUndefined: Self = StObject.set(x, "triggerCharacters", js.undefined)
    
    @scala.inline
    def setTriggerCharactersVarargs(value: String*): Self = StObject.set(x, "triggerCharacters", js.Array(value :_*))
  }
}
