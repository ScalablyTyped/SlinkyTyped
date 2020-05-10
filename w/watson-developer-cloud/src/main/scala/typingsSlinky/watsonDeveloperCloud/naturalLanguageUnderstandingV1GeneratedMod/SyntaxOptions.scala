package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns tokens and sentences from the input text. */
@js.native
trait SyntaxOptions extends js.Object {
  /** Set this to `true` to return sentence information. */
  var sentences: js.UndefOr[Boolean] = js.native
  /** Tokenization options. */
  var tokens: js.UndefOr[SyntaxOptionsTokens] = js.native
}

object SyntaxOptions {
  @scala.inline
  def apply(): SyntaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxOptions]
  }
  @scala.inline
  implicit class SyntaxOptionsOps[Self <: SyntaxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSentences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentences")(js.undefined)
        ret
    }
    @scala.inline
    def withTokens(value: SyntaxOptionsTokens): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(js.undefined)
        ret
    }
  }
  
}

