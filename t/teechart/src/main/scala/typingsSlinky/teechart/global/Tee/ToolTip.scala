package typingsSlinky.teechart.global.Tee

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.teechart.Tee.IAnnotation
import typingsSlinky.teechart.Tee.IChart
import typingsSlinky.teechart.Tee.IFormat
import typingsSlinky.teechart.Tee.IMargins
import typingsSlinky.teechart.Tee.IPoint
import typingsSlinky.teechart.Tee.IRectangle
import typingsSlinky.teechart.Tee.ISeries
import typingsSlinky.teechart.Tee.IToolTip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Tee.ToolTip")
@js.native
class ToolTip () extends IToolTip {
  def this(chart: typingsSlinky.teechart.Tee.Chart) = this()
  /* CompleteClass */
  override var active: Boolean = js.native
  /* CompleteClass */
  override var animated: Double = js.native
  /* CompleteClass */
  override var autoHide: Boolean = js.native
  /* CompleteClass */
  override var autoRedraw: Boolean = js.native
  /* CompleteClass */
  override var bounds: IRectangle = js.native
  /* CompleteClass */
  override var chart: IChart = js.native
  /* CompleteClass */
  override var currentIndex: Double = js.native
  /* CompleteClass */
  override var currentSeries: ISeries = js.native
  /* CompleteClass */
  override var delay: Double = js.native
  /* CompleteClass */
  override var format: IFormat = js.native
  /* CompleteClass */
  override var items: js.Array[IAnnotation] = js.native
  /* CompleteClass */
  override var margins: IMargins = js.native
  /* CompleteClass */
  override var position: IPoint = js.native
  /* CompleteClass */
  override var text: String = js.native
  /* CompleteClass */
  override var transparent: Boolean = js.native
  /* CompleteClass */
  override var visible: Boolean = js.native
  /* CompleteClass */
  override def add(text: String): IAnnotation = js.native
  /* CompleteClass */
  override def clicked(p: IPoint): Boolean = js.native
  /* CompleteClass */
  override def draw(): Unit = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def mousedown(event: js.Any): Boolean = js.native
  /* CompleteClass */
  override def mousemove(event: js.Any): Boolean = js.native
  /* CompleteClass */
  override def refresh(series: ISeries, index: Double): Unit = js.native
  /* CompleteClass */
  override def resize(): Unit = js.native
}

@JSGlobal("Tee.ToolTip")
@js.native
object ToolTip
  extends Instantiable0[IToolTip]
     with Instantiable1[/* chart */ typingsSlinky.teechart.Tee.Chart, IToolTip]

