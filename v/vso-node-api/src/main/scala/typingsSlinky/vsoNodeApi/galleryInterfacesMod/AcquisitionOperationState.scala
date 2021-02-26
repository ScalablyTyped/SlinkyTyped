package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AcquisitionOperationState extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "AcquisitionOperationState")
@js.native
object AcquisitionOperationState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionOperationState with Double] = js.native
  
  /**
    * Allowed to use this AcquisitionOperation
    */
  @js.native
  sealed trait Allow extends AcquisitionOperationState
  /* 1 */ val Allow: typingsSlinky.vsoNodeApi.galleryInterfacesMod.AcquisitionOperationState.Allow with Double = js.native
  
  /**
    * Operation has already been completed and is no longer available
    */
  @js.native
  sealed trait Completed extends AcquisitionOperationState
  /* 3 */ val Completed: typingsSlinky.vsoNodeApi.galleryInterfacesMod.AcquisitionOperationState.Completed with Double = js.native
  
  /**
    * Not allowed to use this AcquisitionOperation
    */
  @js.native
  sealed trait Disallow extends AcquisitionOperationState
  /* 0 */ val Disallow: typingsSlinky.vsoNodeApi.galleryInterfacesMod.AcquisitionOperationState.Disallow with Double = js.native
}
