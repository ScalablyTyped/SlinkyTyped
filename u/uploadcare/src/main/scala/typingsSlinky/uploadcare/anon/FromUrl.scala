package typingsSlinky.uploadcare.anon

import typingsSlinky.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromUrl extends js.Object {
  def fromUrl(
    url: String,
    options: Store,
    callback: js.Function2[/* err */ js.Error, /* res */ typingsSlinky.uploadcare.mod.File, Unit]
  ): Unit = js.native
  def upload(
    readStream: ReadStream,
    options: Store,
    callback: js.Function2[/* err */ js.Error, /* res */ File, Unit]
  ): Unit = js.native
}

object FromUrl {
  @scala.inline
  def apply(
    fromUrl: (String, Store, js.Function2[/* err */ js.Error, /* res */ typingsSlinky.uploadcare.mod.File, Unit]) => Unit,
    upload: (ReadStream, Store, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Unit
  ): FromUrl = {
    val __obj = js.Dynamic.literal(fromUrl = js.Any.fromFunction3(fromUrl), upload = js.Any.fromFunction3(upload))
    __obj.asInstanceOf[FromUrl]
  }
  @scala.inline
  implicit class FromUrlOps[Self <: FromUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromUrl(
      value: (String, Store, js.Function2[/* err */ js.Error, /* res */ typingsSlinky.uploadcare.mod.File, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUrl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpload(value: (ReadStream, Store, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

