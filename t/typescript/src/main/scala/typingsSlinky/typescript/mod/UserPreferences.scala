package typingsSlinky.typescript.mod

import typingsSlinky.typescript.typescriptStrings.`non-relative`
import typingsSlinky.typescript.typescriptStrings.auto
import typingsSlinky.typescript.typescriptStrings.double
import typingsSlinky.typescript.typescriptStrings.index
import typingsSlinky.typescript.typescriptStrings.js_
import typingsSlinky.typescript.typescriptStrings.minimal
import typingsSlinky.typescript.typescriptStrings.relative
import typingsSlinky.typescript.typescriptStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPreferences extends js.Object {
  val allowTextChangesInNewFiles: js.UndefOr[Boolean] = js.native
  val disableSuggestions: js.UndefOr[Boolean] = js.native
  /** Determines whether we import `foo/index.ts` as "foo", "foo/index", or "foo/index.js" */
  val importModuleSpecifierEnding: js.UndefOr[minimal | index | js_] = js.native
  val importModuleSpecifierPreference: js.UndefOr[auto | relative | `non-relative`] = js.native
  val includeAutomaticOptionalChainCompletions: js.UndefOr[Boolean] = js.native
  val includeCompletionsForModuleExports: js.UndefOr[Boolean] = js.native
  val includeCompletionsWithInsertText: js.UndefOr[Boolean] = js.native
  val providePrefixAndSuffixTextForRename: js.UndefOr[Boolean] = js.native
  val quotePreference: js.UndefOr[auto | double | single] = js.native
}

object UserPreferences {
  @scala.inline
  def apply(): UserPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPreferences]
  }
  @scala.inline
  implicit class UserPreferencesOps[Self <: UserPreferences] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowTextChangesInNewFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTextChangesInNewFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTextChangesInNewFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTextChangesInNewFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withImportModuleSpecifierEnding(value: minimal | index | js_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importModuleSpecifierEnding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportModuleSpecifierEnding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importModuleSpecifierEnding")(js.undefined)
        ret
    }
    @scala.inline
    def withImportModuleSpecifierPreference(value: auto | relative | `non-relative`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importModuleSpecifierPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportModuleSpecifierPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importModuleSpecifierPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeAutomaticOptionalChainCompletions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAutomaticOptionalChainCompletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAutomaticOptionalChainCompletions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAutomaticOptionalChainCompletions")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeCompletionsForModuleExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCompletionsForModuleExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeCompletionsForModuleExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCompletionsForModuleExports")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeCompletionsWithInsertText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCompletionsWithInsertText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeCompletionsWithInsertText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCompletionsWithInsertText")(js.undefined)
        ret
    }
    @scala.inline
    def withProvidePrefixAndSuffixTextForRename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providePrefixAndSuffixTextForRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvidePrefixAndSuffixTextForRename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providePrefixAndSuffixTextForRename")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotePreference(value: auto | double | single): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotePreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotePreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotePreference")(js.undefined)
        ret
    }
  }
  
}

