package typingsSlinky.tail.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TailOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.native
  var flushAtEOF: js.UndefOr[Boolean] = js.native
  var follow: js.UndefOr[Boolean] = js.native
  var fromBeginning: js.UndefOr[Boolean] = js.native
  var fsWatchOptions: js.UndefOr[Record[String, _]] = js.native
  var logger: js.UndefOr[js.Any] = js.native
  var separator: js.UndefOr[String | js.RegExp | Null] = js.native
  var useWatchFile: js.UndefOr[Boolean] = js.native
}

object TailOptions {
  @scala.inline
  def apply(): TailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TailOptions]
  }
  @scala.inline
  implicit class TailOptionsOps[Self <: TailOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: String): Self = {
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
    def withFlushAtEOF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushAtEOF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlushAtEOF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushAtEOF")(js.undefined)
        ret
    }
    @scala.inline
    def withFollow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(js.undefined)
        ret
    }
    @scala.inline
    def withFromBeginning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBeginning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromBeginning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBeginning")(js.undefined)
        ret
    }
    @scala.inline
    def withFsWatchOptions(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsWatchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFsWatchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsWatchOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparatorRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparator(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparatorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(null)
        ret
    }
    @scala.inline
    def withUseWatchFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWatchFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWatchFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWatchFile")(js.undefined)
        ret
    }
  }
  
}

