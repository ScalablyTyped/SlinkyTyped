package typingsSlinky.terminalKit.mod

import typingsSlinky.terminalKit.AnonShrink
import typingsSlinky.terminalKit.AnonTransparencyChar
import typingsSlinky.terminalKit.screenBufferMod.Attributes
import typingsSlinky.terminalKit.screenBufferMod.Options
import typingsSlinky.terminalKit.screenBufferMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "ScreenBuffer")
@js.native
class ScreenBuffer protected () extends ^ {
  def this(options: Options) = this()
}

/* static members */
@JSImport("terminal-kit", "ScreenBuffer")
@js.native
object ScreenBuffer extends js.Object {
  def attr2object(attrFlags: Double): Unit = js.native
  def create(options: Options): typingsSlinky.terminalKit.screenBufferMod.ScreenBuffer = js.native
  def createFromString(options: AnonTransparencyChar, str: String): typingsSlinky.terminalKit.screenBufferMod.ScreenBuffer = js.native
  def loadImage(
    url: String,
    calback: js.Function2[
      /* error */ js.UndefOr[js.Any], 
      /* image */ js.UndefOr[typingsSlinky.terminalKit.screenBufferHDMod.^], 
      Unit
    ]
  ): Unit = js.native
  def loadImage(
    url: String,
    options: AnonShrink,
    calback: js.Function2[/* error */ js.Any, /* image */ typingsSlinky.terminalKit.screenBufferHDMod.^, Unit]
  ): Unit = js.native
  def loadSync(filepath: String): typingsSlinky.terminalKit.screenBufferMod.ScreenBuffer = js.native
  def object2attr(attrObject: Attributes): Unit = js.native
}

