package typingsSlinky.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoOrientation extends StObject
@JSGlobal("Windows.Storage.FileProperties.PhotoOrientation")
@js.native
object PhotoOrientation extends StObject {
  
  @js.native
  sealed trait flipHorizontal extends PhotoOrientation
  
  @js.native
  sealed trait flipVertical extends PhotoOrientation
  
  @js.native
  sealed trait normal extends PhotoOrientation
  
  @js.native
  sealed trait rotate180 extends PhotoOrientation
  
  @js.native
  sealed trait rotate270 extends PhotoOrientation
  
  @js.native
  sealed trait rotate90 extends PhotoOrientation
  
  @js.native
  sealed trait transpose extends PhotoOrientation
  
  @js.native
  sealed trait transverse extends PhotoOrientation
  
  @js.native
  sealed trait unspecified extends PhotoOrientation
}
