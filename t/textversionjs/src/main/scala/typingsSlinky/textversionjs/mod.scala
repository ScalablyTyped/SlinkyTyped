package typingsSlinky.textversionjs

import typingsSlinky.textversionjs.textversionjsStrings.hashify
import typingsSlinky.textversionjs.textversionjsStrings.indentation
import typingsSlinky.textversionjs.textversionjsStrings.linebreak
import typingsSlinky.textversionjs.textversionjsStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("textversionjs", JSImport.Namespace)
  @js.native
  def apply(html: String): String = js.native
  @JSImport("textversionjs", JSImport.Namespace)
  @js.native
  def apply(html: String, styleConfig: styleConfig): String = js.native
  
  type imgProcess = js.Function2[/* src */ String, /* alt */ String, String]
  
  type linkProcess = js.Function2[/* href */ String, /* linkText */ String, String]
  
  @js.native
  trait styleConfig extends StObject {
    
    var headingStyle: js.UndefOr[underline | linebreak | hashify] = js.native
    
    var imgProcess: js.UndefOr[typingsSlinky.textversionjs.mod.imgProcess] = js.native
    
    var keepNbsps: js.UndefOr[Boolean] = js.native
    
    var linkProcess: js.UndefOr[typingsSlinky.textversionjs.mod.linkProcess] = js.native
    
    var listIndentionTabs: js.UndefOr[Double] = js.native
    
    var listStyle: js.UndefOr[indentation | linebreak] = js.native
    
    var oIndentionChar: js.UndefOr[String] = js.native
    
    var uIndentionChar: js.UndefOr[String] = js.native
  }
  object styleConfig {
    
    @scala.inline
    def apply(): styleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[styleConfig]
    }
    
    @scala.inline
    implicit class styleConfigMutableBuilder[Self <: styleConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeadingStyle(value: underline | linebreak | hashify): Self = StObject.set(x, "headingStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingStyleUndefined: Self = StObject.set(x, "headingStyle", js.undefined)
      
      @scala.inline
      def setImgProcess(value: (/* src */ String, /* alt */ String) => String): Self = StObject.set(x, "imgProcess", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImgProcessUndefined: Self = StObject.set(x, "imgProcess", js.undefined)
      
      @scala.inline
      def setKeepNbsps(value: Boolean): Self = StObject.set(x, "keepNbsps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepNbspsUndefined: Self = StObject.set(x, "keepNbsps", js.undefined)
      
      @scala.inline
      def setLinkProcess(value: (/* href */ String, /* linkText */ String) => String): Self = StObject.set(x, "linkProcess", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLinkProcessUndefined: Self = StObject.set(x, "linkProcess", js.undefined)
      
      @scala.inline
      def setListIndentionTabs(value: Double): Self = StObject.set(x, "listIndentionTabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListIndentionTabsUndefined: Self = StObject.set(x, "listIndentionTabs", js.undefined)
      
      @scala.inline
      def setListStyle(value: indentation | linebreak): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      @scala.inline
      def setOIndentionChar(value: String): Self = StObject.set(x, "oIndentionChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOIndentionCharUndefined: Self = StObject.set(x, "oIndentionChar", js.undefined)
      
      @scala.inline
      def setUIndentionChar(value: String): Self = StObject.set(x, "uIndentionChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUIndentionCharUndefined: Self = StObject.set(x, "uIndentionChar", js.undefined)
    }
  }
}
