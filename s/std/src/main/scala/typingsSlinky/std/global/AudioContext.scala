package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.AudioContextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AudioContext")
@js.native
class AudioContext ()
  extends typingsSlinky.std.AudioContext {
  def this(contextOptions: AudioContextOptions) = this()
}

@JSGlobal("AudioContext")
@js.native
object AudioContext
  extends Instantiable0[org.scalajs.dom.raw.AudioContext]
     with Instantiable1[/* contextOptions */ AudioContextOptions, org.scalajs.dom.raw.AudioContext]

