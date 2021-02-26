package typingsSlinky.wordpressBlockEditor.componentsMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.wordpressBlockEditor.anon.OmitPropsname
import typingsSlinky.wordpressBlockEditor.blockControlsMod.BlockControls.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockControls {
  
  @JSImport("@wordpress/block-editor/components", "BlockControls")
  @js.native
  def apply(props: Props): ReactElement = js.native
  @JSImport("@wordpress/block-editor/components", "BlockControls")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockControls.Slot")
  @js.native
  def Slot: ReactComponentClass[OmitPropsname] = js.native
  @scala.inline
  def Slot_=(x: ReactComponentClass[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
}
