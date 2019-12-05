package typingsSlinky.skyway

import org.scalajs.dom.experimental.mediastream.MediaStream
import typingsSlinky.skyway.skywayStrings.close
import typingsSlinky.skyway.skywayStrings.removeStream
import typingsSlinky.skyway.skywayStrings.stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaConnection")
@js.native
class MediaConnection () extends js.Object {
  var metadata: js.Any = js.native
  var open: Boolean = js.native
  var peer: String = js.native
  var remoteId: String = js.native
  def answer(stream: MediaStream): js.UndefOr[scala.Nothing] = js.native
  def answer(stream: MediaStream, options: AnswerOptions): js.UndefOr[scala.Nothing] = js.native
  def close(): js.UndefOr[Unit] = js.native
  def on(event: String, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_close(event: close, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_removeStream(event: removeStream, cb: js.Function1[/* reamoteStream */ MediaStream, Unit]): Unit = js.native
  @JSName("on")
  def on_stream(event: stream, cb: js.Function1[/* stream */ MediaStream, Unit]): Unit = js.native
  def replaceStream(stream: MediaStream): js.UndefOr[scala.Nothing] = js.native
}

