package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlowFlags extends js.Object

@JSImport("typescript", "FlowFlags")
@js.native
object FlowFlags extends js.Object {
  @js.native
  sealed trait AfterFinally extends FlowFlags
  
  @js.native
  sealed trait ArrayMutation extends FlowFlags
  
  @js.native
  sealed trait Assignment extends FlowFlags
  
  @js.native
  sealed trait BranchLabel extends FlowFlags
  
  @js.native
  sealed trait Call extends FlowFlags
  
  @js.native
  sealed trait Condition extends FlowFlags
  
  @js.native
  sealed trait FalseCondition extends FlowFlags
  
  @js.native
  sealed trait Label extends FlowFlags
  
  @js.native
  sealed trait LoopLabel extends FlowFlags
  
  @js.native
  sealed trait PreFinally extends FlowFlags
  
  @js.native
  sealed trait Referenced extends FlowFlags
  
  @js.native
  sealed trait Shared extends FlowFlags
  
  @js.native
  sealed trait Start extends FlowFlags
  
  @js.native
  sealed trait SwitchClause extends FlowFlags
  
  @js.native
  sealed trait TrueCondition extends FlowFlags
  
  @js.native
  sealed trait Unreachable extends FlowFlags
  
  /* 8192 */ val AfterFinally: typingsSlinky.typescript.typescriptMod.FlowFlags.AfterFinally with Double = js.native
  /* 256 */ val ArrayMutation: typingsSlinky.typescript.typescriptMod.FlowFlags.ArrayMutation with Double = js.native
  /* 16 */ val Assignment: typingsSlinky.typescript.typescriptMod.FlowFlags.Assignment with Double = js.native
  /* 4 */ val BranchLabel: typingsSlinky.typescript.typescriptMod.FlowFlags.BranchLabel with Double = js.native
  /* 512 */ val Call: typingsSlinky.typescript.typescriptMod.FlowFlags.Call with Double = js.native
  /* 96 */ val Condition: typingsSlinky.typescript.typescriptMod.FlowFlags.Condition with Double = js.native
  /* 64 */ val FalseCondition: typingsSlinky.typescript.typescriptMod.FlowFlags.FalseCondition with Double = js.native
  /* 12 */ val Label: typingsSlinky.typescript.typescriptMod.FlowFlags.Label with Double = js.native
  /* 8 */ val LoopLabel: typingsSlinky.typescript.typescriptMod.FlowFlags.LoopLabel with Double = js.native
  /* 4096 */ val PreFinally: typingsSlinky.typescript.typescriptMod.FlowFlags.PreFinally with Double = js.native
  /* 1024 */ val Referenced: typingsSlinky.typescript.typescriptMod.FlowFlags.Referenced with Double = js.native
  /* 2048 */ val Shared: typingsSlinky.typescript.typescriptMod.FlowFlags.Shared with Double = js.native
  /* 2 */ val Start: typingsSlinky.typescript.typescriptMod.FlowFlags.Start with Double = js.native
  /* 128 */ val SwitchClause: typingsSlinky.typescript.typescriptMod.FlowFlags.SwitchClause with Double = js.native
  /* 32 */ val TrueCondition: typingsSlinky.typescript.typescriptMod.FlowFlags.TrueCondition with Double = js.native
  /* 1 */ val Unreachable: typingsSlinky.typescript.typescriptMod.FlowFlags.Unreachable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlowFlags with Double] = js.native
}

