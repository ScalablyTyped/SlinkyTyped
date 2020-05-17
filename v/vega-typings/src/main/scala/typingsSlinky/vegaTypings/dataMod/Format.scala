package typingsSlinky.vegaTypings.dataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.dataMod.FormatJSON
  - typingsSlinky.vegaTypings.dataMod.FormatSV
  - typingsSlinky.vegaTypings.dataMod.FormatDSV
  - typingsSlinky.vegaTypings.dataMod.FormatTopoJSON
  - typingsSlinky.vegaTypings.anon.Parse
*/
trait Format extends js.Object

object Format {
  @scala.inline
  implicit def apply(value: FormatDSV): Format = value.asInstanceOf[Format]
  @scala.inline
  implicit def apply(value: FormatJSON): Format = value.asInstanceOf[Format]
  @scala.inline
  implicit def apply(value: FormatSV): Format = value.asInstanceOf[Format]
  @scala.inline
  implicit def apply(value: FormatTopoJSON): Format = value.asInstanceOf[Format]
  @scala.inline
  implicit def apply(value: typingsSlinky.vegaTypings.anon.Parse): Format = value.asInstanceOf[Format]
}

