package typingsSlinky.styleSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * For every match found your callback is invoked with:
    * - `match` object
    * - `count` The count of how many matches have been found up to this point
    */
  type StyleSearchCallback = js.Function2[
    /* match */ typingsSlinky.styleSearch.mod.StyleSearchMatch, 
    /* count */ scala.Double, 
    scala.Unit
  ]
}
