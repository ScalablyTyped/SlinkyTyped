package typingsSlinky.textversionjs.mod

import typingsSlinky.textversionjs.textversionjsStrings.hashify
import typingsSlinky.textversionjs.textversionjsStrings.indentation
import typingsSlinky.textversionjs.textversionjsStrings.linebreak
import typingsSlinky.textversionjs.textversionjsStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait styleConfig extends js.Object {
  var headingStyle: js.UndefOr[underline | linebreak | hashify] = js.native
  var imgProcess: js.UndefOr[typingsSlinky.textversionjs.mod.imgProcess] = js.native
  var keepNbsps: js.UndefOr[Boolean] = js.native
  var linkProcess: js.UndefOr[typingsSlinky.textversionjs.mod.linkProcess] = js.native
  var listIndentionTabs: js.UndefOr[Double] = js.native
  var listStyle: js.UndefOr[indentation | linebreak] = js.native
  var oIndentionChar: js.UndefOr[String] = js.native
  var uIndentionChar: js.UndefOr[String] = js.native
}

object styleConfig {
  @scala.inline
  def apply(): styleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[styleConfig]
  }
  @scala.inline
  implicit class styleConfigOps[Self <: styleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeadingStyle(value: underline | linebreak | hashify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadingStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withImgProcess(value: (/* src */ String, /* alt */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgProcess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutImgProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepNbsps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNbsps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepNbsps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNbsps")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkProcess(value: (/* href */ String, /* linkText */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkProcess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLinkProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withListIndentionTabs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listIndentionTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListIndentionTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listIndentionTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withListStyle(value: indentation | linebreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOIndentionChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oIndentionChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOIndentionChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oIndentionChar")(js.undefined)
        ret
    }
    @scala.inline
    def withUIndentionChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uIndentionChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUIndentionChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uIndentionChar")(js.undefined)
        ret
    }
  }
  
}

