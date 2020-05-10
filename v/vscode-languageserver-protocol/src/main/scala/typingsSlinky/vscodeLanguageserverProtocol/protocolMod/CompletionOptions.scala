package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionOptions extends js.Object {
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
  implicit class CompletionOptionsOps[Self <: CompletionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolveProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerCharacters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCharacters")(js.undefined)
        ret
    }
  }
  
}

