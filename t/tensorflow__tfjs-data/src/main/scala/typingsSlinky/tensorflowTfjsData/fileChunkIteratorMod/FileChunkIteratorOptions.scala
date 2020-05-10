package typingsSlinky.tensorflowTfjsData.fileChunkIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileChunkIteratorOptions extends js.Object {
  /** The number of bytes to read at a time. Default 1MB. */
  var chunkSize: js.UndefOr[Double] = js.native
  /** The byte offset at which to begin reading the File or Blob. Default 0. */
  var offset: js.UndefOr[Double] = js.native
}

object FileChunkIteratorOptions {
  @scala.inline
  def apply(): FileChunkIteratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileChunkIteratorOptions]
  }
  @scala.inline
  implicit class FileChunkIteratorOptionsOps[Self <: FileChunkIteratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

