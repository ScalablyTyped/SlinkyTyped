package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CustomTestFieldType extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "CustomTestFieldType")
@js.native
object CustomTestFieldType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomTestFieldType with Double] = js.native
  
  @js.native
  sealed trait Bit extends CustomTestFieldType
  /* 2 */ val Bit: typingsSlinky.vsoNodeApi.testInterfacesMod.CustomTestFieldType.Bit with Double = js.native
  
  @js.native
  sealed trait DateTime extends CustomTestFieldType
  /* 4 */ val DateTime: typingsSlinky.vsoNodeApi.testInterfacesMod.CustomTestFieldType.DateTime with Double = js.native
  
  @js.native
  sealed trait Float extends CustomTestFieldType
  /* 6 */ val Float: typingsSlinky.vsoNodeApi.testInterfacesMod.CustomTestFieldType.Float with Double = js.native
  
  @js.native
  sealed trait Guid extends CustomTestFieldType
  /* 14 */ val Guid: typingsSlinky.vsoNodeApi.testInterfacesMod.CustomTestFieldType.Guid with Double = js.native
  
  @js.native
  sealed trait Int extends CustomTestFieldType
  /* 8 */ val Int: typingsSlinky.vsoNodeApi.testInterfacesMod.CustomTestFieldType.Int with Double = js.native
  
  @js.native
  sealed trait String extends CustomTestFieldType
  /* 12 */ val String: typingsSlinky.vsoNodeApi.testInterfacesMod.CustomTestFieldType.String with Double = js.native
}
