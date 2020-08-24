package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebParts")
@js.native
object WebParts extends js.Object {
  @js.native
  class LimitedWebPartManager ()
    extends typingsSlinky.sharepoint.SP.WebParts.LimitedWebPartManager
  
  @js.native
  class TileData ()
    extends typingsSlinky.sharepoint.SP.WebParts.TileData
  
  @js.native
  class WebPart ()
    extends typingsSlinky.sharepoint.SP.WebParts.WebPart
  
  @js.native
  class WebPartDefinition ()
    extends typingsSlinky.sharepoint.SP.WebParts.WebPartDefinition
  
  @js.native
  object PersonalizationScope extends js.Object {
    /* 1 */ val shared: typingsSlinky.sharepoint.SP.WebParts.PersonalizationScope.shared with Double = js.native
    /* 0 */ val user: typingsSlinky.sharepoint.SP.WebParts.PersonalizationScope.user with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.WebParts.PersonalizationScope with Double] = js.native
  }
  
}

