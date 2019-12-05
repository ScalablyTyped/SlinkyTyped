package typingsSlinky.atUirouterAngularjs.atUirouterAngularjsMod

import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.PathType
import typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.GetErrorHandler
import typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.GetResultHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "TransitionEventType")
@js.native
class TransitionEventType protected ()
  extends typingsSlinky.atUirouterCore.atUirouterCoreMod.TransitionEventType {
  def this(
    name: String,
    hookPhase: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType
  ) = this()
  def this(
    name: String,
    hookPhase: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean
  ) = this()
  def this(
    name: String,
    hookPhase: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler
  ) = this()
  def this(
    name: String,
    hookPhase: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler
  ) = this()
  def this(
    name: String,
    hookPhase: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler,
    synchronous: Boolean
  ) = this()
}

