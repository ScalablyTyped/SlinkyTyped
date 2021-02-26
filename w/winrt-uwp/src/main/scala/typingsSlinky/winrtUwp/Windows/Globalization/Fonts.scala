package typingsSlinky.winrtUwp.Windows.Globalization

import typingsSlinky.winrtUwp.Windows.UI.Text.FontStretch
import typingsSlinky.winrtUwp.Windows.UI.Text.FontStyle
import typingsSlinky.winrtUwp.Windows.UI.Text.FontWeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes that allow apps to select language-appropriate and script-appropriate fonts for text display. */
object Fonts {
  
  /** Provides data related to a particular font recommendation for a given language. */
  @js.native
  trait LanguageFont extends StObject {
    
    /** Gets the family name of the font. */
    var fontFamily: String = js.native
    
    /** Gets the FontStretch property of the font. */
    var fontStretch: FontStretch = js.native
    
    /** Gets the FontStyle property of the font. */
    var fontStyle: FontStyle = js.native
    
    /** Gets the weight of the font ( FontWeight ). */
    var fontWeight: FontWeight = js.native
    
    /** Gets a recommended font size scaling factor for the font. */
    var scaleFactor: Double = js.native
  }
  object LanguageFont {
    
    @scala.inline
    def apply(
      fontFamily: String,
      fontStretch: FontStretch,
      fontStyle: FontStyle,
      fontWeight: FontWeight,
      scaleFactor: Double
    ): LanguageFont = {
      val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageFont]
    }
    
    @scala.inline
    implicit class LanguageFontMutableBuilder[Self <: LanguageFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStretch(value: FontStretch): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    }
  }
  
  /** Supplies a set of font recommendations for a given language or script for various usage cases. */
  @js.native
  trait LanguageFontGroup extends StObject {
    
    /** Gets a font that is recommended as an additional option for use in documents beyond the recommendations provided by DocumentHeadingFont , ModernDocumentFont and TraditionalDocumentFont . */
    var documentAlternate1Font: LanguageFont = js.native
    
    /** Gets a font that is recommended as an additional option for use in documents beyond the recommendations provided by DocumentHeadingFont , ModernDocumentFont and TraditionalDocumentFont . */
    var documentAlternate2Font: LanguageFont = js.native
    
    /** Gets a font that is recommended for use in document headings. */
    var documentHeadingFont: LanguageFont = js.native
    
    /** Gets a font that is recommended for displaying fixed-width characters. */
    var fixedWidthTextFont: LanguageFont = js.native
    
    /** Gets a font that is recommended for typical document body text following modern style conventions. */
    var modernDocumentFont: LanguageFont = js.native
    
    /** Gets a font that is recommended for typical document body text following traditional style conventions. */
    var traditionalDocumentFont: LanguageFont = js.native
    
    /** Gets a font that is recommended for special UI elements, such as captions, that are displayed at sizes smaller than typical UI body text. */
    var uiCaptionFont: LanguageFont = js.native
    
    /** Gets a font that is recommended for special UI elements, such as headings, that are displayed at sizes somewhat larger than typical UI body text. */
    var uiHeadingFont: LanguageFont = js.native
    
    /** Gets a font that is recommended for special UI elements, such as headings in notifications or other app messages, that are displayed at UI body text size or only slightly larger yet need to be differentiated from UI body text. */
    var uiNotificationHeadingFont: LanguageFont = js.native
    
    /** Gets a font that is recommended for typical UI body text. */
    var uiTextFont: LanguageFont = js.native
    
    /** Gets a font that is recommended for special UI elements set at sizes much larger than typical UI body text. */
    var uiTitleFont: LanguageFont = js.native
  }
  object LanguageFontGroup {
    
    @scala.inline
    def apply(
      documentAlternate1Font: LanguageFont,
      documentAlternate2Font: LanguageFont,
      documentHeadingFont: LanguageFont,
      fixedWidthTextFont: LanguageFont,
      modernDocumentFont: LanguageFont,
      traditionalDocumentFont: LanguageFont,
      uiCaptionFont: LanguageFont,
      uiHeadingFont: LanguageFont,
      uiNotificationHeadingFont: LanguageFont,
      uiTextFont: LanguageFont,
      uiTitleFont: LanguageFont
    ): LanguageFontGroup = {
      val __obj = js.Dynamic.literal(documentAlternate1Font = documentAlternate1Font.asInstanceOf[js.Any], documentAlternate2Font = documentAlternate2Font.asInstanceOf[js.Any], documentHeadingFont = documentHeadingFont.asInstanceOf[js.Any], fixedWidthTextFont = fixedWidthTextFont.asInstanceOf[js.Any], modernDocumentFont = modernDocumentFont.asInstanceOf[js.Any], traditionalDocumentFont = traditionalDocumentFont.asInstanceOf[js.Any], uiCaptionFont = uiCaptionFont.asInstanceOf[js.Any], uiHeadingFont = uiHeadingFont.asInstanceOf[js.Any], uiNotificationHeadingFont = uiNotificationHeadingFont.asInstanceOf[js.Any], uiTextFont = uiTextFont.asInstanceOf[js.Any], uiTitleFont = uiTitleFont.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageFontGroup]
    }
    
    @scala.inline
    implicit class LanguageFontGroupMutableBuilder[Self <: LanguageFontGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocumentAlternate1Font(value: LanguageFont): Self = StObject.set(x, "documentAlternate1Font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentAlternate2Font(value: LanguageFont): Self = StObject.set(x, "documentAlternate2Font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentHeadingFont(value: LanguageFont): Self = StObject.set(x, "documentHeadingFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedWidthTextFont(value: LanguageFont): Self = StObject.set(x, "fixedWidthTextFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModernDocumentFont(value: LanguageFont): Self = StObject.set(x, "modernDocumentFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraditionalDocumentFont(value: LanguageFont): Self = StObject.set(x, "traditionalDocumentFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiCaptionFont(value: LanguageFont): Self = StObject.set(x, "uiCaptionFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiHeadingFont(value: LanguageFont): Self = StObject.set(x, "uiHeadingFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiNotificationHeadingFont(value: LanguageFont): Self = StObject.set(x, "uiNotificationHeadingFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiTextFont(value: LanguageFont): Self = StObject.set(x, "uiTextFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiTitleFont(value: LanguageFont): Self = StObject.set(x, "uiTitleFont", value.asInstanceOf[js.Any])
    }
  }
}
