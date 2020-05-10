package typingsSlinky.tarStream.mod

import typingsSlinky.tarStream.tarStreamStrings.`block-device`
import typingsSlinky.tarStream.tarStreamStrings.`character-device`
import typingsSlinky.tarStream.tarStreamStrings.`contiguous-file`
import typingsSlinky.tarStream.tarStreamStrings.`gnu-long-link-path`
import typingsSlinky.tarStream.tarStreamStrings.`gnu-long-path`
import typingsSlinky.tarStream.tarStreamStrings.`pax-global-header`
import typingsSlinky.tarStream.tarStreamStrings.`pax-header`
import typingsSlinky.tarStream.tarStreamStrings.directory
import typingsSlinky.tarStream.tarStreamStrings.fifo
import typingsSlinky.tarStream.tarStreamStrings.file
import typingsSlinky.tarStream.tarStreamStrings.link
import typingsSlinky.tarStream.tarStreamStrings.symlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  var devmajor: js.UndefOr[Double] = js.native
  var devminor: js.UndefOr[Double] = js.native
  var gid: js.UndefOr[Double] = js.native
  var gname: js.UndefOr[String] = js.native
  var linkname: js.UndefOr[String | Null] = js.native
  var mode: js.UndefOr[Double] = js.native
  var mtime: js.UndefOr[js.Date] = js.native
  var name: String = js.native
  var size: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[
    file | link | symlink | `character-device` | `block-device` | directory | fifo | `contiguous-file` | `pax-header` | `pax-global-header` | `gnu-long-link-path` | `gnu-long-path` | Null
  ] = js.native
  var uid: js.UndefOr[Double] = js.native
  var uname: js.UndefOr[String] = js.native
}

object Headers {
  @scala.inline
  def apply(name: String): Headers = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevmajor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devmajor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevmajor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devmajor")(js.undefined)
        ret
    }
    @scala.inline
    def withDevminor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devminor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevminor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devminor")(js.undefined)
        ret
    }
    @scala.inline
    def withGid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(js.undefined)
        ret
    }
    @scala.inline
    def withGname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gname")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkname")(js.undefined)
        ret
    }
    @scala.inline
    def withLinknameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkname")(null)
        ret
    }
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMtime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: file | link | symlink | `character-device` | `block-device` | directory | fifo | `contiguous-file` | `pax-header` | `pax-global-header` | `gnu-long-link-path` | `gnu-long-path`
    ): Self = {
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
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
    @scala.inline
    def withUid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
    @scala.inline
    def withUname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uname")(js.undefined)
        ret
    }
  }
  
}

