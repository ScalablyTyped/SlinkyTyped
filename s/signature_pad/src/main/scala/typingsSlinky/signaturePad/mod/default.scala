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
  }
  
  @js.native
  class CurveControl protected ()
    extends typingsSlinky.signaturePad.mod.SignaturePad.CurveControl {
    def this(
      c1: typingsSlinky.signaturePad.mod.SignaturePad.Point,
      c2: typingsSlinky.signaturePad.mod.SignaturePad.Point
    ) = this()
  }
  
  @js.native
  class Point protected ()
    extends typingsSlinky.signaturePad.mod.SignaturePad.Point {
    def this(x: Double, y: Double, time: Double) = this()
  }
  
}

