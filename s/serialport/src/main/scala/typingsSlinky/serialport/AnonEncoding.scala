package typingsSlinky.serialport

import typingsSlinky.node.Buffer
import typingsSlinky.serialport.serialportStrings.ascii
import typingsSlinky.serialport.serialportStrings.base64
import typingsSlinky.serialport.serialportStrings.binary
import typingsSlinky.serialport.serialportStrings.hex
import typingsSlinky.serialport.serialportStrings.ucs2
import typingsSlinky.serialport.serialportStrings.utf16le
import typingsSlinky.serialport.serialportStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEncoding extends js.Object {
  var delimiter: String | Buffer | js.Array[Double] = js.native
  var encoding: js.UndefOr[ascii | utf8 | utf16le | ucs2 | base64 | binary | hex] = js.native
  var includeDelimiter: js.UndefOr[Boolean] = js.native
}

object AnonEncoding {
  @scala.inline
  def apply(delimiter: String | Buffer | js.Array[Double]): AnonEncoding = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncoding]
  }
  @scala.inline
  implicit class AnonEncodingOps[Self <: AnonEncoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelimiter(value: String | Buffer | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex): Self = {
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
    def withIncludeDelimiter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDelimiter")(js.undefined)
        ret
    }
  }
  
}

