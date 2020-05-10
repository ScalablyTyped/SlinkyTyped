package typingsSlinky.yauzl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZipFileOptions extends js.Object {
  var decompress: Boolean | Null = js.native
  var decrypt: Boolean | Null = js.native
  var end: Double | Null = js.native
  var start: Double | Null = js.native
}

object ZipFileOptions {
  @scala.inline
  def apply(): ZipFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipFileOptions]
  }
  @scala.inline
  implicit class ZipFileOptionsOps[Self <: ZipFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecompressNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompress")(null)
        ret
    }
    @scala.inline
    def withDecrypt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecryptNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(null)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(null)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(null)
        ret
    }
  }
  
}

