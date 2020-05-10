package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TokenResult. */
@js.native
trait TokenResult extends js.Object {
  /** The [lemma](https://wikipedia.org/wiki/Lemma_%28morphology%29) of the token. */
  var lemma: js.UndefOr[String] = js.native
  /** Character offsets indicating the beginning and end of the token in the analyzed text. */
  var location: js.UndefOr[js.Array[Double]] = js.native
  /** The part of speech of the token. For descriptions of the values, see [Universal Dependencies POS tags](https://universaldependencies.org/u/pos/). */
  var part_of_speech: js.UndefOr[String] = js.native
  /** The token as it appears in the analyzed text. */
  var text: js.UndefOr[String] = js.native
}

object TokenResult {
  @scala.inline
  def apply(): TokenResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenResult]
  }
  @scala.inline
  implicit class TokenResultOps[Self <: TokenResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLemma(value: String): Self = {
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
    def withLocation(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPart_of_speech(value: String): Self = {
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
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

