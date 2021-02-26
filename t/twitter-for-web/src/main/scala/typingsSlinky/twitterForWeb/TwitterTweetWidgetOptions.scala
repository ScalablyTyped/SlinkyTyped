package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.twitterForWebStrings.all
import typingsSlinky.twitterForWeb.twitterForWebStrings.auto
import typingsSlinky.twitterForWeb.twitterForWebStrings.dark
import typingsSlinky.twitterForWeb.twitterForWebStrings.hidden
import typingsSlinky.twitterForWeb.twitterForWebStrings.light
import typingsSlinky.twitterForWeb.twitterForWebStrings.none
import typingsSlinky.twitterForWeb.twitterForWebStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for additional options for embedded Tweets.
  */
@js.native
trait TwitterTweetWidgetOptions extends TwitterWidgetOptions {
  
  /**
    * Float the embedded Tweet to the left or right so that text wraps around it, or align center so it floats in the middle of a paragraph.
    */
  var align: js.UndefOr[String] = js.native
  
  /**
    * Toggle whether to render expanded media through Twitter Cards in Tweets. Also applies to images uploaded to Twitter.
    */
  var cards: js.UndefOr[hidden | visible] = js.native
  
  /**
    * For Tweets that are replies, the previous Tweet in the thread will be displayed by default. Use none to hide the thread and show a Tweet alone.
    */
  var conversation: js.UndefOr[none | all] = js.native
  
  /**
    * Adjust the color of links inside the widget.
    */
  var linkColor: js.UndefOr[String] = js.native
  
  /**
    * Toggle the default colorscheme of the widget.
    */
  var theme: js.UndefOr[dark | light] = js.native
  
  /**
    * Fix the width of the embedded widget.
    */
  var width: js.UndefOr[Double | auto] = js.native
}
object TwitterTweetWidgetOptions {
  
  @scala.inline
  def apply(): TwitterTweetWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterTweetWidgetOptions]
  }
  
  @scala.inline
  implicit class TwitterTweetWidgetOptionsMutableBuilder[Self <: TwitterTweetWidgetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setCards(value: hidden | visible): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
    
    @scala.inline
    def setConversation(value: none | all): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationUndefined: Self = StObject.set(x, "conversation", js.undefined)
    
    @scala.inline
    def setLinkColor(value: String): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkColorUndefined: Self = StObject.set(x, "linkColor", js.undefined)
    
    @scala.inline
    def setTheme(value: dark | light): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | auto): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
