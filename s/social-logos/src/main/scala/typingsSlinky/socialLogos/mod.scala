package typingsSlinky.socialLogos

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("social-logos", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  trait Props extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var icon: SocialIcon = js.native
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(icon: SocialIcon): Props = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIcon(value: SocialIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.socialLogos.socialLogosStrings.amazon
    - typingsSlinky.socialLogos.socialLogosStrings.behance
    - typingsSlinky.socialLogos.socialLogosStrings.`blogger-alt`
    - typingsSlinky.socialLogos.socialLogosStrings.blogger
    - typingsSlinky.socialLogos.socialLogosStrings.codepen
    - typingsSlinky.socialLogos.socialLogosStrings.dribbble
    - typingsSlinky.socialLogos.socialLogosStrings.dropbox
    - typingsSlinky.socialLogos.socialLogosStrings.eventbrite
    - typingsSlinky.socialLogos.socialLogosStrings.facebook
    - typingsSlinky.socialLogos.socialLogosStrings.feed
    - typingsSlinky.socialLogos.socialLogosStrings.flickr
    - typingsSlinky.socialLogos.socialLogosStrings.foursquare
    - typingsSlinky.socialLogos.socialLogosStrings.ghost
    - typingsSlinky.socialLogos.socialLogosStrings.github
    - typingsSlinky.socialLogos.socialLogosStrings.`google-alt`
    - typingsSlinky.socialLogos.socialLogosStrings.`google-plus-alt`
    - typingsSlinky.socialLogos.socialLogosStrings.`google-plus`
    - typingsSlinky.socialLogos.socialLogosStrings.google
    - typingsSlinky.socialLogos.socialLogosStrings.instagram
    - typingsSlinky.socialLogos.socialLogosStrings.linkedin
    - typingsSlinky.socialLogos.socialLogosStrings.mail
    - typingsSlinky.socialLogos.socialLogosStrings.medium
    - typingsSlinky.socialLogos.socialLogosStrings.`pinterest-alt`
    - typingsSlinky.socialLogos.socialLogosStrings.pinterest
    - typingsSlinky.socialLogos.socialLogosStrings.pocket
    - typingsSlinky.socialLogos.socialLogosStrings.polldaddy
    - typingsSlinky.socialLogos.socialLogosStrings.print
    - typingsSlinky.socialLogos.socialLogosStrings.reddit
    - typingsSlinky.socialLogos.socialLogosStrings.share
    - typingsSlinky.socialLogos.socialLogosStrings.skype
    - typingsSlinky.socialLogos.socialLogosStrings.spotify
    - typingsSlinky.socialLogos.socialLogosStrings.squarespace
    - typingsSlinky.socialLogos.socialLogosStrings.stumbleupon
    - typingsSlinky.socialLogos.socialLogosStrings.telegram
    - typingsSlinky.socialLogos.socialLogosStrings.`tumblr-alt`
    - typingsSlinky.socialLogos.socialLogosStrings.tumblr
    - typingsSlinky.socialLogos.socialLogosStrings.twitch
    - typingsSlinky.socialLogos.socialLogosStrings.`twitter-alt`
    - typingsSlinky.socialLogos.socialLogosStrings.twitter
    - typingsSlinky.socialLogos.socialLogosStrings.vimeo
    - typingsSlinky.socialLogos.socialLogosStrings.whatsapp
    - typingsSlinky.socialLogos.socialLogosStrings.woocommerce
    - typingsSlinky.socialLogos.socialLogosStrings.wordpress
    - typingsSlinky.socialLogos.socialLogosStrings.xanga
    - typingsSlinky.socialLogos.socialLogosStrings.youtube
  */
  trait SocialIcon extends StObject
  object SocialIcon {
    
    @scala.inline
    def amazon: typingsSlinky.socialLogos.socialLogosStrings.amazon = "amazon".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.amazon]
    
    @scala.inline
    def behance: typingsSlinky.socialLogos.socialLogosStrings.behance = "behance".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.behance]
    
    @scala.inline
    def blogger: typingsSlinky.socialLogos.socialLogosStrings.blogger = "blogger".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.blogger]
    
    @scala.inline
    def `blogger-alt`: typingsSlinky.socialLogos.socialLogosStrings.`blogger-alt` = "blogger-alt".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.`blogger-alt`]
    
    @scala.inline
    def codepen: typingsSlinky.socialLogos.socialLogosStrings.codepen = "codepen".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.codepen]
    
    @scala.inline
    def dribbble: typingsSlinky.socialLogos.socialLogosStrings.dribbble = "dribbble".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.dribbble]
    
    @scala.inline
    def dropbox: typingsSlinky.socialLogos.socialLogosStrings.dropbox = "dropbox".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.dropbox]
    
    @scala.inline
    def eventbrite: typingsSlinky.socialLogos.socialLogosStrings.eventbrite = "eventbrite".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.eventbrite]
    
    @scala.inline
    def facebook: typingsSlinky.socialLogos.socialLogosStrings.facebook = "facebook".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.facebook]
    
    @scala.inline
    def feed: typingsSlinky.socialLogos.socialLogosStrings.feed = "feed".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.feed]
    
    @scala.inline
    def flickr: typingsSlinky.socialLogos.socialLogosStrings.flickr = "flickr".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.flickr]
    
    @scala.inline
    def foursquare: typingsSlinky.socialLogos.socialLogosStrings.foursquare = "foursquare".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.foursquare]
    
    @scala.inline
    def ghost: typingsSlinky.socialLogos.socialLogosStrings.ghost = "ghost".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.ghost]
    
    @scala.inline
    def github: typingsSlinky.socialLogos.socialLogosStrings.github = "github".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.github]
    
    @scala.inline
    def google: typingsSlinky.socialLogos.socialLogosStrings.google = "google".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.google]
    
    @scala.inline
    def `google-alt`: typingsSlinky.socialLogos.socialLogosStrings.`google-alt` = "google-alt".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.`google-alt`]
    
    @scala.inline
    def `google-plus`: typingsSlinky.socialLogos.socialLogosStrings.`google-plus` = "google-plus".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.`google-plus`]
    
    @scala.inline
    def `google-plus-alt`: typingsSlinky.socialLogos.socialLogosStrings.`google-plus-alt` = "google-plus-alt".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.`google-plus-alt`]
    
    @scala.inline
    def instagram: typingsSlinky.socialLogos.socialLogosStrings.instagram = "instagram".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.instagram]
    
    @scala.inline
    def linkedin: typingsSlinky.socialLogos.socialLogosStrings.linkedin = "linkedin".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.linkedin]
    
    @scala.inline
    def mail: typingsSlinky.socialLogos.socialLogosStrings.mail = "mail".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.mail]
    
    @scala.inline
    def medium: typingsSlinky.socialLogos.socialLogosStrings.medium = "medium".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.medium]
    
    @scala.inline
    def pinterest: typingsSlinky.socialLogos.socialLogosStrings.pinterest = "pinterest".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.pinterest]
    
    @scala.inline
    def `pinterest-alt`: typingsSlinky.socialLogos.socialLogosStrings.`pinterest-alt` = "pinterest-alt".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.`pinterest-alt`]
    
    @scala.inline
    def pocket: typingsSlinky.socialLogos.socialLogosStrings.pocket = "pocket".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.pocket]
    
    @scala.inline
    def polldaddy: typingsSlinky.socialLogos.socialLogosStrings.polldaddy = "polldaddy".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.polldaddy]
    
    @scala.inline
    def print: typingsSlinky.socialLogos.socialLogosStrings.print = "print".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.print]
    
    @scala.inline
    def reddit: typingsSlinky.socialLogos.socialLogosStrings.reddit = "reddit".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.reddit]
    
    @scala.inline
    def share: typingsSlinky.socialLogos.socialLogosStrings.share = "share".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.share]
    
    @scala.inline
    def skype: typingsSlinky.socialLogos.socialLogosStrings.skype = "skype".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.skype]
    
    @scala.inline
    def spotify: typingsSlinky.socialLogos.socialLogosStrings.spotify = "spotify".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.spotify]
    
    @scala.inline
    def squarespace: typingsSlinky.socialLogos.socialLogosStrings.squarespace = "squarespace".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.squarespace]
    
    @scala.inline
    def stumbleupon: typingsSlinky.socialLogos.socialLogosStrings.stumbleupon = "stumbleupon".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.stumbleupon]
    
    @scala.inline
    def telegram: typingsSlinky.socialLogos.socialLogosStrings.telegram = "telegram".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.telegram]
    
    @scala.inline
    def tumblr: typingsSlinky.socialLogos.socialLogosStrings.tumblr = "tumblr".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.tumblr]
    
    @scala.inline
    def `tumblr-alt`: typingsSlinky.socialLogos.socialLogosStrings.`tumblr-alt` = "tumblr-alt".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.`tumblr-alt`]
    
    @scala.inline
    def twitch: typingsSlinky.socialLogos.socialLogosStrings.twitch = "twitch".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.twitch]
    
    @scala.inline
    def twitter: typingsSlinky.socialLogos.socialLogosStrings.twitter = "twitter".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.twitter]
    
    @scala.inline
    def `twitter-alt`: typingsSlinky.socialLogos.socialLogosStrings.`twitter-alt` = "twitter-alt".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.`twitter-alt`]
    
    @scala.inline
    def vimeo: typingsSlinky.socialLogos.socialLogosStrings.vimeo = "vimeo".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.vimeo]
    
    @scala.inline
    def whatsapp: typingsSlinky.socialLogos.socialLogosStrings.whatsapp = "whatsapp".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.whatsapp]
    
    @scala.inline
    def woocommerce: typingsSlinky.socialLogos.socialLogosStrings.woocommerce = "woocommerce".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.woocommerce]
    
    @scala.inline
    def wordpress: typingsSlinky.socialLogos.socialLogosStrings.wordpress = "wordpress".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.wordpress]
    
    @scala.inline
    def xanga: typingsSlinky.socialLogos.socialLogosStrings.xanga = "xanga".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.xanga]
    
    @scala.inline
    def youtube: typingsSlinky.socialLogos.socialLogosStrings.youtube = "youtube".asInstanceOf[typingsSlinky.socialLogos.socialLogosStrings.youtube]
  }
  
  type SocialLogo = ReactComponentClass[Props]
}
