package typingsSlinky.textract.anon

import typingsSlinky.textract.textractStrings.ASCII7
import typingsSlinky.textract.textractStrings.Latin1
import typingsSlinky.textract.textractStrings.Symbol
import typingsSlinky.textract.textractStrings.ZapfDingbats
import typingsSlinky.textract.textractStrings.`UCS-2`
import typingsSlinky.textract.textractStrings.`UTF-8`
import typingsSlinky.textract.textractStrings.dos
import typingsSlinky.textract.textractStrings.htmlmeta
import typingsSlinky.textract.textractStrings.layout
import typingsSlinky.textract.textractStrings.mac
import typingsSlinky.textract.textractStrings.raw
import typingsSlinky.textract.textractStrings.unix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crop extends js.Object {
  var crop: js.UndefOr[H] = js.native
  /**
    * @default "UTF-8"
    */
  var encoding: js.UndefOr[`UCS-2` | ASCII7 | Latin1 | `UTF-8` | ZapfDingbats | Symbol] = js.native
  var eol: js.UndefOr[unix | dos | mac] = js.native
  var firstPage: js.UndefOr[Double] = js.native
  var lastPage: js.UndefOr[Double] = js.native
  /**
    * Do not change unless you know what you are doing!
    * @default "raw"
    */
  var layout: js.UndefOr[typingsSlinky.textract.textractStrings.layout | raw | htmlmeta] = js.native
  var ownerPassword: js.UndefOr[String] = js.native
  var resolution: js.UndefOr[Double] = js.native
  /**
    * @default true
    */
  var splitPages: js.UndefOr[Boolean] = js.native
  var userPassword: js.UndefOr[String] = js.native
}

object Crop {
  @scala.inline
  def apply(): Crop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crop]
  }
  @scala.inline
  implicit class CropOps[Self <: Crop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrop(value: H): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: `UCS-2` | ASCII7 | Latin1 | `UTF-8` | ZapfDingbats | Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEol(value: unix | dos | mac): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPage")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: layout | raw | htmlmeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitPages")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPassword")(js.undefined)
        ret
    }
  }
  
}

