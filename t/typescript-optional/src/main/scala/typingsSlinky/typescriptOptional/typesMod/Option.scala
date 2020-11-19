package typingsSlinky.typescriptOptional.typesMod

import typingsSlinky.typescriptOptional.typescriptOptionalStrings.empty
import typingsSlinky.typescriptOptional.typescriptOptionalStrings.present
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescriptOptional.typesMod.Present[T]
  - typingsSlinky.typescriptOptional.typesMod.Empty[T]
*/
trait Option[T] extends js.Object
object Option {
  
  @scala.inline
  def Present[T](kind: present, value: T): Option[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option[T]]
  }
  
  @scala.inline
  def Empty[T](kind: empty): Option[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option[T]]
  }
}
