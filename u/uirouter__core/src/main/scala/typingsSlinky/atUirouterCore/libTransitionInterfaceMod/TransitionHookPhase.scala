package typingsSlinky.atUirouterCore.libTransitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransitionHookPhase extends js.Object

@JSImport("@uirouter/core/lib/transition/interface", "TransitionHookPhase")
@js.native
object TransitionHookPhase extends js.Object {
  @js.native
  sealed trait BEFORE extends TransitionHookPhase
  
  @js.native
  sealed trait CREATE extends TransitionHookPhase
  
  @js.native
  sealed trait ERROR extends TransitionHookPhase
  
  @js.native
  sealed trait RUN extends TransitionHookPhase
  
  @js.native
  sealed trait SUCCESS extends TransitionHookPhase
  
  /* 1 */ val BEFORE: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.BEFORE with Double = js.native
  /* 0 */ val CREATE: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.CREATE with Double = js.native
  /* 4 */ val ERROR: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.ERROR with Double = js.native
  /* 2 */ val RUN: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.RUN with Double = js.native
  /* 3 */ val SUCCESS: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.SUCCESS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransitionHookPhase with Double] = js.native
}

