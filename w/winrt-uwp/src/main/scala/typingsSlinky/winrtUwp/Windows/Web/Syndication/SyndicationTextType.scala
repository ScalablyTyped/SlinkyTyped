package typingsSlinky.winrtUwp.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyndicationTextType extends StObject
/** Specifies the text types supported for syndication content. */
@JSGlobal("Windows.Web.Syndication.SyndicationTextType")
@js.native
object SyndicationTextType extends StObject {
  
  /** HTML (escaped markup) */
  @js.native
  sealed trait html extends SyndicationTextType
  
  /** Plain text */
  @js.native
  sealed trait text extends SyndicationTextType
  
  /** XML (not escaped) */
  @js.native
  sealed trait xhtml extends SyndicationTextType
}
