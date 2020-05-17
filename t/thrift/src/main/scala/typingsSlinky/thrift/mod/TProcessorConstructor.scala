package typingsSlinky.thrift.mod

import typingsSlinky.thrift.anon.Instantiable
import typingsSlinky.thrift.anon.Processor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.thrift.anon.Instantiable[THandler, TProcessor]
  - typingsSlinky.thrift.anon.Processor[THandler, TProcessor]
*/
trait TProcessorConstructor[TProcessor, THandler] extends js.Object

object TProcessorConstructor {
  @scala.inline
  implicit def apply[TProcessor, THandler](value: Instantiable[THandler, TProcessor]): TProcessorConstructor[TProcessor, THandler] = value.asInstanceOf[TProcessorConstructor[TProcessor, THandler]]
  @scala.inline
  implicit def apply[TProcessor, THandler](value: Processor[THandler, TProcessor]): TProcessorConstructor[TProcessor, THandler] = value.asInstanceOf[TProcessorConstructor[TProcessor, THandler]]
}

