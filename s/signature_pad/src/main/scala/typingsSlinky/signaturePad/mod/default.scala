package typingsSlinky.signaturePad.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.signaturePad.mod.SignaturePad.SignaturePadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signature_pad", JSImport.Default)
@js.native
class default protected () extends SignaturePad {
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: HTMLCanvasElement, options: SignaturePadOptions) = this()
}

@JSImport("signature_pad", JSImport.Default)
@js.native
object default extends js.Object {
  @js.native
  class Bezier protected ()
    extends typingsSlinky.signaturePad.mod.SignaturePad.Bezier {
    def this(
      startPoint: typingsSlinky.signaturePad.mod.SignaturePad.Point,
      control1: typingsSlinky.signaturePad.mod.SignaturePad.Point,
      control2: typingsSlinky.signaturePad.mod.SignaturePad.Point,
      endPoint: typingsSlinky.signaturePad.mod.SignaturePad.Point
    ) = this()
    /* CompleteClass */
    override var control1: typingsSlinky.signaturePad.mod.SignaturePad.CurveControl = js.native
    /* CompleteClass */
    override var control2: typingsSlinky.signaturePad.mod.SignaturePad.CurveControl = js.native
    /* CompleteClass */
    override var endPoint: typingsSlinky.signaturePad.mod.SignaturePad.Point = js.native
    /* CompleteClass */
    override var endWidth: Double = js.native
    /* CompleteClass */
    override var startPoint: typingsSlinky.signaturePad.mod.SignaturePad.Point = js.native
    /* CompleteClass */
    override var startWidth: Double = js.native
    /* CompleteClass */
    override def _point(t: Double, start: Double, c1: Double, c2: Double, end: Double): Double = js.native
    /* CompleteClass */
    override def length(): Double = js.native
  }
  
  @js.native
  class CurveControl protected ()
    extends typingsSlinky.signaturePad.mod.SignaturePad.CurveControl {
    def this(
      c1: typingsSlinky.signaturePad.mod.SignaturePad.Point,
      c2: typingsSlinky.signaturePad.mod.SignaturePad.Point
    ) = this()
    /* CompleteClass */
    override var c1: typingsSlinky.signaturePad.mod.SignaturePad.Point = js.native
    /* CompleteClass */
    override var c2: typingsSlinky.signaturePad.mod.SignaturePad.Point = js.native
  }
  
  @js.native
  class Point protected ()
    extends typingsSlinky.signaturePad.mod.SignaturePad.Point {
    def this(x: Double, y: Double, time: Double) = this()
    /* CompleteClass */
    override var time: Double = js.native
    /* CompleteClass */
    override var x: Double = js.native
    /* CompleteClass */
    override var y: Double = js.native
    /* CompleteClass */
    override def distanceTo(start: typingsSlinky.signaturePad.mod.SignaturePad.Point): Double = js.native
    /* CompleteClass */
    override def velocityFrom(start: typingsSlinky.signaturePad.mod.SignaturePad.Point): Double = js.native
  }
  
}

