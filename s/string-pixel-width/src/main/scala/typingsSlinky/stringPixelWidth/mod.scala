package typingsSlinky.stringPixelWidth

import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`andale mono`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`avenir next`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`comic sans ms`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`courier new`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`open sans`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`times new roman`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`trebuchet ms`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.arial
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.avenir
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.georgia
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.impact
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.tahoma
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.verdana
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.webdings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-pixel-width", JSImport.Namespace)
  @js.native
  def apply(string: String): Double = js.native
  @JSImport("string-pixel-width", JSImport.Namespace)
  @js.native
  def apply(string: String, settings: Settings): Double = js.native
  
  @js.native
  trait Settings extends StObject {
    
    var bold: js.UndefOr[Boolean] = js.native
    
    var font: js.UndefOr[
        (`andale mono`) | arial | (`avenir next`) | avenir | (`comic sans ms`) | (`courier new`) | georgia | impact | (`open sans`) | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings
      ] = js.native
    
    var italic: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setFont(
        value: (`andale mono`) | arial | (`avenir next`) | avenir | (`comic sans ms`) | (`courier new`) | georgia | impact | (`open sans`) | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings
      ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
