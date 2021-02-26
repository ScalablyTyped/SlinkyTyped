package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeneratedIdentifierFlags extends StObject
@JSImport("typescript", "GeneratedIdentifierFlags")
@js.native
object GeneratedIdentifierFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeneratedIdentifierFlags with Double] = js.native
  
  @js.native
  sealed trait AllowNameSubstitution extends GeneratedIdentifierFlags
  /* 64 */ val AllowNameSubstitution: typingsSlinky.typescript.mod.GeneratedIdentifierFlags.AllowNameSubstitution with Double = js.native
  
  @js.native
  sealed trait FileLevel extends GeneratedIdentifierFlags
  /* 32 */ val FileLevel: typingsSlinky.typescript.mod.GeneratedIdentifierFlags.FileLevel with Double = js.native
  
  @js.native
  sealed trait None extends GeneratedIdentifierFlags
  /* 0 */ val None: typingsSlinky.typescript.mod.GeneratedIdentifierFlags.None with Double = js.native
  
  @js.native
  sealed trait Optimistic extends GeneratedIdentifierFlags
  /* 16 */ val Optimistic: typingsSlinky.typescript.mod.GeneratedIdentifierFlags.Optimistic with Double = js.native
  
  @js.native
  sealed trait ReservedInNestedScopes extends GeneratedIdentifierFlags
  /* 8 */ val ReservedInNestedScopes: typingsSlinky.typescript.mod.GeneratedIdentifierFlags.ReservedInNestedScopes with Double = js.native
}
