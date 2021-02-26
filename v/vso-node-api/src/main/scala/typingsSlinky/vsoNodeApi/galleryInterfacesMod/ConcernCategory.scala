package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConcernCategory extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ConcernCategory")
@js.native
object ConcernCategory extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConcernCategory with Double] = js.native
  
  @js.native
  sealed trait Abusive extends ConcernCategory
  /* 2 */ val Abusive: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ConcernCategory.Abusive with Double = js.native
  
  @js.native
  sealed trait General extends ConcernCategory
  /* 1 */ val General: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ConcernCategory.General with Double = js.native
  
  @js.native
  sealed trait Spam extends ConcernCategory
  /* 4 */ val Spam: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ConcernCategory.Spam with Double = js.native
}
