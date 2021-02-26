package typingsSlinky.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptionEdge extends StObject
@JSImport("tizen-common-web/tvinfo", "CaptionEdge")
@js.native
object CaptionEdge extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionEdge with String] = js.native
  
  @js.native
  sealed trait CAPTION_EDGE_DEPRESSED extends CaptionEdge
  /* "CAPTION_EDGE_DEPRESSED" */ val CAPTION_EDGE_DEPRESSED: typingsSlinky.tizenCommonWeb.tvinfoMod.CaptionEdge.CAPTION_EDGE_DEPRESSED with String = js.native
  
  @js.native
  sealed trait CAPTION_EDGE_DROP_SHADOWED extends CaptionEdge
  /* "CAPTION_EDGE_DROP_SHADOWED" */ val CAPTION_EDGE_DROP_SHADOWED: typingsSlinky.tizenCommonWeb.tvinfoMod.CaptionEdge.CAPTION_EDGE_DROP_SHADOWED with String = js.native
  
  @js.native
  sealed trait CAPTION_EDGE_NONE extends CaptionEdge
  /* "CAPTION_EDGE_NONE" */ val CAPTION_EDGE_NONE: typingsSlinky.tizenCommonWeb.tvinfoMod.CaptionEdge.CAPTION_EDGE_NONE with String = js.native
  
  @js.native
  sealed trait CAPTION_EDGE_RAISED extends CaptionEdge
  /* "CAPTION_EDGE_RAISED" */ val CAPTION_EDGE_RAISED: typingsSlinky.tizenCommonWeb.tvinfoMod.CaptionEdge.CAPTION_EDGE_RAISED with String = js.native
  
  @js.native
  sealed trait CAPTION_EDGE_UNIFORM extends CaptionEdge
  /* "CAPTION_EDGE_UNIFORM" */ val CAPTION_EDGE_UNIFORM: typingsSlinky.tizenCommonWeb.tvinfoMod.CaptionEdge.CAPTION_EDGE_UNIFORM with String = js.native
}
