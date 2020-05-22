package typingsSlinky.winrt.global.Windows.Globalization

import typingsSlinky.winrt.Windows.UI.Text.FontStretch
import typingsSlinky.winrt.Windows.UI.Text.FontStyle
import typingsSlinky.winrt.Windows.UI.Text.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.Fonts")
@js.native
object Fonts extends js.Object {
  @js.native
  class LanguageFont ()
    extends typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFont {
    /* CompleteClass */
    override var fontFamily: String = js.native
    /* CompleteClass */
    override var fontStretch: FontStretch = js.native
    /* CompleteClass */
    override var fontStyle: FontStyle = js.native
    /* CompleteClass */
    override var fontWeight: FontWeight = js.native
    /* CompleteClass */
    override var scaleFactor: Double = js.native
  }
  
  @js.native
  class LanguageFontGroup protected ()
    extends typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFontGroup {
    def this(languageTag: String) = this()
    /* CompleteClass */
    override var documentAlternate1Font: typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var documentAlternate2Font: typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var documentHeadingFont: typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var fixedWidthTextFont: typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var modernDocumentFont: typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var traditionalDocumentFont: typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var uICaptionFont: typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var uIHeadingFont: typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var uINotificationHeadingFont: typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var uITextFont: typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var uITitleFont: typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
  }
  
}

