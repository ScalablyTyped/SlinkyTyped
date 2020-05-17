package typingsSlinky.systemjs.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.systemjs.System.GetFnModule
  - typingsSlinky.systemjs.System.GetFnGeneric
*/
trait GetFn extends js.Object

object GetFn {
  @scala.inline
  implicit def apply(value: GetFnGeneric | GetFnModule): GetFn = value.asInstanceOf[GetFn]
}

