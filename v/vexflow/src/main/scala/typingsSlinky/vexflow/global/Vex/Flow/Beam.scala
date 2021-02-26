package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.anon.Beammiddleonly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Beam")
@js.native
class Beam protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Beam {
  def this(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StemmableNote]) = this()
  def this(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StemmableNote], auto_stem: Boolean) = this()
}
object Beam {
  
  /* static member */
  @JSGlobal("Vex.Flow.Beam.applyAndGetBeams")
  @js.native
  def applyAndGetBeams(
    voice: typingsSlinky.vexflow.Vex.Flow.Voice,
    stem_direction: Double,
    groups: js.Array[typingsSlinky.vexflow.Vex.Flow.Fraction]
  ): js.Array[typingsSlinky.vexflow.Vex.Flow.Beam] = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Beam.generateBeams")
  @js.native
  def generateBeams(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StemmableNote]): js.Array[typingsSlinky.vexflow.Vex.Flow.Beam] = js.native
  @JSGlobal("Vex.Flow.Beam.generateBeams")
  @js.native
  def generateBeams(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StemmableNote], config: Beammiddleonly): js.Array[typingsSlinky.vexflow.Vex.Flow.Beam] = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Beam.getDefaultBeamGroups")
  @js.native
  def getDefaultBeamGroups(time_sig: String): js.Array[typingsSlinky.vexflow.Vex.Flow.Fraction] = js.native
}
