package typingsSlinky.three

import typingsSlinky.three.lineMod.Line
import typingsSlinky.three.positionalAudioMod.PositionalAudio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/PositionalAudioHelper", JSImport.Namespace)
@js.native
object positionalAudioHelperMod extends js.Object {
  @js.native
  class PositionalAudioHelper protected () extends Line {
    def this(audio: PositionalAudio) = this()
    def this(audio: PositionalAudio, range: Double) = this()
    def this(audio: PositionalAudio, range: js.UndefOr[scala.Nothing], divisionsInnerAngle: Double) = this()
    def this(audio: PositionalAudio, range: Double, divisionsInnerAngle: Double) = this()
    def this(
      audio: PositionalAudio,
      range: js.UndefOr[scala.Nothing],
      divisionsInnerAngle: js.UndefOr[scala.Nothing],
      divisionsOuterAngle: Double
    ) = this()
    def this(
      audio: PositionalAudio,
      range: js.UndefOr[scala.Nothing],
      divisionsInnerAngle: Double,
      divisionsOuterAngle: Double
    ) = this()
    def this(
      audio: PositionalAudio,
      range: Double,
      divisionsInnerAngle: js.UndefOr[scala.Nothing],
      divisionsOuterAngle: Double
    ) = this()
    def this(audio: PositionalAudio, range: Double, divisionsInnerAngle: Double, divisionsOuterAngle: Double) = this()
    var audio: PositionalAudio = js.native
    var divisionsInnerAngle: Double = js.native
    var divisionsOuterAngle: Double = js.native
    var range: Double = js.native
    def dispose(): Unit = js.native
    def update(): Unit = js.native
  }
  
}

