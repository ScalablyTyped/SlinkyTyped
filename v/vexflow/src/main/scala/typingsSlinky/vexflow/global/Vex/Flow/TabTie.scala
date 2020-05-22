package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Family
import typingsSlinky.vexflow.anon.Firstindices
import typingsSlinky.vexflow.anon.Firstxpx
import typingsSlinky.vexflow.anon.Lastindices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TabTie")
@js.native
class TabTie protected ()
  extends typingsSlinky.vexflow.Vex.Flow.TabTie {
  def this(notes: Firstindices) = this()
  def this(notes: Firstindices, text: String) = this()
  /* CompleteClass */
  override def createHammeron(notes: Firstindices): typingsSlinky.vexflow.Vex.Flow.TabTie = js.native
  /* CompleteClass */
  override def createPulloff(notes: Firstindices): typingsSlinky.vexflow.Vex.Flow.TabTie = js.native
  /* CompleteClass */
  override def draw(): Boolean = js.native
  /* CompleteClass */
  override def isPartial(): Boolean = js.native
  /* CompleteClass */
  override def renderText(first_x_px: Double, last_x_px: Double): Unit = js.native
  /* CompleteClass */
  override def renderTie(params: Firstxpx): Unit = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsSlinky.vexflow.Vex.Flow.StaveTie = js.native
  /* CompleteClass */
  override def setFont(font: Family): typingsSlinky.vexflow.Vex.Flow.StaveTie = js.native
  /* CompleteClass */
  override def setNotes(notes: Lastindices): typingsSlinky.vexflow.Vex.Flow.StaveTie = js.native
}

