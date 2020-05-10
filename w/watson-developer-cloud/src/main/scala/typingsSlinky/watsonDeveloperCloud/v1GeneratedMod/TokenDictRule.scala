package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object defining a single tokenizaion rule. */
@js.native
trait TokenDictRule extends js.Object {
  /** The part of speech that the `text` string belongs to. For example `noun`. Custom parts of speech can be specified. */
  var part_of_speech: String = js.native
  /** Array of tokens that represent the content of the `text` field in an alternate character set. */
  var readings: js.UndefOr[js.Array[String]] = js.native
  /** The string to tokenize. */
  var text: String = js.native
  /** Array of tokens that the `text` field is split into when found. */
  var tokens: js.Array[String] = js.native
}

object TokenDictRule {
  @scala.inline
  def apply(part_of_speech: String, text: String, tokens: js.Array[String]): TokenDictRule = {
    val __obj = js.Dynamic.literal(part_of_speech = part_of_speech.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenDictRule]
  }
  @scala.inline
  implicit class TokenDictRuleOps[Self <: TokenDictRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPart_of_speech(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part_of_speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokens(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readings")(js.undefined)
        ret
    }
  }
  
}

