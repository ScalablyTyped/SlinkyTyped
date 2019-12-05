package typingsSlinky.terser.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InlineFunctions extends js.Object

@JSImport("terser", "InlineFunctions")
@js.native
object InlineFunctions extends js.Object {
  @js.native
  sealed trait Disabled extends InlineFunctions
  
  @js.native
  sealed trait SimpleFunctions extends InlineFunctions
  
  @js.native
  sealed trait WithArguments extends InlineFunctions
  
  @js.native
  sealed trait WithArgumentsAndVariables extends InlineFunctions
  
  /* 0 */ val Disabled: typingsSlinky.terser.terserMod.InlineFunctions.Disabled with Double = js.native
  /* 1 */ val SimpleFunctions: typingsSlinky.terser.terserMod.InlineFunctions.SimpleFunctions with Double = js.native
  /* 2 */ val WithArguments: typingsSlinky.terser.terserMod.InlineFunctions.WithArguments with Double = js.native
  /* 3 */ val WithArgumentsAndVariables: typingsSlinky.terser.terserMod.InlineFunctions.WithArgumentsAndVariables with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InlineFunctions with Double] = js.native
}

