package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.std.OfflineAudioContextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OfflineAudioContext")
@js.native
class OfflineAudioContext protected ()
  extends typingsSlinky.std.OfflineAudioContext {
  def this(contextOptions: OfflineAudioContextOptions) = this()
  def this(numberOfChannels: Double, length: Double, sampleRate: Double) = this()
}

@JSGlobal("OfflineAudioContext")
@js.native
object OfflineAudioContext
  extends Instantiable1[
      /* contextOptions */ OfflineAudioContextOptions, 
      org.scalajs.dom.raw.OfflineAudioContext
    ]
     with Instantiable3[
      /* numberOfChannels */ Double, 
      /* length */ Double, 
      /* sampleRate */ Double, 
      org.scalajs.dom.raw.OfflineAudioContext
    ]

