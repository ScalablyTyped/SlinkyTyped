package typingsSlinky.yauzl.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.yauzl.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl", "RandomAccessReader")
@js.native
abstract class RandomAccessReader () extends EventEmitter {
  def _readStreamForRange(start: Double, end: Double): Unit = js.native
  def close(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def createReadStream(options: AnonEnd): Unit = js.native
  def read(
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
}

