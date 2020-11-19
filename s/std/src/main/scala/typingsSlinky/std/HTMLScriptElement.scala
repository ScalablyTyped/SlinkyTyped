package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** HTML <script> elements expose the HTMLScriptElement interface, which provides special properties and methods for manipulating the behavior and execution of <script> elements (beyond the inherited HTMLElement interface). */
@js.native
trait HTMLScriptElement extends HTMLElement {
  
  var async: scala.Boolean = js.native
  
  /**
    * Sets or retrieves the character set used to encode the object.
    */
  /** @deprecated */
  var charset: java.lang.String = js.native
  
  var crossOrigin: java.lang.String | Null = js.native
  
  /**
    * Sets or retrieves the status of the script.
    */
  var defer: scala.Boolean = js.native
  
  /**
    * Sets or retrieves the event for which the script is written.
    */
  /** @deprecated */
  var event: java.lang.String = js.native
  
  /**
    * Sets or retrieves the object that is bound to the event script.
    */
  /** @deprecated */
  var htmlFor: java.lang.String = js.native
  
  var integrity: java.lang.String = js.native
  
  var noModule: scala.Boolean = js.native
  
  var referrerPolicy: java.lang.String = js.native
  
  /**
    * Retrieves the URL to an external file that contains the source code or data.
    */
  var src: java.lang.String = js.native
  
  /**
    * Retrieves or sets the text of the object as a string.
    */
  var text: java.lang.String = js.native
  
  /**
    * Sets or retrieves the MIME type for the associated scripting engine.
    */
  var `type`: java.lang.String = js.native
}
