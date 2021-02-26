package typingsSlinky.typescriptOptional

import typingsSlinky.typescriptOptional.typesMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typescript-optional", "Optional")
  @js.native
  abstract class Optional[T] ()
    extends typingsSlinky.typescriptOptional.optionalMod.Optional[T]
  /* static members */
  object Optional {
    
    @JSImport("typescript-optional", "Optional.empty")
    @js.native
    def empty[T](): typingsSlinky.typescriptOptional.optionalMod.Optional[T] = js.native
    
    @JSImport("typescript-optional", "Optional.from")
    @js.native
    def from[T](option: Option[T]): typingsSlinky.typescriptOptional.optionalMod.Optional[T] = js.native
    
    @JSImport("typescript-optional", "Optional.of")
    @js.native
    def of[T](value: T): typingsSlinky.typescriptOptional.optionalMod.Optional[T] = js.native
    
    @JSImport("typescript-optional", "Optional.ofNonNull")
    @js.native
    def ofNonNull[T](value: T): typingsSlinky.typescriptOptional.optionalMod.Optional[T] = js.native
    
    @JSImport("typescript-optional", "Optional.ofNullable")
    @js.native
    def ofNullable[T](): typingsSlinky.typescriptOptional.optionalMod.Optional[T] = js.native
    @JSImport("typescript-optional", "Optional.ofNullable")
    @js.native
    def ofNullable[T](nullable: T): typingsSlinky.typescriptOptional.optionalMod.Optional[T] = js.native
  }
}
