package typingsSlinky.winrtUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextGetOptions extends js.Object
/** Specifies options for retrieving the text in a document or text range. */
@JSGlobal("Windows.UI.Text.TextGetOptions")
@js.native
object TextGetOptions extends js.Object {
  
  /** If the starting character position is in the middle of a construct such as a CRLF (U+000D U+000A), surrogate pair, variation-selector sequence, or table-row delimiter, move to the beginning of the construct. */
  @js.native
  sealed trait adjustCrlf extends TextGetOptions
  
  /** Allow retrieving the final end-of-paragraph (EOP) if it’s included in the range. This EOP exists in all rich-text controls and cannot be deleted. It does not exist in plain-text controls. */
  @js.native
  sealed trait allowFinalEop extends TextGetOptions
  
  /** Retrieve Rich Text Format (RTF) instead of plain text. RTF is a BYTE (8-bit) format, but because ITextRange.GetText returns a string, the RTF is returned as WCHARs (16-bit or UTF-16), not bytes, when you call ITextRange.GetText with the FormatRtf value. When you call ITextRange.SetText with FormatRtf, the method accepts an string containing either bytes or WCHARs, but other RTF readers only understand bytes. */
  @js.native
  sealed trait formatRtf extends TextGetOptions
  
  /** Include list numbers. */
  @js.native
  sealed trait includeNumbering extends TextGetOptions
  
  /** Don't include hidden text. */
  @js.native
  sealed trait noHidden extends TextGetOptions
  
  /** None of the following options is used. */
  @js.native
  sealed trait none extends TextGetOptions
  
  /** Use CR/LF in place of a carriage return. */
  @js.native
  sealed trait useCrlf extends TextGetOptions
  
  /** Retrieve text including the alternate text for the images in the range. */
  @js.native
  sealed trait useObjectText extends TextGetOptions
}
