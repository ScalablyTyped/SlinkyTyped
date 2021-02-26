package typingsSlinky.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterMatchFlag extends StObject
@JSImport("tizen-common-web/tizen", "FilterMatchFlag")
@js.native
object FilterMatchFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterMatchFlag with String] = js.native
  
  @js.native
  sealed trait CONTAINS extends FilterMatchFlag
  /* "CONTAINS" */ val CONTAINS: typingsSlinky.tizenCommonWeb.tizenMod.FilterMatchFlag.CONTAINS with String = js.native
  
  @js.native
  sealed trait ENDSWITH extends FilterMatchFlag
  /* "ENDSWITH" */ val ENDSWITH: typingsSlinky.tizenCommonWeb.tizenMod.FilterMatchFlag.ENDSWITH with String = js.native
  
  @js.native
  sealed trait EXACTLY extends FilterMatchFlag
  /* "EXACTLY" */ val EXACTLY: typingsSlinky.tizenCommonWeb.tizenMod.FilterMatchFlag.EXACTLY with String = js.native
  
  @js.native
  sealed trait EXISTS extends FilterMatchFlag
  /* "EXISTS" */ val EXISTS: typingsSlinky.tizenCommonWeb.tizenMod.FilterMatchFlag.EXISTS with String = js.native
  
  @js.native
  sealed trait FULLSTRING extends FilterMatchFlag
  /* "FULLSTRING" */ val FULLSTRING: typingsSlinky.tizenCommonWeb.tizenMod.FilterMatchFlag.FULLSTRING with String = js.native
  
  @js.native
  sealed trait STARTSWITH extends FilterMatchFlag
  /* "STARTSWITH" */ val STARTSWITH: typingsSlinky.tizenCommonWeb.tizenMod.FilterMatchFlag.STARTSWITH with String = js.native
}
