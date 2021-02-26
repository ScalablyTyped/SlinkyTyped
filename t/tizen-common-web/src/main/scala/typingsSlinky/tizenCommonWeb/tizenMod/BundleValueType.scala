package typingsSlinky.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BundleValueType extends StObject
@JSImport("tizen-common-web/tizen", "BundleValueType")
@js.native
object BundleValueType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BundleValueType with String] = js.native
  
  @js.native
  sealed trait BYTES extends BundleValueType
  /* "BYTES" */ val BYTES: typingsSlinky.tizenCommonWeb.tizenMod.BundleValueType.BYTES with String = js.native
  
  @js.native
  sealed trait BYTES_ARRAY extends BundleValueType
  /* "BYTES_ARRAY" */ val BYTES_ARRAY: typingsSlinky.tizenCommonWeb.tizenMod.BundleValueType.BYTES_ARRAY with String = js.native
  
  @js.native
  sealed trait STRING extends BundleValueType
  /* "STRING" */ val STRING: typingsSlinky.tizenCommonWeb.tizenMod.BundleValueType.STRING with String = js.native
  
  @js.native
  sealed trait STRING_ARRAY extends BundleValueType
  /* "STRING_ARRAY" */ val STRING_ARRAY: typingsSlinky.tizenCommonWeb.tizenMod.BundleValueType.STRING_ARRAY with String = js.native
}
