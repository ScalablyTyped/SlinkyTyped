package typingsSlinky.vegaDashTypings.typesSpecDataMod

import typingsSlinky.vegaDashTypings.typesRuntimeMod.TypeInference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.vegaDashTypingsStrings.boolean
  - typings.vegaDashTypings.vegaDashTypingsStrings.number
  - typings.vegaDashTypings.vegaDashTypingsStrings.date
  - typings.vegaDashTypings.vegaDashTypingsStrings.string
*/
trait DataType extends TypeInference

object DataType {
  @scala.inline
  def boolean: typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.date = this.cast("date")
  @scala.inline
  def number: typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.number = this.cast("number")
  @scala.inline
  def string: typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.string = this.cast("string")
}

