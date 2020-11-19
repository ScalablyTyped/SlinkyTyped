package typingsSlinky.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImgContainerType extends js.Object
@JSGlobal("CUI.ImgContainerType")
@js.native
object ImgContainerType extends js.Object {
  
  @js.native
  sealed trait anchor extends ImgContainerType
  
  @js.native
  sealed trait div extends ImgContainerType
  
  @js.native
  sealed trait span extends ImgContainerType
}
