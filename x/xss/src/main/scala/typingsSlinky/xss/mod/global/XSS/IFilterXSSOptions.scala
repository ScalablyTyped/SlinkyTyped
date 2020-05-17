package typingsSlinky.xss.mod.global.XSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilterXSSOptions extends js.Object {
  var allowCommentTag: js.UndefOr[Boolean] = js.native
  var css: js.UndefOr[js.Object | Boolean] = js.native
  var escapeHtml: js.UndefOr[EscapeHandler] = js.native
  var onIgnoreTag: js.UndefOr[OnTagHandler] = js.native
  var onIgnoreTagAttr: js.UndefOr[OnTagAttrHandler] = js.native
  var onTag: js.UndefOr[OnTagHandler] = js.native
  var onTagAttr: js.UndefOr[OnTagAttrHandler] = js.native
  var safeAttrValue: js.UndefOr[SafeAttrValueHandler] = js.native
  var stripBlankChar: js.UndefOr[Boolean] = js.native
  var stripIgnoreTag: js.UndefOr[Boolean] = js.native
  var stripIgnoreTagBody: js.UndefOr[Boolean | js.Array[String]] = js.native
  var whiteList: js.UndefOr[IWhiteList] = js.native
}

object IFilterXSSOptions {
  @scala.inline
  def apply(): IFilterXSSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterXSSOptions]
  }
  @scala.inline
  implicit class IFilterXSSOptionsOps[Self <: IFilterXSSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCommentTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCommentTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCommentTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCommentTag")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: js.Object | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeHtml(value: /* str */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEscapeHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIgnoreTag(value: (/* tag */ String, /* html */ String, /* options */ js.Object) => String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIgnoreTag")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnIgnoreTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIgnoreTag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIgnoreTagAttr(
      value: (/* tag */ String, /* name */ String, /* value */ String, /* isWhiteAttr */ Boolean) => String | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIgnoreTagAttr")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnIgnoreTagAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIgnoreTagAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTag(value: (/* tag */ String, /* html */ String, /* options */ js.Object) => String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTag")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTagAttr(
      value: (/* tag */ String, /* name */ String, /* value */ String, /* isWhiteAttr */ Boolean) => String | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTagAttr")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnTagAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTagAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeAttrValue(
      value: (/* tag */ String, /* name */ String, /* value */ String, /* cssFilter */ ICSSFilter) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeAttrValue")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutSafeAttrValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeAttrValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStripBlankChar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripBlankChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripBlankChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripBlankChar")(js.undefined)
        ret
    }
    @scala.inline
    def withStripIgnoreTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripIgnoreTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripIgnoreTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripIgnoreTag")(js.undefined)
        ret
    }
    @scala.inline
    def withStripIgnoreTagBody(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripIgnoreTagBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripIgnoreTagBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripIgnoreTagBody")(js.undefined)
        ret
    }
    @scala.inline
    def withWhiteList(value: IWhiteList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhiteList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteList")(js.undefined)
        ret
    }
  }
  
}

