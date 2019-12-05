package typingsSlinky.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RestApiResponseStatus extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "RestApiResponseStatus")
@js.native
object RestApiResponseStatus extends js.Object {
  /**
    * The operation is completed.
    */
  @js.native
  sealed trait Completed extends RestApiResponseStatus
  
  /**
    * The operation is failed.
    */
  @js.native
  sealed trait Failed extends RestApiResponseStatus
  
  /**
    * The operation is in progress.
    */
  @js.native
  sealed trait Inprogress extends RestApiResponseStatus
  
  /**
    * The operation is in skipped.
    */
  @js.native
  sealed trait Skipped extends RestApiResponseStatus
  
  /* 0 */ val Completed: typingsSlinky.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.RestApiResponseStatus.Completed with Double = js.native
  /* 1 */ val Failed: typingsSlinky.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.RestApiResponseStatus.Failed with Double = js.native
  /* 2 */ val Inprogress: typingsSlinky.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.RestApiResponseStatus.Inprogress with Double = js.native
  /* 3 */ val Skipped: typingsSlinky.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.RestApiResponseStatus.Skipped with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RestApiResponseStatus with Double] = js.native
}

