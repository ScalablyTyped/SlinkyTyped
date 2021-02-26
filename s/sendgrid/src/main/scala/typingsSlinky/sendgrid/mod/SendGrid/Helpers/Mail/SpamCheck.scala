package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import typingsSlinky.sendgrid.anon.Posttourl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpamCheck extends StObject {
  
  def getEnable(): Boolean = js.native
  
  def getPosttoUrl(): String = js.native
  
  def getThreshold(): Double = js.native
  
  def setEnable(enabled: Boolean): Unit = js.native
  
  def setPosttoUrl(post_to_url: String): Unit = js.native
  
  def setThreshold(threshold: Double): Unit = js.native
  
  def toJSON(): Posttourl = js.native
}
object SpamCheck {
  
  @scala.inline
  def apply(
    getEnable: () => Boolean,
    getPosttoUrl: () => String,
    getThreshold: () => Double,
    setEnable: Boolean => Unit,
    setPosttoUrl: String => Unit,
    setThreshold: Double => Unit,
    toJSON: () => Posttourl
  ): SpamCheck = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getPosttoUrl = js.Any.fromFunction0(getPosttoUrl), getThreshold = js.Any.fromFunction0(getThreshold), setEnable = js.Any.fromFunction1(setEnable), setPosttoUrl = js.Any.fromFunction1(setPosttoUrl), setThreshold = js.Any.fromFunction1(setThreshold), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[SpamCheck]
  }
  
  @scala.inline
  implicit class SpamCheckMutableBuilder[Self <: SpamCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEnable(value: () => Boolean): Self = StObject.set(x, "getEnable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosttoUrl(value: () => String): Self = StObject.set(x, "getPosttoUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetThreshold(value: () => Double): Self = StObject.set(x, "getThreshold", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = StObject.set(x, "setEnable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPosttoUrl(value: String => Unit): Self = StObject.set(x, "setPosttoUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetThreshold(value: Double => Unit): Self = StObject.set(x, "setThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => Posttourl): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
