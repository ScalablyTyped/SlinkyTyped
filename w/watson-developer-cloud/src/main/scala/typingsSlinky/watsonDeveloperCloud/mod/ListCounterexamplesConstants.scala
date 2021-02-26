package typingsSlinky.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listCounterexamples` operation. */
object ListCounterexamplesConstants {
  
  @js.native
  sealed trait Sort extends StObject
  /** The attribute by which returned counterexamples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @JSImport("watson-developer-cloud/assistant/v1", "ListCounterexamplesConstants.Sort")
  @js.native
  object Sort extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    
    @js.native
    sealed trait TEXT extends Sort
    /* "text" */ val TEXT: typingsSlinky.watsonDeveloperCloud.mod.ListCounterexamplesConstants.Sort.TEXT with String = js.native
    
    @js.native
    sealed trait UPDATED extends Sort
    /* "updated" */ val UPDATED: typingsSlinky.watsonDeveloperCloud.mod.ListCounterexamplesConstants.Sort.UPDATED with String = js.native
  }
}
