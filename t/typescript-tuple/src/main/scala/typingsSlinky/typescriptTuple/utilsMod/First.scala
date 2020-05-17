package typingsSlinky.typescriptTuple.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - Default
  - / * import warning: importer.ImportType#apply Failed type conversion: Tuple[0] * / js.Any
*/
trait First[Tuple /* <: js.Array[_] */, Default] extends js.Object

object First {
  @scala.inline
  implicit def apply[Tuple, Default](value: /* import warning: importer.ImportType#apply Failed type conversion: Tuple[0] */ js.Any): First[Tuple, Default] = value.asInstanceOf[First[Tuple, Default]]
  @scala.inline
  implicit def apply[Tuple, Default](value: Default): First[Tuple, Default] = value.asInstanceOf[First[Tuple, Default]]
}

