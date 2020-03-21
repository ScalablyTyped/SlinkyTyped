package typingsSlinky.uirouterCore.mod

import typingsSlinky.uirouterCore.transitionHookMod.GetErrorHandler
import typingsSlinky.uirouterCore.transitionHookMod.GetResultHandler
import typingsSlinky.uirouterCore.transitionInterfaceMod.PathType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "TransitionEventType")
@js.native
class TransitionEventType protected ()
  extends typingsSlinky.uirouterCore.transitionMod.TransitionEventType {
  def this(
    name: String,
    hookPhase: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType
  ) = this()
  def this(
    name: String,
    hookPhase: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean
  ) = this()
  def this(
    name: String,
    hookPhase: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler
  ) = this()
  def this(
    name: String,
    hookPhase: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler
  ) = this()
  def this(
    name: String,
    hookPhase: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler,
    synchronous: Boolean
  ) = this()
}

