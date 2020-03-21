package typingsSlinky.w3cCssTypedObjectModelLevel1

import typingsSlinky.std.DOMMatrix
import typingsSlinky.std.DOMMatrixReadOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSSMatrixComponent")
@js.native
class CSSMatrixComponent protected () extends CSSTransformComponent {
  def this(matrix: DOMMatrixReadOnly) = this()
  def this(matrix: DOMMatrixReadOnly, options: CSSMatrixComponentOptions) = this()
  var matrix: DOMMatrix = js.native
}

