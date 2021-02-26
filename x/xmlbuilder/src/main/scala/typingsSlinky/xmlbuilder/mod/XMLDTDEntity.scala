package typingsSlinky.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an entity in the DTD.
  */
@JSImport("xmlbuilder", "XMLDTDEntity")
@js.native
class XMLDTDEntity () extends StObject {
  
  /**
    * Notation declaration
    */
  var nData: String = js.native
  
  /**
    * The name of the entity
    */
  var name: String = js.native
  
  /** 
    * Determines whether this is a parameter entity (`true`) or a 
    * general entity (`false`).
    */
  var pe: Boolean = js.native
  
  /**
    * Public identifier
    */
  var pubID: String = js.native
  
  /**
    * System identifier
    */
  var sysID: String = js.native
  
  def toString(options: XMLToStringOptions): String = js.native
}
