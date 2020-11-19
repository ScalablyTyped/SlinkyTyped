package typingsSlinky.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a limiter effect definition supported by the audio graph. */
@JSGlobal("Windows.Media.Audio.LimiterEffectDefinition")
@js.native
class LimiterEffectDefinition protected ()
  extends typingsSlinky.winrtUwp.Windows.Media.Audio.LimiterEffectDefinition {
  /**
    * Initializes a new instance of the LimiterEffectDefinition class.
    * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
    */
  def this(audioGraph: typingsSlinky.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
}
