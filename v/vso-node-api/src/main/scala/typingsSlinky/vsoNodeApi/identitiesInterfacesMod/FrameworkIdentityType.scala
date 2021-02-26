package typingsSlinky.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrameworkIdentityType extends StObject
@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "FrameworkIdentityType")
@js.native
object FrameworkIdentityType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrameworkIdentityType with Double] = js.native
  
  @js.native
  sealed trait AggregateIdentity extends FrameworkIdentityType
  /* 2 */ val AggregateIdentity: typingsSlinky.vsoNodeApi.identitiesInterfacesMod.FrameworkIdentityType.AggregateIdentity with Double = js.native
  
  @js.native
  sealed trait ImportedIdentity extends FrameworkIdentityType
  /* 3 */ val ImportedIdentity: typingsSlinky.vsoNodeApi.identitiesInterfacesMod.FrameworkIdentityType.ImportedIdentity with Double = js.native
  
  @js.native
  sealed trait None extends FrameworkIdentityType
  /* 0 */ val None: typingsSlinky.vsoNodeApi.identitiesInterfacesMod.FrameworkIdentityType.None with Double = js.native
  
  @js.native
  sealed trait ServiceIdentity extends FrameworkIdentityType
  /* 1 */ val ServiceIdentity: typingsSlinky.vsoNodeApi.identitiesInterfacesMod.FrameworkIdentityType.ServiceIdentity with Double = js.native
}
