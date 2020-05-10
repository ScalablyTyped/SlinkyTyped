package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Js2SvgOptions extends js.Object {
  /** @default '"' */
  var attrEnd: js.UndefOr[String] = js.native
  /** @default '="' */
  var attrStart: js.UndefOr[String] = js.native
  /** @default ']]>' */
  var cdataEnd: js.UndefOr[String] = js.native
  /** @default '<![CDATA[' */
  var cdataStart: js.UndefOr[String] = js.native
  /** @default '-->' */
  var commentEnd: js.UndefOr[String] = js.native
  /** @default '<!--' */
  var commentStart: js.UndefOr[String] = js.native
  /** @default '>' */
  var doctypeEnd: js.UndefOr[String] = js.native
  /** @default '<!DOCTYPE' */
  var doctypeStart: js.UndefOr[String] = js.native
  /** @default encodeEntity */
  var encodeEntity: js.UndefOr[js.Function1[/* char */ js.UndefOr[String], String]] = js.native
  /** @default 4 */
  var indent: js.UndefOr[Double] = js.native
  /** @default false */
  var pretty: js.UndefOr[Boolean] = js.native
  /** @default '?>' */
  var procInstEnd: js.UndefOr[String] = js.native
  /** @default '<?' */
  var procInstStart: js.UndefOr[String] = js.native
  /** @default /[&'"<>]/g */
  var regEntities: js.UndefOr[js.RegExp] = js.native
  /** @default /[&"<>]/g */
  var regValEntities: js.UndefOr[js.RegExp] = js.native
  /** @default '>' */
  var tagCloseEnd: js.UndefOr[String] = js.native
  /** @default '</' */
  var tagCloseStart: js.UndefOr[String] = js.native
  /** @default '>' */
  var tagOpenEnd: js.UndefOr[String] = js.native
  /** @default '<' */
  var tagOpenStart: js.UndefOr[String] = js.native
  /** @default '/>' */
  var tagShortEnd: js.UndefOr[String] = js.native
  /** @default '<' */
  var tagShortStart: js.UndefOr[String] = js.native
  /** @default '' */
  var textEnd: js.UndefOr[String] = js.native
  /** @default '' */
  var textStart: js.UndefOr[String] = js.native
  /** @default true */
  var useShortTags: js.UndefOr[Boolean] = js.native
}

object Js2SvgOptions {
  @scala.inline
  def apply(): Js2SvgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Js2SvgOptions]
  }
  @scala.inline
  implicit class Js2SvgOptionsOps[Self <: Js2SvgOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrStart")(js.undefined)
        ret
    }
    @scala.inline
    def withCdataEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdataEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withCdataStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdataStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataStart")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDoctypeEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctypeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoctypeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctypeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDoctypeStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctypeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoctypeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctypeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeEntity(value: /* char */ js.UndefOr[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeEntity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncodeEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeEntity")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withPretty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(js.undefined)
        ret
    }
    @scala.inline
    def withProcInstEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procInstEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcInstEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procInstEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withProcInstStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procInstStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcInstStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procInstStart")(js.undefined)
        ret
    }
    @scala.inline
    def withRegEntities(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withRegValEntities(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regValEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegValEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regValEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withTagCloseEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagCloseEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagCloseEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagCloseEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTagCloseStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagCloseStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagCloseStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagCloseStart")(js.undefined)
        ret
    }
    @scala.inline
    def withTagOpenEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagOpenEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagOpenEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagOpenEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTagOpenStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagOpenStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagOpenStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagOpenStart")(js.undefined)
        ret
    }
    @scala.inline
    def withTagShortEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagShortEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagShortEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagShortEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTagShortStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagShortStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagShortStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagShortStart")(js.undefined)
        ret
    }
    @scala.inline
    def withTextEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStart")(js.undefined)
        ret
    }
    @scala.inline
    def withUseShortTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useShortTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseShortTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useShortTags")(js.undefined)
        ret
    }
  }
  
}

