package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenFlags extends StObject
@JSImport("typescript", "TokenFlags")
@js.native
object TokenFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenFlags with Double] = js.native
  
  @js.native
  sealed trait BinarySpecifier extends TokenFlags
  /* 128 */ val BinarySpecifier: typingsSlinky.typescript.mod.TokenFlags.BinarySpecifier with Double = js.native
  
  @js.native
  sealed trait HexSpecifier extends TokenFlags
  /* 64 */ val HexSpecifier: typingsSlinky.typescript.mod.TokenFlags.HexSpecifier with Double = js.native
  
  @js.native
  sealed trait None extends TokenFlags
  /* 0 */ val None: typingsSlinky.typescript.mod.TokenFlags.None with Double = js.native
  
  @js.native
  sealed trait Octal extends TokenFlags
  /* 32 */ val Octal: typingsSlinky.typescript.mod.TokenFlags.Octal with Double = js.native
  
  @js.native
  sealed trait OctalSpecifier extends TokenFlags
  /* 256 */ val OctalSpecifier: typingsSlinky.typescript.mod.TokenFlags.OctalSpecifier with Double = js.native
  
  @js.native
  sealed trait Scientific extends TokenFlags
  /* 16 */ val Scientific: typingsSlinky.typescript.mod.TokenFlags.Scientific with Double = js.native
}
