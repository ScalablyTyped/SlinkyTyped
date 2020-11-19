package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AssertionLevel extends js.Object
@JSGlobal("TypeScript.AssertionLevel")
@js.native
object AssertionLevel extends js.Object {
  
  @js.native
  sealed trait Aggressive extends AssertionLevel
  
  @js.native
  sealed trait None extends AssertionLevel
  
  @js.native
  sealed trait Normal extends AssertionLevel
  
  @js.native
  sealed trait VeryAggressive extends AssertionLevel
}
