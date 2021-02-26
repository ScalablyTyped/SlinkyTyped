package typingsSlinky.xrm.XrmEnum

import typingsSlinky.xrm.xrmStrings.email
import typingsSlinky.xrm.xrmStrings.phone
import typingsSlinky.xrm.xrmStrings.text
import typingsSlinky.xrm.xrmStrings.textarea
import typingsSlinky.xrm.xrmStrings.tickersymbol
import typingsSlinky.xrm.xrmStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constant Enum: String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
  * @see {@link Xrm.Attributes.StringAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.email
  - typingsSlinky.xrm.xrmStrings.phone
  - typingsSlinky.xrm.xrmStrings.text
  - typingsSlinky.xrm.xrmStrings.textarea
  - typingsSlinky.xrm.xrmStrings.tickersymbol
  - typingsSlinky.xrm.xrmStrings.url
*/
trait StringAttributeFormat extends StObject
object StringAttributeFormat {
  
  @scala.inline
  def Email: email = "email".asInstanceOf[email]
  
  @scala.inline
  def Phone: phone = "phone".asInstanceOf[phone]
  
  @scala.inline
  def Text: text = "text".asInstanceOf[text]
  
  @scala.inline
  def TextArea: textarea = "textarea".asInstanceOf[textarea]
  
  @scala.inline
  def TickerSymbol: tickersymbol = "tickersymbol".asInstanceOf[tickersymbol]
  
  @scala.inline
  def URL: url = "url".asInstanceOf[url]
}
