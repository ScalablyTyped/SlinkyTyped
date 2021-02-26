package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bcc extends StObject {
  
  def getEmail(): Email = js.native
  
  def getEnable(): Boolean = js.native
  
  def setEmail(value: Email): Unit = js.native
  
  def setEnable(enabled: Boolean): Unit = js.native
  
  def toJSON(): typingsSlinky.sendgrid.anon.Email = js.native
}
object Bcc {
  
  @scala.inline
  def apply(
    getEmail: () => Email,
    getEnable: () => Boolean,
    setEmail: Email => Unit,
    setEnable: Boolean => Unit,
    toJSON: () => typingsSlinky.sendgrid.anon.Email
  ): Bcc = {
    val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getEnable = js.Any.fromFunction0(getEnable), setEmail = js.Any.fromFunction1(setEmail), setEnable = js.Any.fromFunction1(setEnable), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Bcc]
  }
  
  @scala.inline
  implicit class BccMutableBuilder[Self <: Bcc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEmail(value: () => Email): Self = StObject.set(x, "getEmail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnable(value: () => Boolean): Self = StObject.set(x, "getEnable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEmail(value: Email => Unit): Self = StObject.set(x, "setEmail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = StObject.set(x, "setEnable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => typingsSlinky.sendgrid.anon.Email): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
