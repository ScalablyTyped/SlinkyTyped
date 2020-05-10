package typingsSlinky.setCookieParser

import typingsSlinky.setCookieParser.setCookieParserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined set-cookie-parser.set-cookie-parser.Options & {  map ? :false} */
@js.native
trait Optionsmapfalse extends js.Object {
  var decodeValues: js.UndefOr[Boolean] = js.native
  var map: js.UndefOr[Boolean with `false`] = js.native
}

object Optionsmapfalse {
  @scala.inline
  def apply(): Optionsmapfalse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optionsmapfalse]
  }
  @scala.inline
  implicit class OptionsmapfalseOps[Self <: Optionsmapfalse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecodeValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecodeValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeValues")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: Boolean with `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
  }
  
}

