package typingsSlinky.xss.mod._Global_.XSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWhiteList extends js.Object {
  var a: js.UndefOr[js.Array[String]] = js.native
  var abbr: js.UndefOr[js.Array[String]] = js.native
  var address: js.UndefOr[js.Array[String]] = js.native
  var area: js.UndefOr[js.Array[String]] = js.native
  var article: js.UndefOr[js.Array[String]] = js.native
  var aside: js.UndefOr[js.Array[String]] = js.native
  var audio: js.UndefOr[js.Array[String]] = js.native
  var b: js.UndefOr[js.Array[String]] = js.native
  var bdi: js.UndefOr[js.Array[String]] = js.native
  var bdo: js.UndefOr[js.Array[String]] = js.native
  var big: js.UndefOr[js.Array[String]] = js.native
  var blockquote: js.UndefOr[js.Array[String]] = js.native
  var br: js.UndefOr[js.Array[String]] = js.native
  var caption: js.UndefOr[js.Array[String]] = js.native
  var center: js.UndefOr[js.Array[String]] = js.native
  var cite: js.UndefOr[js.Array[String]] = js.native
  var code: js.UndefOr[js.Array[String]] = js.native
  var col: js.UndefOr[js.Array[String]] = js.native
  var colgroup: js.UndefOr[js.Array[String]] = js.native
  var dd: js.UndefOr[js.Array[String]] = js.native
  var del: js.UndefOr[js.Array[String]] = js.native
  var details: js.UndefOr[js.Array[String]] = js.native
  var div: js.UndefOr[js.Array[String]] = js.native
  var dl: js.UndefOr[js.Array[String]] = js.native
  var dt: js.UndefOr[js.Array[String]] = js.native
  var em: js.UndefOr[js.Array[String]] = js.native
  var font: js.UndefOr[js.Array[String]] = js.native
  var footer: js.UndefOr[js.Array[String]] = js.native
  var h1: js.UndefOr[js.Array[String]] = js.native
  var h2: js.UndefOr[js.Array[String]] = js.native
  var h3: js.UndefOr[js.Array[String]] = js.native
  var h4: js.UndefOr[js.Array[String]] = js.native
  var h5: js.UndefOr[js.Array[String]] = js.native
  var h6: js.UndefOr[js.Array[String]] = js.native
  var header: js.UndefOr[js.Array[String]] = js.native
  var hr: js.UndefOr[js.Array[String]] = js.native
  var i: js.UndefOr[js.Array[String]] = js.native
  var img: js.UndefOr[js.Array[String]] = js.native
  var ins: js.UndefOr[js.Array[String]] = js.native
  var li: js.UndefOr[js.Array[String]] = js.native
  var mark: js.UndefOr[js.Array[String]] = js.native
  var nav: js.UndefOr[js.Array[String]] = js.native
  var ol: js.UndefOr[js.Array[String]] = js.native
  var p: js.UndefOr[js.Array[String]] = js.native
  var pre: js.UndefOr[js.Array[String]] = js.native
  var s: js.UndefOr[js.Array[String]] = js.native
  var section: js.UndefOr[js.Array[String]] = js.native
  var small: js.UndefOr[js.Array[String]] = js.native
  var span: js.UndefOr[js.Array[String]] = js.native
  var strong: js.UndefOr[js.Array[String]] = js.native
  var sub: js.UndefOr[js.Array[String]] = js.native
  var sup: js.UndefOr[js.Array[String]] = js.native
  var table: js.UndefOr[js.Array[String]] = js.native
  var tbody: js.UndefOr[js.Array[String]] = js.native
  var td: js.UndefOr[js.Array[String]] = js.native
  var tfoot: js.UndefOr[js.Array[String]] = js.native
  var th: js.UndefOr[js.Array[String]] = js.native
  var thead: js.UndefOr[js.Array[String]] = js.native
  var tr: js.UndefOr[js.Array[String]] = js.native
  var tt: js.UndefOr[js.Array[String]] = js.native
  var u: js.UndefOr[js.Array[String]] = js.native
  var ul: js.UndefOr[js.Array[String]] = js.native
  var video: js.UndefOr[js.Array[String]] = js.native
}

