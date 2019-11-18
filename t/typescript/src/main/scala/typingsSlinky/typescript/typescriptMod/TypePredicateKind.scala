package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypePredicateKind extends js.Object

@JSImport("typescript", "TypePredicateKind")
@js.native
object TypePredicateKind extends js.Object {
  @js.native
  sealed trait AssertsIdentifier extends TypePredicateKind
  
  @js.native
  sealed trait AssertsThis extends TypePredicateKind
  
  @js.native
  sealed trait Identifier extends TypePredicateKind
  
  @js.native
  sealed trait This extends TypePredicateKind
  
  /* 3 */ val AssertsIdentifier: typingsSlinky.typescript.typescriptMod.TypePredicateKind.AssertsIdentifier with Double = js.native
  /* 2 */ val AssertsThis: typingsSlinky.typescript.typescriptMod.TypePredicateKind.AssertsThis with Double = js.native
  /* 1 */ val Identifier: typingsSlinky.typescript.typescriptMod.TypePredicateKind.Identifier with Double = js.native
  /* 0 */ val This: typingsSlinky.typescript.typescriptMod.TypePredicateKind.This with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypePredicateKind with Double] = js.native
}

