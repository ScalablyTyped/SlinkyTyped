package typingsSlinky.typescriptDashOptional

import typingsSlinky.typescriptDashOptional.distTypesMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-optional", JSImport.Namespace)
@js.native
object typescriptDashOptionalMod extends js.Object {
  @js.native
  abstract class Optional[T] ()
    extends typingsSlinky.typescriptDashOptional.distOptionalMod.Optional[T]
  
  /* static members */
  @js.native
  object Optional extends js.Object {
    def empty[T](): typingsSlinky.typescriptDashOptional.distOptionalMod.Optional[T] = js.native
    def from[T](option: Option[T]): typingsSlinky.typescriptDashOptional.distOptionalMod.Optional[T] = js.native
    def of[T](value: T): typingsSlinky.typescriptDashOptional.distOptionalMod.Optional[T] = js.native
    def ofNonNull[T](value: T): typingsSlinky.typescriptDashOptional.distOptionalMod.Optional[T] = js.native
    def ofNullable[T](): typingsSlinky.typescriptDashOptional.distOptionalMod.Optional[T] = js.native
    def ofNullable[T](nullable: T): typingsSlinky.typescriptDashOptional.distOptionalMod.Optional[T] = js.native
  }
  
}

