package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods (beyond those inherited from HTMLElement) for manipulating the layout and presentation of <output> elements. */
@js.native
trait HTMLOutputElement extends HTMLElement {
  
  def checkValidity(): scala.Boolean = js.native
  
  var defaultValue: java.lang.String = js.native
  
  val form: org.scalajs.dom.raw.HTMLFormElement | Null = js.native
  
  val htmlFor: org.scalajs.dom.raw.DOMTokenList = js.native
  
  val labels: org.scalajs.dom.raw.NodeListOf[org.scalajs.dom.raw.HTMLLabelElement with org.scalajs.dom.raw.Node] = js.native
  
  var name: java.lang.String = js.native
  
  def reportValidity(): scala.Boolean = js.native
  
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  val `type`: java.lang.String = js.native
  
  val validationMessage: java.lang.String = js.native
  
  val validity: org.scalajs.dom.raw.ValidityState = js.native
  
  var value: java.lang.String = js.native
  
  val willValidate: scala.Boolean = js.native
}
