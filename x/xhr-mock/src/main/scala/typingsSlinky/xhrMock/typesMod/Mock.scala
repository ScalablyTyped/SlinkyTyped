package typingsSlinky.xhrMock.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xhrMock.typesMod.MockObject
  - typingsSlinky.xhrMock.typesMod.MockFunction
*/
trait Mock extends js.Object

object Mock {
  @scala.inline
  implicit def apply(value: MockFunction): Mock = value.asInstanceOf[Mock]
  @scala.inline
  implicit def apply(value: MockObject): Mock = value.asInstanceOf[Mock]
}

