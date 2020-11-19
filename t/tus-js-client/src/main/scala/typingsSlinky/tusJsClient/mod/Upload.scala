package typingsSlinky.tusJsClient.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsSlinky.tusJsClient.anon.PickReadableStreamDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tus-js-client", "Upload")
@js.native
class Upload protected () extends js.Object {
  def this(file: Blob, options: UploadOptions) = this()
  def this(file: File, options: UploadOptions) = this()
  def this(file: PickReadableStreamDefault, options: UploadOptions) = this()
  
  def abort(): js.Promise[Unit] = js.native
  def abort(shouldTerminate: Boolean): js.Promise[Unit] = js.native
  
  var file: File | Blob | PickReadableStreamDefault = js.native
  
  def findPreviousUploads(): js.Promise[js.Array[PreviousUpload]] = js.native
  
  var options: UploadOptions = js.native
  
  def resumeFromPreviousUpload(previousUpload: PreviousUpload): Unit = js.native
  
  def start(): Unit = js.native
  
  var url: String | Null = js.native
}
/* static members */
@JSImport("tus-js-client", "Upload")
@js.native
object Upload extends js.Object {
  
  def terminate(url: String): Unit = js.native
  def terminate(
    url: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def terminate(url: String, options: UploadOptions): Unit = js.native
  def terminate(
    url: String,
    options: UploadOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
}
