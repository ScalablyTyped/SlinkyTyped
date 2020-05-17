package typingsSlinky.vexflow.global.Vex.Flow

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.vexflow.Vex.Flow.Renderer.Backends
import typingsSlinky.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Renderer")
@js.native
class Renderer protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Renderer {
  def this(sel: HTMLElement, backend: Backends) = this()
}

/* static members */
@JSGlobal("Vex.Flow.Renderer")
@js.native
object Renderer extends js.Object {
  var USE_CANVAS_PROXY: Boolean = js.native
  def bolsterCanvasContext(ctx: CanvasRenderingContext2D): typingsSlinky.vexflow.Vex.Flow.CanvasContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends): IRenderContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: Double): IRenderContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): IRenderContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): IRenderContext = js.native
  def drawDashedLine(
    context: IRenderContext,
    fromX: Double,
    fromY: Double,
    toX: Double,
    toY: Double,
    dashPattern: js.Array[Double]
  ): Unit = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends): typingsSlinky.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double): typingsSlinky.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typingsSlinky.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typingsSlinky.vexflow.Vex.Flow.CanvasContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends): typingsSlinky.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double): typingsSlinky.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typingsSlinky.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typingsSlinky.vexflow.Vex.Flow.RaphaelContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends): typingsSlinky.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double): typingsSlinky.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typingsSlinky.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typingsSlinky.vexflow.Vex.Flow.SVGContext = js.native
}

