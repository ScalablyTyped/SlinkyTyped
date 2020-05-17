package typingsSlinky.vscode.mod

import typingsSlinky.vscode.anon.AutoClosingPairs
import typingsSlinky.vscode.anon.Brackets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageConfiguration extends js.Object {
  /**
  		 * **Deprecated** Do not use.
  		 *
  		 * @deprecated * Use the autoClosingPairs property in the language configuration file instead.
  		 */
  var __characterPairSupport: js.UndefOr[AutoClosingPairs] = js.native
  /**
  		 * **Deprecated** Do not use.
  		 *
  		 * @deprecated Will be replaced by a better API soon.
  		 */
  var __electricCharacterSupport: js.UndefOr[Brackets] = js.native
  /**
  		 * The language's brackets.
  		 * This configuration implicitly affects pressing Enter around these brackets.
  		 */
  var brackets: js.UndefOr[js.Array[CharacterPair]] = js.native
  /**
  		 * The language's comment settings.
  		 */
  var comments: js.UndefOr[CommentRule] = js.native
  /**
  		 * The language's indentation settings.
  		 */
  var indentationRules: js.UndefOr[IndentationRule] = js.native
  /**
  		 * The language's rules to be evaluated when pressing Enter.
  		 */
  var onEnterRules: js.UndefOr[js.Array[OnEnterRule]] = js.native
  /**
  		 * The language's word definition.
  		 * If the language supports Unicode identifiers (e.g. JavaScript), it is preferable
  		 * to provide a word definition that uses exclusion of known separators.
  		 * e.g.: A regex that matches anything except known separators (and dot is allowed to occur in a floating point number):
  		 *   /(-?\d*\.\d\w*)|([^\`\~\!\@\#\%\^\&\*\(\)\-\=\+\[\{\]\}\\\|\;\:\'\"\,\.\<\>\/\?\s]+)/g
  		 */
  var wordPattern: js.UndefOr[js.RegExp] = js.native
}

object LanguageConfiguration {
  @scala.inline
  def apply(): LanguageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageConfiguration]
  }
  @scala.inline
  implicit class LanguageConfigurationOps[Self <: LanguageConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__characterPairSupport(value: AutoClosingPairs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__characterPairSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__characterPairSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__characterPairSupport")(js.undefined)
        ret
    }
    @scala.inline
    def with__electricCharacterSupport(value: Brackets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__electricCharacterSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__electricCharacterSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__electricCharacterSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withBrackets(value: js.Array[CharacterPair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brackets")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: CommentRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentationRules(value: IndentationRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentationRules")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnterRules(value: js.Array[OnEnterRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnterRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterRules")(js.undefined)
        ret
    }
    @scala.inline
    def withWordPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordPattern")(js.undefined)
        ret
    }
  }
  
}

