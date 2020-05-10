package typingsSlinky.xlsx.mod

import typingsSlinky.xlsx.xlsxStrings.array
import typingsSlinky.xlsx.xlsxStrings.base64
import typingsSlinky.xlsx.xlsxStrings.binary
import typingsSlinky.xlsx.xlsxStrings.buffer
import typingsSlinky.xlsx.xlsxStrings.file
import typingsSlinky.xlsx.xlsxStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritingOptions extends CommonOptions {
  /** Override workbook properties on save */
  var Props: js.UndefOr[Properties] = js.native
  /**
    * Generate Shared String Table
    * @default false
    */
  var bookSST: js.UndefOr[Boolean] = js.native
  /**
    * File format of generated workbook
    * @default 'xlsx'
    */
  var bookType: js.UndefOr[BookType] = js.native
  /**
    * Use ZIP compression for ZIP-based formats
    * @default false
    */
  var compression: js.UndefOr[Boolean] = js.native
  /**
    * Suppress "number stored as text" errors in generated files
    * @default true
    */
  var ignoreEC: js.UndefOr[Boolean] = js.native
  /**
    * Name of Worksheet (for single-sheet formats)
    * @default ''
    */
  var sheet: js.UndefOr[String] = js.native
  /** Output data encoding */
  var `type`: js.UndefOr[base64 | binary | buffer | file | array | string] = js.native
}

object WritingOptions {
  @scala.inline
  def apply(): WritingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WritingOptions]
  }
  @scala.inline
  implicit class WritingOptionsOps[Self <: WritingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProps(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Props")(js.undefined)
        ret
    }
    @scala.inline
    def withBookSST(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookSST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookSST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookSST")(js.undefined)
        ret
    }
    @scala.inline
    def withBookType(value: BookType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookType")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEC")(js.undefined)
        ret
    }
    @scala.inline
    def withSheet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: base64 | binary | buffer | file | array | string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

