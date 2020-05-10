package typingsSlinky.uploadcare

import typingsSlinky.node.fsMod.ReadStream
import typingsSlinky.uploadcare.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFromUrl extends js.Object {
  def fromUrl(url: String, options: AnonStore, callback: js.Function2[/* err */ js.Error, /* res */ File, Unit]): Unit = js.native
  def upload(
    readStream: ReadStream,
    options: AnonStore,
    callback: js.Function2[/* err */ js.Error, /* res */ AnonFile, Unit]
  ): Unit = js.native
}

object AnonFromUrl {
  @scala.inline
  def apply(
    fromUrl: (String, AnonStore, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Unit,
    upload: (ReadStream, AnonStore, js.Function2[/* err */ js.Error, /* res */ AnonFile, Unit]) => Unit
  ): AnonFromUrl = {
    val __obj = js.Dynamic.literal(fromUrl = js.Any.fromFunction3(fromUrl), upload = js.Any.fromFunction3(upload))
    __obj.asInstanceOf[AnonFromUrl]
  }
  @scala.inline
  implicit class AnonFromUrlOps[Self <: AnonFromUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromUrl(value: (String, AnonStore, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUrl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpload(value: (ReadStream, AnonStore, js.Function2[/* err */ js.Error, /* res */ AnonFile, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

