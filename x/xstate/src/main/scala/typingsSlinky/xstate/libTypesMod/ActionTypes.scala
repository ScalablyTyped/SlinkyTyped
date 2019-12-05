package typingsSlinky.xstate.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionTypes extends js.Object

@JSImport("xstate/lib/types", "ActionTypes")
@js.native
object ActionTypes extends js.Object {
  @js.native
  sealed trait After extends ActionTypes
  
  @js.native
  sealed trait Assign extends ActionTypes
  
  @js.native
  sealed trait Cancel extends ActionTypes
  
  @js.native
  sealed trait DoneInvoke extends ActionTypes
  
  @js.native
  sealed trait DoneState extends ActionTypes
  
  @js.native
  sealed trait ErrorCommunication extends ActionTypes
  
  @js.native
  sealed trait ErrorExecution extends ActionTypes
  
  @js.native
  sealed trait ErrorPlatform extends ActionTypes
  
  @js.native
  sealed trait Init extends ActionTypes
  
  @js.native
  sealed trait Invoke extends ActionTypes
  
  @js.native
  sealed trait Log extends ActionTypes
  
  @js.native
  sealed trait NullEvent extends ActionTypes
  
  @js.native
  sealed trait Pure extends ActionTypes
  
  @js.native
  sealed trait Raise extends ActionTypes
  
  @js.native
  sealed trait Send extends ActionTypes
  
  @js.native
  sealed trait Start extends ActionTypes
  
  @js.native
  sealed trait Stop extends ActionTypes
  
  @js.native
  sealed trait Update extends ActionTypes
  
  /* "xstate.after" */ val After: typingsSlinky.xstate.libTypesMod.ActionTypes.After with String = js.native
  /* "xstate.assign" */ val Assign: typingsSlinky.xstate.libTypesMod.ActionTypes.Assign with String = js.native
  /* "xstate.cancel" */ val Cancel: typingsSlinky.xstate.libTypesMod.ActionTypes.Cancel with String = js.native
  /* "done.invoke" */ val DoneInvoke: typingsSlinky.xstate.libTypesMod.ActionTypes.DoneInvoke with String = js.native
  /* "done.state" */ val DoneState: typingsSlinky.xstate.libTypesMod.ActionTypes.DoneState with String = js.native
  /* "error.communication" */ val ErrorCommunication: typingsSlinky.xstate.libTypesMod.ActionTypes.ErrorCommunication with String = js.native
  /* "error.execution" */ val ErrorExecution: typingsSlinky.xstate.libTypesMod.ActionTypes.ErrorExecution with String = js.native
  /* "error.platform" */ val ErrorPlatform: typingsSlinky.xstate.libTypesMod.ActionTypes.ErrorPlatform with String = js.native
  /* "xstate.init" */ val Init: typingsSlinky.xstate.libTypesMod.ActionTypes.Init with String = js.native
  /* "xstate.invoke" */ val Invoke: typingsSlinky.xstate.libTypesMod.ActionTypes.Invoke with String = js.native
  /* "xstate.log" */ val Log: typingsSlinky.xstate.libTypesMod.ActionTypes.Log with String = js.native
  /* "" */ val NullEvent: typingsSlinky.xstate.libTypesMod.ActionTypes.NullEvent with String = js.native
  /* "xstate.pure" */ val Pure: typingsSlinky.xstate.libTypesMod.ActionTypes.Pure with String = js.native
  /* "xstate.raise" */ val Raise: typingsSlinky.xstate.libTypesMod.ActionTypes.Raise with String = js.native
  /* "xstate.send" */ val Send: typingsSlinky.xstate.libTypesMod.ActionTypes.Send with String = js.native
  /* "xstate.start" */ val Start: typingsSlinky.xstate.libTypesMod.ActionTypes.Start with String = js.native
  /* "xstate.stop" */ val Stop: typingsSlinky.xstate.libTypesMod.ActionTypes.Stop with String = js.native
  /* "xstate.update" */ val Update: typingsSlinky.xstate.libTypesMod.ActionTypes.Update with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
}

