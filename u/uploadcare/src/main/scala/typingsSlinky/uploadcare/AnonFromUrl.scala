package typingsSlinky.uploadcare

import typingsSlinky.node.fsMod.ReadStream
import typingsSlinky.uploadcare.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromUrl extends js.Object {
  def fromUrl(url: String, options: AnonStore, callback: js.Function2[/* err */ js.Error, /* res */ File, Unit]): Unit
  def upload(
    readStream: ReadStream,
    options: AnonStore,
    callback: js.Function2[/* err */ js.Error, /* res */ AnonFile, Unit]
  ): Unit
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
}

