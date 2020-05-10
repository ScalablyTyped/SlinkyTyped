package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method. */
@js.native
trait TextMetrics extends js.Object {
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxAscent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxDescent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxLeft: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxRight: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val alphabeticBaseline: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val emHeightAscent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val emHeightDescent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val fontBoundingBoxAscent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val fontBoundingBoxDescent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val hangingBaseline: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val ideographicBaseline: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val width: Double = js.native
}

@JSGlobal("TextMetrics")
@js.native
object TextMetrics
  extends Instantiable0[org.scalajs.dom.raw.TextMetrics]

