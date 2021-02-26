package typingsSlinky.wordpressBlockEditor.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.wordpressBlockEditor.urlPopoverMod.URLPopover.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object URLPopover {
  
  @JSImport("@wordpress/block-editor", "URLPopover")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: URLPopover.type): SharedBuilder_Props1431989495[HTMLDivElement] = new SharedBuilder_Props1431989495[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props1431989495[HTMLDivElement] = new SharedBuilder_Props1431989495[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

object UrlPopover {
  
  @JSImport("@wordpress/block-editor/components/url-popover", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: UrlPopover.type): SharedBuilder_Props1431989495[HTMLDivElement] = new SharedBuilder_Props1431989495[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props1431989495[HTMLDivElement] = new SharedBuilder_Props1431989495[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
