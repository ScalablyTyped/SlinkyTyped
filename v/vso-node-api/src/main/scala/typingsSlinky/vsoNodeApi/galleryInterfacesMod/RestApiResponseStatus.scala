package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RestApiResponseStatus extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "RestApiResponseStatus")
@js.native
object RestApiResponseStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RestApiResponseStatus with Double] = js.native
  
  /**
    * The operation is completed.
    */
  @js.native
  sealed trait Completed extends RestApiResponseStatus
  /* 0 */ val Completed: typingsSlinky.vsoNodeApi.galleryInterfacesMod.RestApiResponseStatus.Completed with Double = js.native
  
  /**
    * The operation is failed.
    */
  @js.native
  sealed trait Failed extends RestApiResponseStatus
  /* 1 */ val Failed: typingsSlinky.vsoNodeApi.galleryInterfacesMod.RestApiResponseStatus.Failed with Double = js.native
  
  /**
    * The operation is in progress.
    */
  @js.native
  sealed trait Inprogress extends RestApiResponseStatus
  /* 2 */ val Inprogress: typingsSlinky.vsoNodeApi.galleryInterfacesMod.RestApiResponseStatus.Inprogress with Double = js.native
  
  /**
    * The operation is in skipped.
    */
  @js.native
  sealed trait Skipped extends RestApiResponseStatus
  /* 3 */ val Skipped: typingsSlinky.vsoNodeApi.galleryInterfacesMod.RestApiResponseStatus.Skipped with Double = js.native
}
