package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionStatsAggregateType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionStatsAggregateType")
@js.native
object ExtensionStatsAggregateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStatsAggregateType with Double] = js.native
  
  @js.native
  sealed trait Daily extends ExtensionStatsAggregateType
  /* 1 */ val Daily: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionStatsAggregateType.Daily with Double = js.native
}
