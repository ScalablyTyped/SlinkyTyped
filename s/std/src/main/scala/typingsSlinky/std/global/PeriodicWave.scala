package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.PeriodicWaveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PeriodicWave")
@js.native
class PeriodicWave protected ()
  extends typingsSlinky.std.PeriodicWave {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: PeriodicWaveOptions) = this()
}
@JSGlobal("PeriodicWave")
@js.native
object PeriodicWave
  extends Instantiable1[/* context */ typingsSlinky.std.BaseAudioContext, org.scalajs.dom.raw.PeriodicWave]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ PeriodicWaveOptions, 
      org.scalajs.dom.raw.PeriodicWave
    ]
