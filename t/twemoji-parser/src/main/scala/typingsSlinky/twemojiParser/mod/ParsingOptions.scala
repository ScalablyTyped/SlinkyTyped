package typingsSlinky.twemojiParser.mod

import typingsSlinky.twemojiParser.twemojiParserStrings.png
import typingsSlinky.twemojiParser.twemojiParserStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsingOptions extends js.Object {
  /**
    * @default 'svg'
    */
  var assetType: js.UndefOr[png | svg] = js.native
  var buildUrl: js.UndefOr[js.Function2[/* codepoints */ String, /* assetType */ String, String]] = js.native
}

object ParsingOptions {
  @scala.inline
  def apply(): ParsingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsingOptions]
  }
  @scala.inline
  implicit class ParsingOptionsOps[Self <: ParsingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetType(value: png | svg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetType")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildUrl(value: (/* codepoints */ String, /* assetType */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildUrl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBuildUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildUrl")(js.undefined)
        ret
    }
  }
  
}

