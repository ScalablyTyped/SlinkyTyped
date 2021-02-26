package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.wixUiIconsCommon.moveMod.MoveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemMoveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/Move", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MoveProps] = js.native
  
  type _To = ReactComponentClass[MoveProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemMoveMod.foo` */
  override def _to: ReactComponentClass[MoveProps] = default
}