object IWhiteList {
  @scala.inline
  def apply(): IWhiteList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWhiteList]
  }
  @scala.inline
  implicit class IWhiteListOps[Self <: IWhiteList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(js.undefined)
        ret
    }
    @scala.inline
    def withAbbr(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbbr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbr")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withArea(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withArticle(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArticle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article")(js.undefined)
        ret
    }
    @scala.inline
    def withAside(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aside")(js.undefined)
        ret
    }
    @scala.inline
    def withAudio(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(js.undefined)
        ret
    }
    @scala.inline
    def withBdi(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bdi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBdi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bdi")(js.undefined)
        ret
    }
    @scala.inline
    def withBdo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bdo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBdo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bdo")(js.undefined)
        ret
    }
    @scala.inline
    def withBig(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("big")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("big")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockquote(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockquote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockquote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockquote")(js.undefined)
        ret
    }
    @scala.inline
    def withBr(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withCite(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cite")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withCol(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(js.undefined)
        ret
    }
    @scala.inline
    def withColgroup(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colgroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColgroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colgroup")(js.undefined)
        ret
    }
    @scala.inline
    def withDd(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(js.undefined)
        ret
    }
    @scala.inline
    def withDel(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withDiv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("div")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("div")(js.undefined)
        ret
    }
    @scala.inline
    def withDl(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dl")(js.undefined)
        ret
    }
    @scala.inline
    def withDt(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dt")(js.undefined)
        ret
    }
    @scala.inline
    def withEm(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("em")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("em")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withH1(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h1")(js.undefined)
        ret
    }
    @scala.inline
    def withH2(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h2")(js.undefined)
        ret
    }
    @scala.inline
    def withH3(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h3")(js.undefined)
        ret
    }
    @scala.inline
    def withH4(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h4")(js.undefined)
        ret
    }
    @scala.inline
    def withH5(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h5")(js.undefined)
        ret
    }
    @scala.inline
    def withH6(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h6")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHr(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hr")(js.undefined)
        ret
    }
    @scala.inline
    def withI(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(js.undefined)
        ret
    }
    @scala.inline
    def withImg(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(js.undefined)
        ret
    }
    @scala.inline
    def withIns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ins")(js.undefined)
        ret
    }
    @scala.inline
    def withLi(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("li")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("li")(js.undefined)
        ret
    }
    @scala.inline
    def withMark(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(js.undefined)
        ret
    }
    @scala.inline
    def withNav(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(js.undefined)
        ret
    }
    @scala.inline
    def withOl(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ol")(js.undefined)
        ret
    }
    @scala.inline
    def withP(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(js.undefined)
        ret
    }
    @scala.inline
    def withPre(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.undefined)
        ret
    }
    @scala.inline
    def withS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(js.undefined)
        ret
    }
    @scala.inline
    def withSection(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(js.undefined)
        ret
    }
    @scala.inline
    def withSmall(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(js.undefined)
        ret
    }
    @scala.inline
    def withSpan(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(js.undefined)
        ret
    }
    @scala.inline
    def withStrong(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(js.undefined)
        ret
    }
    @scala.inline
    def withSub(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(js.undefined)
        ret
    }
    @scala.inline
    def withSup(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sup")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withTbody(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTbody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbody")(js.undefined)
        ret
    }
    @scala.inline
    def withTd(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("td")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("td")(js.undefined)
        ret
    }
    @scala.inline
    def withTfoot(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTfoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfoot")(js.undefined)
        ret
    }
    @scala.inline
    def withTh(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("th")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("th")(js.undefined)
        ret
    }
    @scala.inline
    def withThead(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thead")(js.undefined)
        ret
    }
    @scala.inline
    def withTr(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(js.undefined)
        ret
    }
    @scala.inline
    def withTt(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tt")(js.undefined)
        ret
    }
    @scala.inline
    def withU(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutU: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u")(js.undefined)
        ret
    }
    @scala.inline
    def withUl(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
  }
  
}

