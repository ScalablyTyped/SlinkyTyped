package typingsSlinky.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextSetOptions extends StObject
/** Specifies options for setting the text in a text range. */
@JSGlobal("Windows.UI.Text.TextSetOptions")
@js.native
object TextSetOptions extends StObject {
  
  /** Apply the RTF default settings for the document. RTF often contains document default properties. These properties are typically ignored when inserting RTF (as distinguished from opening an RTF file). */
  @js.native
  sealed trait applyRtfDocumentDefaults extends TextSetOptions
  
  /** Obey the current text limit instead of increasing the limit to fit. */
  @js.native
  sealed trait checkTextLimit extends TextSetOptions
  
  /** Treat input text as Rich Text Format (RTF) (the RTF text will be validated). */
  @js.native
  sealed trait formatRtf extends TextSetOptions
  
  /** No text setting option is specified. */
  @js.native
  sealed trait none extends TextSetOptions
  
  /** Don't insert as hidden text. */
  @js.native
  sealed trait unhide extends TextSetOptions
  
  /** Use the Unicode bidirectional algorithm. */
  @js.native
  sealed trait unicodeBidi extends TextSetOptions
  
  /** Don't include text as part of a hyperlink. */
  @js.native
  sealed trait unlink extends TextSetOptions
}
