package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A file-like object of immutable, raw data. Blobs represent data that isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality and expanding it to support files on the user's system. */
@js.native
trait Blob extends StObject {
  
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  val size: Double = js.native
  
  def slice(): org.scalajs.dom.raw.Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], contentType: java.lang.String): org.scalajs.dom.raw.Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): org.scalajs.dom.raw.Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double, contentType: java.lang.String): org.scalajs.dom.raw.Blob = js.native
  def slice(start: Double): org.scalajs.dom.raw.Blob = js.native
  def slice(start: Double, end: js.UndefOr[scala.Nothing], contentType: java.lang.String): org.scalajs.dom.raw.Blob = js.native
  def slice(start: Double, end: Double): org.scalajs.dom.raw.Blob = js.native
  def slice(start: Double, end: Double, contentType: java.lang.String): org.scalajs.dom.raw.Blob = js.native
  
  def stream(): org.scalajs.dom.experimental.ReadableStream[_] = js.native
  
  def text(): js.Promise[java.lang.String] = js.native
  
  val `type`: java.lang.String = js.native
}
