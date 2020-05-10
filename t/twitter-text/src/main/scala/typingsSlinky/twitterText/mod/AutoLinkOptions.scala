package typingsSlinky.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoLinkOptions extends js.Object {
  var cashtagClass: js.UndefOr[String] = js.native
  var cashtagUrlBase: js.UndefOr[String] = js.native
  var hashtagClass: js.UndefOr[String] = js.native
  var hashtagUrlBase: js.UndefOr[String] = js.native
  var htmlAttrs: js.UndefOr[Attributes] = js.native
  var htmlEscapeNonEntities: js.UndefOr[Boolean] = js.native
  var invisibleTagAttrs: js.UndefOr[String] = js.native
  var linkAttributeBlock: js.UndefOr[js.Function2[/* entity */ EntityWithIndices, /* attributes */ Attributes, Unit]] = js.native
  var linkTextBlock: js.UndefOr[js.Function2[/* entity */ EntityWithIndices, /* text */ String, Unit]] = js.native
  var listClass: js.UndefOr[String] = js.native
  var listUrlBase: js.UndefOr[String] = js.native
  var suppressNoFollow: js.UndefOr[Boolean] = js.native
  var symbolTag: js.UndefOr[String] = js.native
  var targetBlank: js.UndefOr[Boolean] = js.native
  var textWithSymbolTag: js.UndefOr[String] = js.native
  var urlEntities: js.UndefOr[js.Array[UrlEntity]] = js.native
  var usernameClass: js.UndefOr[String] = js.native
  var usernameIncludeSymbol: js.UndefOr[Boolean] = js.native
  var usernameUrlBase: js.UndefOr[String] = js.native
}

object AutoLinkOptions {
  @scala.inline
  def apply(): AutoLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoLinkOptions]
  }
  @scala.inline
  implicit class AutoLinkOptionsOps[Self <: AutoLinkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCashtagClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cashtagClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCashtagClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cashtagClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCashtagUrlBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cashtagUrlBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCashtagUrlBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cashtagUrlBase")(js.undefined)
        ret
    }
    @scala.inline
    def withHashtagClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtagClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashtagClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtagClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHashtagUrlBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtagUrlBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashtagUrlBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtagUrlBase")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlAttrs(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlEscapeNonEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlEscapeNonEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlEscapeNonEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlEscapeNonEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withInvisibleTagAttrs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invisibleTagAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvisibleTagAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invisibleTagAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkAttributeBlock(value: (/* entity */ EntityWithIndices, /* attributes */ Attributes) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkAttributeBlock")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLinkAttributeBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkAttributeBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkTextBlock(value: (/* entity */ EntityWithIndices, /* text */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTextBlock")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLinkTextBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTextBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withListClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listClass")(js.undefined)
        ret
    }
    @scala.inline
    def withListUrlBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listUrlBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListUrlBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listUrlBase")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressNoFollow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressNoFollow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressNoFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressNoFollow")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolTag")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetBlank(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetBlank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetBlank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetBlank")(js.undefined)
        ret
    }
    @scala.inline
    def withTextWithSymbolTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textWithSymbolTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextWithSymbolTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textWithSymbolTag")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlEntities(value: js.Array[UrlEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameClass")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameIncludeSymbol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameIncludeSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameIncludeSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameIncludeSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameUrlBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameUrlBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameUrlBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameUrlBase")(js.undefined)
        ret
    }
  }
  
}

