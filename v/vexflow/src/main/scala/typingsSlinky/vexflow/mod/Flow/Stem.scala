package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.BaseY
import typingsSlinky.vexflow.anon.FillStyle_
import typingsSlinky.vexflow.anon.Stemdirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Stem")
@js.native
class Stem protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Stem {
  def this(options: Stemdirection) = this()
  //inconsistent API: this should be set via the options object in the constructor
  /* CompleteClass */
  override var hide: Boolean = js.native
  /* CompleteClass */
  override def applyStyle(context: IRenderContext): typingsSlinky.vexflow.Vex.Flow.Stem = js.native
  /* CompleteClass */
  override def draw(): Unit = js.native
  /* CompleteClass */
  override def getBoundingBox(): typingsSlinky.vexflow.Vex.Flow.BoundingBox = js.native
  /* CompleteClass */
  override def getCategory(): String = js.native
  /* CompleteClass */
  override def getExtents(): BaseY = js.native
  /* CompleteClass */
  override def getHeight(): Double = js.native
  /* CompleteClass */
  override def getStyle(): FillStyle_ = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsSlinky.vexflow.Vex.Flow.Stem = js.native
  /* CompleteClass */
  override def setDirection(direction: Double): Unit = js.native
  /* CompleteClass */
  override def setExtension(extension: Double): Unit = js.native
  /* CompleteClass */
  override def setNoteHeadXBounds(x_begin: Double, x_end: Double): typingsSlinky.vexflow.Vex.Flow.Stem = js.native
  /* CompleteClass */
  override def setStyle(style: FillStyle_): Unit = js.native
  /* CompleteClass */
  override def setYBounds(y_top: Double, y_bottom: Double): Unit = js.native
}

/* static members */
@JSImport("vexflow", "Flow.Stem")
@js.native
object Stem extends js.Object {
  var DEBUG: Boolean = js.native
  val DOWN: Double = js.native
  val UP: Double = js.native
}

