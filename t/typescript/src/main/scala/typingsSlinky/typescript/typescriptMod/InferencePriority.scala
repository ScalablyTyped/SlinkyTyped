package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InferencePriority extends js.Object

@JSImport("typescript", "InferencePriority")
@js.native
object InferencePriority extends js.Object {
  @js.native
  sealed trait AlwaysStrict extends InferencePriority
  
  @js.native
  sealed trait Circularity extends InferencePriority
  
  @js.native
  sealed trait HomomorphicMappedType extends InferencePriority
  
  @js.native
  sealed trait LiteralKeyof extends InferencePriority
  
  @js.native
  sealed trait MappedTypeConstraint extends InferencePriority
  
  @js.native
  sealed trait MaxValue extends InferencePriority
  
  @js.native
  sealed trait NakedTypeVariable extends InferencePriority
  
  @js.native
  sealed trait NoConstraints extends InferencePriority
  
  @js.native
  sealed trait PartialHomomorphicMappedType extends InferencePriority
  
  @js.native
  sealed trait PriorityImpliesCombination extends InferencePriority
  
  @js.native
  sealed trait ReturnType extends InferencePriority
  
  /* 128 */ val AlwaysStrict: typingsSlinky.typescript.typescriptMod.InferencePriority.AlwaysStrict with Double = js.native
  /* -1 */ val Circularity: typingsSlinky.typescript.typescriptMod.InferencePriority.Circularity with Double = js.native
  /* 2 */ val HomomorphicMappedType: typingsSlinky.typescript.typescriptMod.InferencePriority.HomomorphicMappedType with Double = js.native
  /* 32 */ val LiteralKeyof: typingsSlinky.typescript.typescriptMod.InferencePriority.LiteralKeyof with Double = js.native
  /* 8 */ val MappedTypeConstraint: typingsSlinky.typescript.typescriptMod.InferencePriority.MappedTypeConstraint with Double = js.native
  /* 256 */ val MaxValue: typingsSlinky.typescript.typescriptMod.InferencePriority.MaxValue with Double = js.native
  /* 1 */ val NakedTypeVariable: typingsSlinky.typescript.typescriptMod.InferencePriority.NakedTypeVariable with Double = js.native
  /* 64 */ val NoConstraints: typingsSlinky.typescript.typescriptMod.InferencePriority.NoConstraints with Double = js.native
  /* 4 */ val PartialHomomorphicMappedType: typingsSlinky.typescript.typescriptMod.InferencePriority.PartialHomomorphicMappedType with Double = js.native
  /* 56 */ val PriorityImpliesCombination: typingsSlinky.typescript.typescriptMod.InferencePriority.PriorityImpliesCombination with Double = js.native
  /* 16 */ val ReturnType: typingsSlinky.typescript.typescriptMod.InferencePriority.ReturnType with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InferencePriority with Double] = js.native
}

