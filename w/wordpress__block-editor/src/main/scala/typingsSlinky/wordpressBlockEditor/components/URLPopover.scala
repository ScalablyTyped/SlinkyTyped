package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.mod.URLPopover.^
import typingsSlinky.wordpressBlockEditor.urlPopoverMod.URLPopover.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object URLPopover {
  @JSImport("@wordpress/block-editor", "URLPopover")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1003848311[^] = new SharedBuilder_Props_1003848311[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: URLPopover.type): SharedBuilder_Props_1003848311[^] = new SharedBuilder_Props_1003848311[^](js.Array(this.component, js.Dictionary.empty))()
}

object UrlPopover {
  @JSImport("@wordpress/block-editor/components/url-popover", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1003848311[typingsSlinky.wordpressBlockEditor.urlPopoverMod.default.^] = new SharedBuilder_Props_1003848311[typingsSlinky.wordpressBlockEditor.urlPopoverMod.default.^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: UrlPopover.type): SharedBuilder_Props_1003848311[typingsSlinky.wordpressBlockEditor.urlPopoverMod.default.^] = new SharedBuilder_Props_1003848311[typingsSlinky.wordpressBlockEditor.urlPopoverMod.default.^](js.Array(this.component, js.Dictionary.empty))()
}

