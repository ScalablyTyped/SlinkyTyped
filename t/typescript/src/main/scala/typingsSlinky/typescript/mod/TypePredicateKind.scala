package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypePredicateKind extends StObject
@JSImport("typescript", "TypePredicateKind")
@js.native
object TypePredicateKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypePredicateKind with Double] = js.native
  
  @js.native
  sealed trait AssertsIdentifier extends TypePredicateKind
  /* 3 */ val AssertsIdentifier: typingsSlinky.typescript.mod.TypePredicateKind.AssertsIdentifier with Double = js.native
  
  @js.native
  sealed trait AssertsThis extends TypePredicateKind
  /* 2 */ val AssertsThis: typingsSlinky.typescript.mod.TypePredicateKind.AssertsThis with Double = js.native
  
  @js.native
  sealed trait Identifier extends TypePredicateKind
  /* 1 */ val Identifier: typingsSlinky.typescript.mod.TypePredicateKind.Identifier with Double = js.native
  
  @js.native
  sealed trait This extends TypePredicateKind
  /* 0 */ val This: typingsSlinky.typescript.mod.TypePredicateKind.This with Double = js.native
}
