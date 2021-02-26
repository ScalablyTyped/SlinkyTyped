package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AcquisitionAssignmentType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "AcquisitionAssignmentType")
@js.native
object AcquisitionAssignmentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionAssignmentType with Double] = js.native
  
  /**
    * Assign for all users in the account
    */
  @js.native
  sealed trait All extends AcquisitionAssignmentType
  /* 2 */ val All: typingsSlinky.vsoNodeApi.galleryInterfacesMod.AcquisitionAssignmentType.All with Double = js.native
  
  /**
    * Just assign for me
    */
  @js.native
  sealed trait Me extends AcquisitionAssignmentType
  /* 1 */ val Me: typingsSlinky.vsoNodeApi.galleryInterfacesMod.AcquisitionAssignmentType.Me with Double = js.native
  
  @js.native
  sealed trait None extends AcquisitionAssignmentType
  /* 0 */ val None: typingsSlinky.vsoNodeApi.galleryInterfacesMod.AcquisitionAssignmentType.None with Double = js.native
}
