package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gives access to properties specific to <label> elements. It inherits methods and properties from the base HTMLElement interface. */
@js.native
trait HTMLLabelElement extends HTMLElement {
  
  val control: org.scalajs.dom.raw.HTMLElement | Null = js.native
  
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: org.scalajs.dom.raw.HTMLFormElement | Null = js.native
  
  /**
    * Sets or retrieves the object to which the given label object is assigned.
    */
  var htmlFor: java.lang.String = js.native
}
