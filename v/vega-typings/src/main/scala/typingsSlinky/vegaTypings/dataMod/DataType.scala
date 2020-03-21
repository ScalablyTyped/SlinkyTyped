package typingsSlinky.vegaTypings.dataMod

import typingsSlinky.vegaTypings.runtimeMod.TypeInference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.vegaTypingsStrings.boolean
  - typingsSlinky.vegaTypings.vegaTypingsStrings.number
  - typingsSlinky.vegaTypings.vegaTypingsStrings.date
  - typingsSlinky.vegaTypings.vegaTypingsStrings.string
*/
trait DataType extends TypeInference

object DataType {
  @scala.inline
  def boolean: typingsSlinky.vegaTypings.vegaTypingsStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsSlinky.vegaTypings.vegaTypingsStrings.date = this.cast("date")
  @scala.inline
  def number: typingsSlinky.vegaTypings.vegaTypingsStrings.number = this.cast("number")
  @scala.inline
  def string: typingsSlinky.vegaTypings.vegaTypingsStrings.string = this.cast("string")
}

