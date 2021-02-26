package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "FieldType")
@js.native
object FieldType extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[FieldType with scala.Double] = js.native
  
  @js.native
  sealed trait Boolean extends FieldType
  /* 5 */ val Boolean: typingsSlinky.vsoNodeApi.workInterfacesMod.FieldType.Boolean with scala.Double = js.native
  
  @js.native
  sealed trait DateTime extends FieldType
  /* 3 */ val DateTime: typingsSlinky.vsoNodeApi.workInterfacesMod.FieldType.DateTime with scala.Double = js.native
  
  @js.native
  sealed trait Double extends FieldType
  /* 6 */ val Double: typingsSlinky.vsoNodeApi.workInterfacesMod.FieldType.Double with scala.Double = js.native
  
  @js.native
  sealed trait Integer extends FieldType
  /* 2 */ val Integer: typingsSlinky.vsoNodeApi.workInterfacesMod.FieldType.Integer with scala.Double = js.native
  
  @js.native
  sealed trait PlainText extends FieldType
  /* 1 */ val PlainText: typingsSlinky.vsoNodeApi.workInterfacesMod.FieldType.PlainText with scala.Double = js.native
  
  @js.native
  sealed trait String extends FieldType
  /* 0 */ val String: typingsSlinky.vsoNodeApi.workInterfacesMod.FieldType.String with scala.Double = js.native
  
  @js.native
  sealed trait TreePath extends FieldType
  /* 4 */ val TreePath: typingsSlinky.vsoNodeApi.workInterfacesMod.FieldType.TreePath with scala.Double = js.native
}
