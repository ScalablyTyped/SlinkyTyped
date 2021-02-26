package typingsSlinky.winrtUwp.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintContent extends StObject
/** Specifies the content that HtmlPrintDocumentSource.content prints. */
@JSGlobal("Windows.UI.WebUI.PrintContent")
@js.native
object PrintContent extends StObject {
  
  /** Print all pages. */
  @js.native
  sealed trait allPages extends PrintContent
  
  /** Print the current page. */
  @js.native
  sealed trait currentPage extends PrintContent
  
  /** Print the current selection of pages. */
  @js.native
  sealed trait currentSelection extends PrintContent
  
  /** Print a custom page range. */
  @js.native
  sealed trait customPageRange extends PrintContent
}
