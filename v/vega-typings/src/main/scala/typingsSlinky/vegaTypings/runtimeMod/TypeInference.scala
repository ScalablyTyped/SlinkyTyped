package typingsSlinky.vegaTypings.runtimeMod

import typingsSlinky.vegaTypings.dataMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.dataMod.DataType
  - typingsSlinky.vegaTypings.vegaTypingsStrings.integer
*/
trait TypeInference extends js.Object

object TypeInference {
  @scala.inline
  def integer: typingsSlinky.vegaTypings.vegaTypingsStrings.integer = "integer".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.integer]
  @scala.inline
  implicit def apply(value: DataType): TypeInference = value.asInstanceOf[TypeInference]
}

