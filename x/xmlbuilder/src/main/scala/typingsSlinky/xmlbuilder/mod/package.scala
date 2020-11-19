package typingsSlinky.xmlbuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * A function to be called when a chunk of XML is written.
    * 
    * @param chunk - a chunk of string that was written
    * @param level - current depth of the XML tree
    */
  type OnDataCallback = js.Function2[/* chunk */ java.lang.String, /* level */ scala.Double, scala.Unit]
  
  /**
    * A function to be called when the XML doucment is completed.
    */
  type OnEndCallback = js.Function0[scala.Unit]
}
