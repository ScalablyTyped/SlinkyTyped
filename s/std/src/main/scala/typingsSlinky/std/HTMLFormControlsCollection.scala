package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A collection of HTML form control elements.  */
@js.native
trait HTMLFormControlsCollection extends HTMLCollectionBase {
  
  /**
    * Returns the item with ID or name name from the collection.
    * 
    * If there are multiple matching items, then a RadioNodeList object containing all those elements is returned.
    */
  def namedItem(name: java.lang.String): RadioNodeList | org.scalajs.dom.raw.Element | Null = js.native
}
