package typingsSlinky.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Operation extends StObject
@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "Operation")
@js.native
object Operation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Operation with Double] = js.native
  
  @js.native
  sealed trait Add extends Operation
  /* 0 */ val Add: typingsSlinky.vsoNodeApi.vssinterfacesMod.Operation.Add with Double = js.native
  
  @js.native
  sealed trait Copy extends Operation
  /* 4 */ val Copy: typingsSlinky.vsoNodeApi.vssinterfacesMod.Operation.Copy with Double = js.native
  
  @js.native
  sealed trait Move extends Operation
  /* 3 */ val Move: typingsSlinky.vsoNodeApi.vssinterfacesMod.Operation.Move with Double = js.native
  
  @js.native
  sealed trait Remove extends Operation
  /* 1 */ val Remove: typingsSlinky.vsoNodeApi.vssinterfacesMod.Operation.Remove with Double = js.native
  
  @js.native
  sealed trait Replace extends Operation
  /* 2 */ val Replace: typingsSlinky.vsoNodeApi.vssinterfacesMod.Operation.Replace with Double = js.native
  
  @js.native
  sealed trait Test extends Operation
  /* 5 */ val Test: typingsSlinky.vsoNodeApi.vssinterfacesMod.Operation.Test with Double = js.native
}
