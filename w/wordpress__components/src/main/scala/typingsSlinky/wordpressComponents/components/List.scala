package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.listMod.NoticeList.Props
import typingsSlinky.wordpressComponents.listMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  @JSImport("@wordpress/components/notice/list", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1417199759[^] = new SharedBuilder_Props1417199759[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(notices: js.Array[typingsSlinky.wordpressComponents.listMod.NoticeList.Notice]): SharedBuilder_Props1417199759[^] = {
    val __props = js.Dynamic.literal(notices = notices.asInstanceOf[js.Any])
    new SharedBuilder_Props1417199759[^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

