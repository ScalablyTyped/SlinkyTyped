package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.HasExpressionInitializer
  - typingsSlinky.typescript.mod.ForStatement
  - typingsSlinky.typescript.mod.ForInStatement
  - typingsSlinky.typescript.mod.ForOfStatement
  - typingsSlinky.typescript.mod.JsxAttribute
*/
trait HasInitializer extends js.Object

object HasInitializer {
  @scala.inline
  implicit def apply(value: ForInStatement): HasInitializer = value.asInstanceOf[HasInitializer]
  @scala.inline
  implicit def apply(value: ForOfStatement): HasInitializer = value.asInstanceOf[HasInitializer]
  @scala.inline
  implicit def apply(value: ForStatement): HasInitializer = value.asInstanceOf[HasInitializer]
  @scala.inline
  implicit def apply(value: HasExpressionInitializer): HasInitializer = value.asInstanceOf[HasInitializer]
  @scala.inline
  implicit def apply(value: JsxAttribute): HasInitializer = value.asInstanceOf[HasInitializer]
}

