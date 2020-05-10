package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCompletionsAtPositionOptions extends UserPreferences {
  /** @deprecated Use includeCompletionsForModuleExports */
  var includeExternalModuleExports: js.UndefOr[Boolean] = js.native
  /** @deprecated Use includeCompletionsWithInsertText */
  var includeInsertTextCompletions: js.UndefOr[Boolean] = js.native
  /**
    * If the editor is asking for completions because a certain character was typed
    * (as opposed to when the user explicitly requested them) this should be set.
    */
  var triggerCharacter: js.UndefOr[CompletionsTriggerCharacter] = js.native
}

object GetCompletionsAtPositionOptions {
  @scala.inline
  def apply(): GetCompletionsAtPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompletionsAtPositionOptions]
  }
  @scala.inline
  implicit class GetCompletionsAtPositionOptionsOps[Self <: GetCompletionsAtPositionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeExternalModuleExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExternalModuleExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeExternalModuleExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExternalModuleExports")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeInsertTextCompletions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInsertTextCompletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeInsertTextCompletions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInsertTextCompletions")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerCharacter(value: CompletionsTriggerCharacter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCharacter")(js.undefined)
        ret
    }
  }
  
}

