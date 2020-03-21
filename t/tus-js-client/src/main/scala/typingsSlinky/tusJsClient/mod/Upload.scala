package typingsSlinky.tusJsClient.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsSlinky.tusJsClient.PickReadableStreamDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tus-js-client", "Upload")
@js.native
class Upload protected () extends js.Object {
  def this(file: Blob, options: UploadOptions) = this()
  def this(file: File, options: UploadOptions) = this()
  def this(file: PickReadableStreamDefault, options: UploadOptions) = this()
  var file: File | Blob | PickReadableStreamDefault = js.native
  var options: UploadOptions = js.native
  var url: String | Null = js.native
  def abort(): Unit = js.native
  def abort(shouldTerminate: Boolean): Unit = js.native
  def abort(shouldTerminate: Boolean, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def start(): Unit = js.native
}

/* static members */
@JSImport("tus-js-client", "Upload")
@js.native
object Upload extends js.Object {
  def terminate(url: String): Unit = js.native
  def terminate(url: String, options: UploadOptions): Unit = js.native
  def terminate(
    url: String,
    options: UploadOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
}

