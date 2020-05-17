package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.NamespaceBody
  - typingsSlinky.typescript.mod.JSDocNamespaceBody
*/
trait ModuleBody extends js.Object

object ModuleBody {
  @scala.inline
  implicit def apply(value: JSDocNamespaceBody): ModuleBody = value.asInstanceOf[ModuleBody]
  @scala.inline
  implicit def apply(value: NamespaceBody): ModuleBody = value.asInstanceOf[ModuleBody]
}

