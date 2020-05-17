package typingsSlinky.vegaTypings.dataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.dataMod.SourceData
  - typingsSlinky.vegaTypings.dataMod.ValuesData
  - typingsSlinky.vegaTypings.dataMod.UrlData
  - typingsSlinky.vegaTypings.dataMod.BaseData
*/
trait Data extends js.Object

object Data {
  @scala.inline
  implicit def apply(value: BaseData): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: SourceData): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: UrlData): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: ValuesData): Data = value.asInstanceOf[Data]
}

