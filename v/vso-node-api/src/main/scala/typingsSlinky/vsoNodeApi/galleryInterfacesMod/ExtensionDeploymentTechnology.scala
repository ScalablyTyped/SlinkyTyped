package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionDeploymentTechnology extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionDeploymentTechnology")
@js.native
object ExtensionDeploymentTechnology extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionDeploymentTechnology with Double] = js.native
  
  @js.native
  sealed trait Exe extends ExtensionDeploymentTechnology
  /* 1 */ val Exe: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionDeploymentTechnology.Exe with Double = js.native
  
  @js.native
  sealed trait Msi extends ExtensionDeploymentTechnology
  /* 2 */ val Msi: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionDeploymentTechnology.Msi with Double = js.native
  
  @js.native
  sealed trait ReferralLink extends ExtensionDeploymentTechnology
  /* 4 */ val ReferralLink: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionDeploymentTechnology.ReferralLink with Double = js.native
  
  @js.native
  sealed trait Vsix extends ExtensionDeploymentTechnology
  /* 3 */ val Vsix: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionDeploymentTechnology.Vsix with Double = js.native
}
