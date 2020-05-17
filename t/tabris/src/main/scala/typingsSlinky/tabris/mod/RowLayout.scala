package typingsSlinky.tabris.mod

import typingsSlinky.tabris.anon.Alignment
import typingsSlinky.tabris.tabrisStrings.baseline
import typingsSlinky.tabris.tabrisStrings.bottom
import typingsSlinky.tabris.tabrisStrings.centerY
import typingsSlinky.tabris.tabrisStrings.stretchY
import typingsSlinky.tabris.tabrisStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "RowLayout")
@js.native
class RowLayout () extends Layout {
  def this(options: Alignment) = this()
  /**
    * Determines the vertical placement of the children. For the `stretchY` value to work correctly the
    * composite needs to be given a width either by setting `width` or by setting `top` and `bottom`.
    * @constant
    */
  val alignment: top | centerY | stretchY | bottom | baseline = js.native
  /**
    * The Space between the children in device independent pixel.
    * @constant
    */
  val spacing: Double = js.native
}

/* static members */
@JSImport("tabris", "RowLayout")
@js.native
object RowLayout extends js.Object {
  /**
    * Instance of RowLayout used as the default `layout` property value of `Row` widgets. Equivalent to
    * `new RowLayout()`
    */
  var default: RowLayout = js.native
}

