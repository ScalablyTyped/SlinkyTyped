package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A file-like object of immutable, raw data. Blobs represent data that isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality and expanding it to support files on the user's system. */
@js.native
trait Blob
  extends ImageBitmapSource
     with MediaProvider
     with _BlobPart
     with _BodyInit {
  val size: Double = js.native
  val `type`: java.lang.String = js.native
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def slice(): org.scalajs.dom.raw.Blob = js.native
  def slice(start: Double): org.scalajs.dom.raw.Blob = js.native
  def slice(start: Double, end: Double): org.scalajs.dom.raw.Blob = js.native
  def slice(start: Double, end: Double, contentType: java.lang.String): org.scalajs.dom.raw.Blob = js.native
  def stream(): org.scalajs.dom.experimental.ReadableStream[_] = js.native
  def text(): js.Promise[java.lang.String] = js.native
}

