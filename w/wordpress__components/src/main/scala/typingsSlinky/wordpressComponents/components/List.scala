package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.listMod.NoticeList.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @scala.inline
  def apply(notices: js.Array[typingsSlinky.wordpressComponents.listMod.NoticeList.Notice]): SharedBuilder_Props1184682843 = {
    val __props = js.Dynamic.literal(notices = notices.asInstanceOf[js.Any])
    new SharedBuilder_Props1184682843(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components/notice/list", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props1184682843 = new SharedBuilder_Props1184682843(js.Array(this.component, p.asInstanceOf[js.Any]))
}
