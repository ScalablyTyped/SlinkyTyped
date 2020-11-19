package typingsSlinky.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the XML declaration.
  */
@JSImport("xmlbuilder", "XMLDeclaration")
@js.native
class XMLDeclaration () extends js.Object {
  
  /**
    * Encoding declaration, e.g. `UTF-8`
    */
  var encoding: String = js.native
  
  /**
    * Standalone document declaration: `true` or `false`
    */
  var standalone: Boolean = js.native
  
  def toString(options: XMLToStringOptions): String = js.native
  
  /**
    * A version number string, e.g. `1.0`
    */
  var version: String = js.native
}
