package typingsSlinky.timezonecomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object javascriptMod {
  
  @js.native
  sealed trait DateFunctions extends StObject
  @JSImport("timezonecomplete/dist/lib/javascript", "DateFunctions")
  @js.native
  object DateFunctions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DateFunctions with Double] = js.native
    
    /**
      * Use the Date.getFullYear(), Date.getMonth(), ... functions.
      */
    @js.native
    sealed trait Get extends DateFunctions
    /* 0 */ val Get: typingsSlinky.timezonecomplete.javascriptMod.DateFunctions.Get with Double = js.native
    
    /**
      * Use the Date.getUTCFullYear(), Date.getUTCMonth(), ... functions.
      */
    @js.native
    sealed trait GetUTC extends DateFunctions
    /* 1 */ val GetUTC: typingsSlinky.timezonecomplete.javascriptMod.DateFunctions.GetUTC with Double = js.native
  }
}
