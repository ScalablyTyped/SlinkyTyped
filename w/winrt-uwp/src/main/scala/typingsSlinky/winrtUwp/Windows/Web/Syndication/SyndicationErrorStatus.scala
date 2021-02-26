package typingsSlinky.winrtUwp.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyndicationErrorStatus extends StObject
/** Defines errors encountered during a Syndication operation. */
@JSGlobal("Windows.Web.Syndication.SyndicationErrorStatus")
@js.native
object SyndicationErrorStatus extends StObject {
  
  /** The provided XML is not valid. */
  @js.native
  sealed trait invalidXml extends SyndicationErrorStatus
  
  /** A required attribute is missing. */
  @js.native
  sealed trait missingRequiredAttribute extends SyndicationErrorStatus
  
  /** A required element is missing. */
  @js.native
  sealed trait missingRequiredElement extends SyndicationErrorStatus
  
  /** An unexpected error was encountered with the content. */
  @js.native
  sealed trait unexpectedContent extends SyndicationErrorStatus
  
  /** An unknown error has occurred. */
  @js.native
  sealed trait unknown extends SyndicationErrorStatus
  
  /** The content is not presented in a supported format. */
  @js.native
  sealed trait unsupportedFormat extends SyndicationErrorStatus
}
