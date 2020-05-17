package typingsSlinky.uirouterCore.resolveInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.uirouterCore.uirouterCoreStrings.WAIT
  - typingsSlinky.uirouterCore.uirouterCoreStrings.NOWAIT
  - typingsSlinky.uirouterCore.resolveInterfaceMod.CustomAsyncPolicy
*/
trait PolicyAsync extends js.Object

object PolicyAsync {
  @scala.inline
  def WAIT: typingsSlinky.uirouterCore.uirouterCoreStrings.WAIT = "WAIT".asInstanceOf[typingsSlinky.uirouterCore.uirouterCoreStrings.WAIT]
  @scala.inline
  def NOWAIT: typingsSlinky.uirouterCore.uirouterCoreStrings.NOWAIT = "NOWAIT".asInstanceOf[typingsSlinky.uirouterCore.uirouterCoreStrings.NOWAIT]
  @scala.inline
  implicit def apply(value: CustomAsyncPolicy): PolicyAsync = value.asInstanceOf[PolicyAsync]
}

