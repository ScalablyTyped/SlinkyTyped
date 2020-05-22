package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.anon.AccidentalNote
import typingsSlinky.vexflow.anon.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.KeyManager")
@js.native
class KeyManager protected ()
  extends typingsSlinky.vexflow.Vex.Flow.KeyManager {
  def this(key: String) = this()
  /* CompleteClass */
  override def getAccidental(key: String): AccidentalNote = js.native
  /* CompleteClass */
  override def getKey(): String = js.native
  /* CompleteClass */
  override def reset(): typingsSlinky.vexflow.Vex.Flow.KeyManager = js.native
  /* CompleteClass */
  override def selectNote(note: String): Change = js.native
  /* CompleteClass */
  override def setKey(key: String): typingsSlinky.vexflow.Vex.Flow.KeyManager = js.native
}

