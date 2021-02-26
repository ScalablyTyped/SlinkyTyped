package typingsSlinky.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaStreamType extends StObject
@JSGlobal("Windows.Media.Capture.MediaStreamType")
@js.native
object MediaStreamType extends StObject {
  
  @js.native
  sealed trait audio extends MediaStreamType
  
  @js.native
  sealed trait photo extends MediaStreamType
  
  @js.native
  sealed trait videoPreview extends MediaStreamType
  
  @js.native
  sealed trait videoRecord extends MediaStreamType
}
