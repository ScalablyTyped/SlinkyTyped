package typingsSlinky.winston.transportsMod

import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTransportOptions extends TransportStreamOptions {
  var dirname: js.UndefOr[String] = js.native
  var eol: js.UndefOr[String] = js.native
  var filename: js.UndefOr[String] = js.native
  var maxFiles: js.UndefOr[Double] = js.native
  var maxsize: js.UndefOr[Double] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var rotationFormat: js.UndefOr[js.Function] = js.native
  var stream: js.UndefOr[WritableStream] = js.native
  var tailable: js.UndefOr[Boolean] = js.native
  var zippedArchive: js.UndefOr[Boolean] = js.native
}

object FileTransportOptions {
  @scala.inline
  def apply(): FileTransportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileTransportOptions]
  }
  @scala.inline
  implicit class FileTransportOptionsOps[Self <: FileTransportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(js.undefined)
        ret
    }
    @scala.inline
    def withEol(value: String): Self = {
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
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxsize")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationFormat(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
    @scala.inline
    def withTailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tailable")(js.undefined)
        ret
    }
    @scala.inline
    def withZippedArchive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zippedArchive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZippedArchive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zippedArchive")(js.undefined)
        ret
    }
  }
  
}

