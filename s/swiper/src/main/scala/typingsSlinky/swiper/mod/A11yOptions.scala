package typingsSlinky.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A11yOptions extends StObject {
  
  /**
    * Enables A11y
    *
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Message for screen readers for previous button when swiper is on first slide
    *
    * @default 'This is the first slide'
    */
  var firstSlideMessage: js.UndefOr[String] = js.native
  
  /**
    * Message for screen readers for previous button when swiper is on last slide
    *
    * @default 'This is the last slide'
    */
  var lastSlideMessage: js.UndefOr[String] = js.native
  
  /**
    * Message for screen readers for next button
    *
    * @default 'Next slide'
    */
  var nextSlideMessage: js.UndefOr[String] = js.native
  
  /**
    * CSS class name of a11 notification
    *
    * @default 'swiper-notification'
    */
  var notificationClass: js.UndefOr[String] = js.native
  
  /**
    * Message for screen readers for single pagination bullet
    *
    * @default 'Go to slide {{index}}'
    */
  var paginationBulletMessage: js.UndefOr[String] = js.native
  
  /**
    * Message for screen readers for previous button
    *
    * @default 'Previous slide'
    */
  var prevSlideMessage: js.UndefOr[String] = js.native
}
object A11yOptions {
  
  @scala.inline
  def apply(): A11yOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[A11yOptions]
  }
  
  @scala.inline
  implicit class A11yOptionsMutableBuilder[Self <: A11yOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFirstSlideMessage(value: String): Self = StObject.set(x, "firstSlideMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSlideMessageUndefined: Self = StObject.set(x, "firstSlideMessage", js.undefined)
    
    @scala.inline
    def setLastSlideMessage(value: String): Self = StObject.set(x, "lastSlideMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSlideMessageUndefined: Self = StObject.set(x, "lastSlideMessage", js.undefined)
    
    @scala.inline
    def setNextSlideMessage(value: String): Self = StObject.set(x, "nextSlideMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSlideMessageUndefined: Self = StObject.set(x, "nextSlideMessage", js.undefined)
    
    @scala.inline
    def setNotificationClass(value: String): Self = StObject.set(x, "notificationClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationClassUndefined: Self = StObject.set(x, "notificationClass", js.undefined)
    
    @scala.inline
    def setPaginationBulletMessage(value: String): Self = StObject.set(x, "paginationBulletMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationBulletMessageUndefined: Self = StObject.set(x, "paginationBulletMessage", js.undefined)
    
    @scala.inline
    def setPrevSlideMessage(value: String): Self = StObject.set(x, "prevSlideMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevSlideMessageUndefined: Self = StObject.set(x, "prevSlideMessage", js.undefined)
  }
}
