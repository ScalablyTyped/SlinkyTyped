package typingsSlinky.staticmaps.mod

import typingsSlinky.node.Buffer
import typingsSlinky.sharp.mod.JpegOptions
import typingsSlinky.sharp.mod.OutputOptions
import typingsSlinky.sharp.mod.PngOptions
import typingsSlinky.sharp.mod.WebpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticMapsImage extends js.Object {
  
  def buffer(): js.Promise[Buffer] = js.native
  def buffer(mime: js.UndefOr[scala.Nothing], outputOptions: JpegOptions): js.Promise[Buffer] = js.native
  def buffer(mime: js.UndefOr[scala.Nothing], outputOptions: OutputOptions): js.Promise[Buffer] = js.native
  def buffer(mime: js.UndefOr[scala.Nothing], outputOptions: PngOptions): js.Promise[Buffer] = js.native
  def buffer(mime: js.UndefOr[scala.Nothing], outputOptions: WebpOptions): js.Promise[Buffer] = js.native
  def buffer(mime: String): js.Promise[Buffer] = js.native
  def buffer(mime: String, outputOptions: JpegOptions): js.Promise[Buffer] = js.native
  def buffer(mime: String, outputOptions: OutputOptions): js.Promise[Buffer] = js.native
  def buffer(mime: String, outputOptions: PngOptions): js.Promise[Buffer] = js.native
  def buffer(mime: String, outputOptions: WebpOptions): js.Promise[Buffer] = js.native
  
  var image: Buffer = js.native
  
  def save(): js.Promise[Unit] = js.native
  def save(fileName: js.UndefOr[scala.Nothing], outputOptions: JpegOptions): js.Promise[Unit] = js.native
  def save(fileName: js.UndefOr[scala.Nothing], outputOptions: OutputOptions): js.Promise[Unit] = js.native
  def save(fileName: js.UndefOr[scala.Nothing], outputOptions: PngOptions): js.Promise[Unit] = js.native
  def save(fileName: js.UndefOr[scala.Nothing], outputOptions: WebpOptions): js.Promise[Unit] = js.native
  def save(fileName: String): js.Promise[Unit] = js.native
  def save(fileName: String, outputOptions: JpegOptions): js.Promise[Unit] = js.native
  def save(fileName: String, outputOptions: OutputOptions): js.Promise[Unit] = js.native
  def save(fileName: String, outputOptions: PngOptions): js.Promise[Unit] = js.native
  def save(fileName: String, outputOptions: WebpOptions): js.Promise[Unit] = js.native
}
