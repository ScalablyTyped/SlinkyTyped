package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tokenization options. */
@js.native
trait SyntaxOptionsTokens extends js.Object {
  /** Set this to `true` to return the lemma for each token. */
  var lemma: js.UndefOr[Boolean] = js.native
  /** Set this to `true` to return the part of speech for each token. */
  var part_of_speech: js.UndefOr[Boolean] = js.native
}

object SyntaxOptionsTokens {
  @scala.inline
  def apply(): SyntaxOptionsTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxOptionsTokens]
  }
  @scala.inline
  implicit class SyntaxOptionsTokensOps[Self <: SyntaxOptionsTokens] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLemma(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lemma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLemma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lemma")(js.undefined)
        ret
    }
    @scala.inline
    def withPart_of_speech(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part_of_speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPart_of_speech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part_of_speech")(js.undefined)
        ret
    }
  }
  
}

